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
/*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NSCalendarIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCalendarIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSCalendarIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSCalendarIdentifier toObject(Class<NSCalendarIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSCalendarIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSCalendarIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSCalendarIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSCalendarIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSCalendarIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSCalendarIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSCalendarIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSCalendarIdentifier Gregorian = new NSCalendarIdentifier("Gregorian");
    public static final NSCalendarIdentifier Buddhist = new NSCalendarIdentifier("Buddhist");
    public static final NSCalendarIdentifier Chinese = new NSCalendarIdentifier("Chinese");
    public static final NSCalendarIdentifier Coptic = new NSCalendarIdentifier("Coptic");
    public static final NSCalendarIdentifier EthiopicAmeteMihret = new NSCalendarIdentifier("EthiopicAmeteMihret");
    public static final NSCalendarIdentifier EthiopicAmeteAlem = new NSCalendarIdentifier("EthiopicAmeteAlem");
    public static final NSCalendarIdentifier Hebrew = new NSCalendarIdentifier("Hebrew");
    public static final NSCalendarIdentifier ISO8601 = new NSCalendarIdentifier("ISO8601");
    public static final NSCalendarIdentifier Indian = new NSCalendarIdentifier("Indian");
    public static final NSCalendarIdentifier Islamic = new NSCalendarIdentifier("Islamic");
    public static final NSCalendarIdentifier IslamicCivil = new NSCalendarIdentifier("IslamicCivil");
    public static final NSCalendarIdentifier Japanese = new NSCalendarIdentifier("Japanese");
    public static final NSCalendarIdentifier Persian = new NSCalendarIdentifier("Persian");
    public static final NSCalendarIdentifier RepublicOfChina = new NSCalendarIdentifier("RepublicOfChina");
    public static final NSCalendarIdentifier IslamicTabular = new NSCalendarIdentifier("IslamicTabular");
    public static final NSCalendarIdentifier IslamicUmmAlQura = new NSCalendarIdentifier("IslamicUmmAlQura");
    /*</constants>*/
    
    private static /*<name>*/NSCalendarIdentifier/*</name>*/[] values = new /*<name>*/NSCalendarIdentifier/*</name>*/[] {/*<value_list>*/Gregorian, Buddhist, Chinese, Coptic, EthiopicAmeteMihret, EthiopicAmeteAlem, Hebrew, ISO8601, Indian, Islamic, IslamicCivil, Japanese, Persian, RepublicOfChina, IslamicTabular, IslamicUmmAlQura/*</value_list>*/};
    
    /*<name>*/NSCalendarIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSCalendarIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSCalendarIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSCalendarIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSCalendarIdentifierGregorian", optional=true)
        public static native NSString Gregorian();
        @GlobalValue(symbol="NSCalendarIdentifierBuddhist", optional=true)
        public static native NSString Buddhist();
        @GlobalValue(symbol="NSCalendarIdentifierChinese", optional=true)
        public static native NSString Chinese();
        @GlobalValue(symbol="NSCalendarIdentifierCoptic", optional=true)
        public static native NSString Coptic();
        @GlobalValue(symbol="NSCalendarIdentifierEthiopicAmeteMihret", optional=true)
        public static native NSString EthiopicAmeteMihret();
        @GlobalValue(symbol="NSCalendarIdentifierEthiopicAmeteAlem", optional=true)
        public static native NSString EthiopicAmeteAlem();
        @GlobalValue(symbol="NSCalendarIdentifierHebrew", optional=true)
        public static native NSString Hebrew();
        @GlobalValue(symbol="NSCalendarIdentifierISO8601", optional=true)
        public static native NSString ISO8601();
        @GlobalValue(symbol="NSCalendarIdentifierIndian", optional=true)
        public static native NSString Indian();
        @GlobalValue(symbol="NSCalendarIdentifierIslamic", optional=true)
        public static native NSString Islamic();
        @GlobalValue(symbol="NSCalendarIdentifierIslamicCivil", optional=true)
        public static native NSString IslamicCivil();
        @GlobalValue(symbol="NSCalendarIdentifierJapanese", optional=true)
        public static native NSString Japanese();
        @GlobalValue(symbol="NSCalendarIdentifierPersian", optional=true)
        public static native NSString Persian();
        @GlobalValue(symbol="NSCalendarIdentifierRepublicOfChina", optional=true)
        public static native NSString RepublicOfChina();
        @GlobalValue(symbol="NSCalendarIdentifierIslamicTabular", optional=true)
        public static native NSString IslamicTabular();
        @GlobalValue(symbol="NSCalendarIdentifierIslamicUmmAlQura", optional=true)
        public static native NSString IslamicUmmAlQura();
        /*</values>*/
    }
}
