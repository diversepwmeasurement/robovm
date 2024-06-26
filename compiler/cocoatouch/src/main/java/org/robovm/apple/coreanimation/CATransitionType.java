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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CATransitionType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CATransitionType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CATransitionType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CATransitionType toObject(Class<CATransitionType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CATransitionType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CATransitionType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CATransitionType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CATransitionType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CATransitionType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CATransitionType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CATransitionType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CATransitionType Fade = new CATransitionType("Fade");
    public static final CATransitionType MoveIn = new CATransitionType("MoveIn");
    public static final CATransitionType Push = new CATransitionType("Push");
    public static final CATransitionType Reveal = new CATransitionType("Reveal");
    /*</constants>*/
    
    private static /*<name>*/CATransitionType/*</name>*/[] values = new /*<name>*/CATransitionType/*</name>*/[] {/*<value_list>*/Fade, MoveIn, Push, Reveal/*</value_list>*/};
    
    /*<name>*/CATransitionType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CATransitionType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CATransitionType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CATransitionType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("QuartzCore") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCATransitionFade", optional=true)
        public static native NSString Fade();
        @GlobalValue(symbol="kCATransitionMoveIn", optional=true)
        public static native NSString MoveIn();
        @GlobalValue(symbol="kCATransitionPush", optional=true)
        public static native NSString Push();
        @GlobalValue(symbol="kCATransitionReveal", optional=true)
        public static native NSString Reveal();
        /*</values>*/
    }
}
