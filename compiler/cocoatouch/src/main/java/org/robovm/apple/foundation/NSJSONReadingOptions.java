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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSJSONReadingOptions/*</name>*/ extends Bits</*<name>*/NSJSONReadingOptions/*</name>*/> {
    /*<values>*/
    public static final NSJSONReadingOptions None = new NSJSONReadingOptions(0L);
    public static final NSJSONReadingOptions MutableContainers = new NSJSONReadingOptions(1L);
    public static final NSJSONReadingOptions MutableLeaves = new NSJSONReadingOptions(2L);
    public static final NSJSONReadingOptions FragmentsAllowed = new NSJSONReadingOptions(4L);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final NSJSONReadingOptions JSON5Allowed = new NSJSONReadingOptions(8L);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final NSJSONReadingOptions TopLevelDictionaryAssumed = new NSJSONReadingOptions(16L);
    /**
     * @deprecated Use NSJSONReadingFragmentsAllowed
     */
    @Deprecated
    public static final NSJSONReadingOptions AllowFragments = new NSJSONReadingOptions(4L);
    /*</values>*/

    private static final /*<name>*/NSJSONReadingOptions/*</name>*/[] values = _values(/*<name>*/NSJSONReadingOptions/*</name>*/.class);

    public /*<name>*/NSJSONReadingOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSJSONReadingOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSJSONReadingOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSJSONReadingOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSJSONReadingOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSJSONReadingOptions/*</name>*/[] values() {
        return values.clone();
    }
}
