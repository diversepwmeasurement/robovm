/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.mediaaccessibility;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MACaptionAppearanceFontStyle/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Default(0L),
    MonospacedWithSerif(1L),
    ProportionalWithSerif(2L),
    MonospacedWithoutSerif(3L),
    ProportionalWithoutSerif(4L),
    Casual(5L),
    Cursive(6L),
    SmallCapital(7L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MACaptionAppearanceFontStyle/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MACaptionAppearanceFontStyle/*</name>*/ valueOf(long n) {
        for (/*<name>*/MACaptionAppearanceFontStyle/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MACaptionAppearanceFontStyle/*</name>*/.class.getName());
    }
}
