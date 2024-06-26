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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSStringExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSStringExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSStringExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sizeWithAttributes:")
    public static native @ByVal CGSize getSize(@Pointer long thiz, NSDictionary<NSString, ?> attrs);
    @Method(selector = "drawAtPoint:withAttributes:")
    public static native void draw(@Pointer long thiz, @ByVal CGPoint point, NSDictionary<NSString, ?> attrs);
    @Method(selector = "drawInRect:withAttributes:")
    public static native void draw(@Pointer long thiz, @ByVal CGRect rect, NSDictionary<NSString, ?> attrs);
    @Method(selector = "drawWithRect:options:attributes:context:")
    public static native void draw(@Pointer long thiz, @ByVal CGRect rect, NSStringDrawingOptions options, NSDictionary<NSString, ?> attributes, NSStringDrawingContext context);
    @Method(selector = "boundingRectWithSize:options:attributes:context:")
    public static native @ByVal CGRect getBoundingRect(@Pointer long thiz, @ByVal CGSize size, NSStringDrawingOptions options, NSDictionary<NSString, ?> attributes, NSStringDrawingContext context);
    /**
     * @deprecated Deprecated in iOS 7.0. Use sizeWithAttributes:
     */
    @Deprecated
    @Method(selector = "sizeWithFont:")
    public static native @ByVal CGSize getSize(@Pointer long thiz, UIFont font);
    /**
     * @deprecated Deprecated in iOS 7.0. Use boundingRectWithSize:options:attributes:context:
     */
    @Deprecated
    @Method(selector = "sizeWithFont:forWidth:lineBreakMode:")
    public static native @ByVal CGSize getSize(@Pointer long thiz, UIFont font, @MachineSizedFloat double width, NSLineBreakMode lineBreakMode);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawAtPoint:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawAtPoint:withFont:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGPoint point, UIFont font);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawInRect:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawAtPoint:forWidth:withFont:lineBreakMode:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGPoint point, @MachineSizedFloat double width, UIFont font, NSLineBreakMode lineBreakMode);
    /**
     * @deprecated Deprecated in iOS 7.0. Use boundingRectWithSize:options:attributes:context:
     */
    @Deprecated
    @Method(selector = "sizeWithFont:constrainedToSize:")
    public static native @ByVal CGSize getSize(@Pointer long thiz, UIFont font, @ByVal CGSize size);
    /**
     * @deprecated Deprecated in iOS 7.0. Use boundingRectWithSize:options:attributes:context:
     */
    @Deprecated
    @Method(selector = "sizeWithFont:constrainedToSize:lineBreakMode:")
    public static native @ByVal CGSize getSize(@Pointer long thiz, UIFont font, @ByVal CGSize size, NSLineBreakMode lineBreakMode);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawInRect:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawInRect:withFont:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGRect rect, UIFont font);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawInRect:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawInRect:withFont:lineBreakMode:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGRect rect, UIFont font, NSLineBreakMode lineBreakMode);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawInRect:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawInRect:withFont:lineBreakMode:alignment:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGRect rect, UIFont font, NSLineBreakMode lineBreakMode, NSTextAlignment alignment);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    public static native @ByVal CGSize getSize(@Pointer long thiz, UIFont font, @MachineSizedFloat double minFontSize, MachineSizedFloatPtr actualFontSize, @MachineSizedFloat double width, NSLineBreakMode lineBreakMode);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawInRect:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double fontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment);
    /**
     * @deprecated Deprecated in iOS 7.0. Use drawInRect:withAttributes:
     */
    @Deprecated
    @Method(selector = "drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    public static native @ByVal CGSize draw(@Pointer long thiz, @ByVal CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double minFontSize, MachineSizedFloatPtr actualFontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment);
    /*</methods>*/
}
