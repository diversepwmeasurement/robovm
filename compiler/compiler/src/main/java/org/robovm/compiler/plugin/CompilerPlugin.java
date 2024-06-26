/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.compiler.plugin;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.robovm.compiler.Linker;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.llvm.Function;

import org.robovm.llvm.ObjectFile;
import soot.SootClass;
import soot.SootMethod;

/**
 * Plugin interface which makes it possible to hook into the compilation process
 * and modify classes and methods during the compilation.
 */
public abstract class CompilerPlugin extends Plugin {

    /**
     * Called before the {@link Config} for a compilation is built. Allows the
     * plugin to modify the compiler configuration. NOTE: Some properties of the
     * passed {@link Config} may not have been set at the time of the call to
     * this method.
     * 
     * @param builder the {@link Builder}
     * @param config the not yet built {@link Config}. Can be used to get
     *            configuration set on the {@link Builder} so far.
     */
    public abstract void beforeConfig(Builder builder, Config config) throws IOException;

    /**
     * Called just before a class is about to be compiled. Modifications to the
     * underlying {@link SootClass} ({@link Clazz#getSootClass()}) are not allowed
     * this stage. Used to allow plugins to evaluate class before modification
     *
     * @param config the current {@link Config}.
     * @param clazz the {@link Clazz} being compiled.
     */
    public void helloClass(Config config, Clazz clazz) {}

    /**
     * Called just before a class is about to be compiled. Modifications to the
     * underlying {@link SootClass} ({@link Clazz#getSootClass()}) should be
     * done at this stage.
     * 
     * @param config the current {@link Config}.
     * @param clazz the {@link Clazz} being compiled.
     * @param moduleBuilder the {@link ModuleBuilder} holding the generated
     *            bitcode.
     */
    public abstract void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder)
            throws IOException;

    /**
     * Called just before a method is about to be compiled. Modifications to the
     * underlying {@link SootMethod} should be done at this stage.
     * 
     * @param config the current {@link Config}.
     * @param clazz the {@link Clazz} being compiled.
     * @param method the method being compiled.
     * @param moduleBuilder the {@link ModuleBuilder} holding the generated
     *            bitcode.
     */
    public abstract void beforeMethod(Config config, Clazz clazz, SootMethod method,
            ModuleBuilder moduleBuilder) throws IOException;

    /**
     * Called after a class has been compiled to LLVM bitcode but before it is
     * converted into machine code.
     * 
     * @param config the current {@link Config}.
     * @param clazz the {@link Clazz} being compiled.
     * @param moduleBuilder the {@link ModuleBuilder} holding the generated
     *            bitcode.
     */
    public abstract void afterClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder)
            throws IOException;

    /**
     * Called after a method has been compiled to LLVM bitcode but before it is
     * converted into machine code.
     * 
     * @param config the current {@link Config}.
     * @param clazz the {@link Clazz} being compiled.
     * @param method the method being compiled.
     * @param moduleBuilder the {@link ModuleBuilder} holding the generated
     *            bitcode.
     * @param function the function corresponding to the method.
     */
    public abstract void afterMethod(Config config, Clazz clazz, SootMethod method,
            ModuleBuilder moduleBuilder, Function function) throws IOException;

    /**
     * Called by TrampolineCompiler when method is not resolved but this method might be added
     * by de-sugaring plugin (for ex. ByteBuffer methods are added during class compilation.
     * but next session when ByteBuffer is not processed -- other classes don't know about
     * these changes
     *
     * @param config the current {@link Config}.
     * @param sootClass to resolve method in
     * @param name      name of method
     * @param desc      its signature
     * @return          generated method
     */
    public abstract SootMethod resolveMethod(Config config, SootClass sootClass, String name, String desc);

    /**
     * Called after dependencies resolved and added to the list. It is the moment when all work with
     * clazz is finished (machine code generation pending) and all associated resources might be released
     *
     * @param config the current {@link Config}
     * @param clazz the {@link Clazz} being compiled
     */
    public abstract void afterClassDependenciesResolved(Config config, Clazz clazz);

    /**
     * Called after the object file of a class has been compiled to an object
     * file.
     * 
     * @param config the current {@link Config}
     * @param clazz the {@link Clazz} being compiled
     * @param objectFile the object file
     * @param objectFileData LLVM read object file data
     */
    public abstract void afterObjectFile(Config config, Clazz clazz, File objectFile, ObjectFile objectFileData) throws IOException;

    /**
     * Called just before {@link Linker} is invoked.
     * 
     * @param config the current {@link Config}
     * @param linker the {@link Linker} instance.
     * @param classes the classes that will be linked.
     */
    public abstract void beforeLinker(Config config, Linker linker, Set<Clazz> classes) throws IOException;

    /**
     * Called just before {@link Linker} is invoked.
     *
     * @param config the current {@link Config}
     * @param executable the binary
     */
    public abstract void afterLinker(Config config, File executable) throws IOException;
}
