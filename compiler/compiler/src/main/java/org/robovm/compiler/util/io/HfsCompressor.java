/*
 * Copyright (C) 2012 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.util.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.robovm.compiler.CompilerException;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;

/**
 * Takes a file and compresses it via the <code>libhfscompressor.dylib</code> in
 * <code>robovm/bin</code>. Used on object files.</p>
 * <p>
 * Compression can be disabled completely by setting the <code>ROBOVM_DISABLE_COMPRESSION</code>
 * environment variable.
 */
public class HfsCompressor {
    private static volatile boolean isAvailable;
    private static volatile boolean isLoaded;

    private static synchronized void loadLib(Config config) {
        if (isLoaded)
            return;
        if (System.getenv("ROBOVM_DISABLE_COMPRESSION") != null) {
            isLoaded = true;
            return;
        }

        String archProp = System.getProperty("os.arch").toLowerCase();
        String arch;
        if (archProp.matches("amd64|x86[-_]64")) {
            arch = "x86_64";
        } else if (archProp.matches("aarch64|arm64")) {
            arch = "arm64";
        } else {
            arch = null;
        }

        if (arch != null) {
            String hfscompressorLib = new File(config.getHome().getBinDir(), "libhfscompressor-" +
                    arch + ".dylib").getAbsolutePath();
            try {
                System.load(hfscompressorLib);
                isAvailable = true;
            } catch (Throwable t) {
                config.getLogger().error("Failed to load %s", hfscompressorLib);
            }
        }

        isLoaded = true;
    }

    /**
     * Writes the given data to the file, trying to compress it
     * via HFS+ compression on Mac OS X. Simply writes the data
     * to the file on other systems.
     */
    public void compress(File file, byte[] data, Config config) throws IOException, InterruptedException {
        if (OS.getDefaultOS() == OS.macosx)
            loadLib(config);

        if (isAvailable) {
            if (!file.getParentFile().exists()) {
                if (!file.getParentFile().mkdirs()) {
                    throw new CompilerException("Couldn't create directory for " + file.getAbsolutePath());
                }
            }
            loadLib(config);
            if (!compressNative(file.getAbsolutePath(), data, data.length)) {
                config.getLogger().debug("Couldn't compress file %s", file.getAbsolutePath());
                FileUtils.writeByteArrayToFile(file, data);
            }
        } else {
            FileUtils.writeByteArrayToFile(file, data);
        }
    }

    public static native boolean compressNative(String fileName, byte[] data, int len);
}
