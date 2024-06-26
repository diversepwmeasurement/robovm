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
package org.robovm.compiler.llvm;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.Set;

/**
 *
 * @version $Id$
 */
public class Ret extends Instruction {
    private final Value value;

    public Ret() {
        this.value = null;
    }
    
    public Ret(Value value) {
        this.value = value;
    }
    
    @Override
    public Set<VariableRef> getReadsFrom() {
        if (value instanceof VariableRef) {
            return Collections.singleton((VariableRef) value);
        }
        return super.getReadsFrom();
    }
    
    @Override
    public void write(Writer writer) throws IOException {
        if (value != null) {
            writer.write("ret ");
            value.getType().write(writer);
            writer.write(' ');
            value.write(writer);
        } else {
            writer.write("ret void");
        }
    }

    @Override
    public String toString() {
        return toString(this::write);
    }
}
