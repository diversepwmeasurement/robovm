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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CMTextMarkupAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMTextMarkupAttribute/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CMTextMarkupAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CMTextMarkupAttribute toObject(Class<CMTextMarkupAttribute> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CMTextMarkupAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CMTextMarkupAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CMTextMarkupAttribute> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMTextMarkupAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CMTextMarkupAttribute.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMTextMarkupAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CMTextMarkupAttribute o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CMTextMarkupAttribute ForegroundColorARGB = new CMTextMarkupAttribute("ForegroundColorARGB");
    public static final CMTextMarkupAttribute BackgroundColorARGB = new CMTextMarkupAttribute("BackgroundColorARGB");
    public static final CMTextMarkupAttribute CharacterBackgroundColorARGB = new CMTextMarkupAttribute("CharacterBackgroundColorARGB");
    public static final CMTextMarkupAttribute BoldStyle = new CMTextMarkupAttribute("BoldStyle");
    public static final CMTextMarkupAttribute ItalicStyle = new CMTextMarkupAttribute("ItalicStyle");
    public static final CMTextMarkupAttribute UnderlineStyle = new CMTextMarkupAttribute("UnderlineStyle");
    public static final CMTextMarkupAttribute FontFamilyName = new CMTextMarkupAttribute("FontFamilyName");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final CMTextMarkupAttribute FontFamilyNameList = new CMTextMarkupAttribute("FontFamilyNameList");
    public static final CMTextMarkupAttribute GenericFontFamilyName = new CMTextMarkupAttribute("GenericFontFamilyName");
    public static final CMTextMarkupAttribute BaseFontSizePercentageRelativeToVideoHeight = new CMTextMarkupAttribute("BaseFontSizePercentageRelativeToVideoHeight");
    public static final CMTextMarkupAttribute RelativeFontSize = new CMTextMarkupAttribute("RelativeFontSize");
    public static final CMTextMarkupAttribute VerticalLayout = new CMTextMarkupAttribute("VerticalLayout");
    public static final CMTextMarkupAttribute Alignment = new CMTextMarkupAttribute("Alignment");
    public static final CMTextMarkupAttribute TextPositionPercentageRelativeToWritingDirection = new CMTextMarkupAttribute("TextPositionPercentageRelativeToWritingDirection");
    public static final CMTextMarkupAttribute OrthogonalLinePositionPercentageRelativeToWritingDirection = new CMTextMarkupAttribute("OrthogonalLinePositionPercentageRelativeToWritingDirection");
    public static final CMTextMarkupAttribute WritingDirectionSizePercentage = new CMTextMarkupAttribute("WritingDirectionSizePercentage");
    public static final CMTextMarkupAttribute CharacterEdgeStyle = new CMTextMarkupAttribute("CharacterEdgeStyle");
    /*</constants>*/
    
    private static /*<name>*/CMTextMarkupAttribute/*</name>*/[] values = new /*<name>*/CMTextMarkupAttribute/*</name>*/[] {/*<value_list>*/ForegroundColorARGB, BackgroundColorARGB, CharacterBackgroundColorARGB, BoldStyle, ItalicStyle, UnderlineStyle, FontFamilyName, FontFamilyNameList, GenericFontFamilyName, BaseFontSizePercentageRelativeToVideoHeight, RelativeFontSize, VerticalLayout, Alignment, TextPositionPercentageRelativeToWritingDirection, OrthogonalLinePositionPercentageRelativeToWritingDirection, WritingDirectionSizePercentage, CharacterEdgeStyle/*</value_list>*/};
    
    /*<name>*/CMTextMarkupAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CMTextMarkupAttribute/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CMTextMarkupAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CMTextMarkupAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreMedia") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCMTextMarkupAttribute_ForegroundColorARGB", optional=true)
        public static native CFString ForegroundColorARGB();
        @GlobalValue(symbol="kCMTextMarkupAttribute_BackgroundColorARGB", optional=true)
        public static native CFString BackgroundColorARGB();
        @GlobalValue(symbol="kCMTextMarkupAttribute_CharacterBackgroundColorARGB", optional=true)
        public static native CFString CharacterBackgroundColorARGB();
        @GlobalValue(symbol="kCMTextMarkupAttribute_BoldStyle", optional=true)
        public static native CFString BoldStyle();
        @GlobalValue(symbol="kCMTextMarkupAttribute_ItalicStyle", optional=true)
        public static native CFString ItalicStyle();
        @GlobalValue(symbol="kCMTextMarkupAttribute_UnderlineStyle", optional=true)
        public static native CFString UnderlineStyle();
        @GlobalValue(symbol="kCMTextMarkupAttribute_FontFamilyName", optional=true)
        public static native CFString FontFamilyName();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kCMTextMarkupAttribute_FontFamilyNameList", optional=true)
        public static native CFString FontFamilyNameList();
        @GlobalValue(symbol="kCMTextMarkupAttribute_GenericFontFamilyName", optional=true)
        public static native CFString GenericFontFamilyName();
        @GlobalValue(symbol="kCMTextMarkupAttribute_BaseFontSizePercentageRelativeToVideoHeight", optional=true)
        public static native CFString BaseFontSizePercentageRelativeToVideoHeight();
        @GlobalValue(symbol="kCMTextMarkupAttribute_RelativeFontSize", optional=true)
        public static native CFString RelativeFontSize();
        @GlobalValue(symbol="kCMTextMarkupAttribute_VerticalLayout", optional=true)
        public static native CFString VerticalLayout();
        @GlobalValue(symbol="kCMTextMarkupAttribute_Alignment", optional=true)
        public static native CFString Alignment();
        @GlobalValue(symbol="kCMTextMarkupAttribute_TextPositionPercentageRelativeToWritingDirection", optional=true)
        public static native CFString TextPositionPercentageRelativeToWritingDirection();
        @GlobalValue(symbol="kCMTextMarkupAttribute_OrthogonalLinePositionPercentageRelativeToWritingDirection", optional=true)
        public static native CFString OrthogonalLinePositionPercentageRelativeToWritingDirection();
        @GlobalValue(symbol="kCMTextMarkupAttribute_WritingDirectionSizePercentage", optional=true)
        public static native CFString WritingDirectionSizePercentage();
        @GlobalValue(symbol="kCMTextMarkupAttribute_CharacterEdgeStyle", optional=true)
        public static native CFString CharacterEdgeStyle();
        /*</values>*/
    }
}
