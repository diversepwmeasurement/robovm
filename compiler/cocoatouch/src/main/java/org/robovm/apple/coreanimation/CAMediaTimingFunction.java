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
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAMediaTimingFunction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CAMediaTimingFunctionPtr extends Ptr<CAMediaTimingFunction, CAMediaTimingFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAMediaTimingFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAMediaTimingFunction() {}
    protected CAMediaTimingFunction(Handle h, long handle) { super(h, handle); }
    protected CAMediaTimingFunction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithControlPoints::::")
    public CAMediaTimingFunction(float c1x, float c1y, float c2x, float c2y) { super((SkipInit) null); initObject(init(c1x, c1y, c2x, c2y)); }
    public CAMediaTimingFunction(CAMediaTimingFunctionName name) { super((Handle) null, create(name)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public CAMediaTimingFunction(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    public float getControlPoint(@MachineSizedUInt long idx) {
        FloatPtr ptr = new FloatPtr();
        getControlPoint(idx, ptr);
        return ptr.get();
    }
    /*<methods>*/
    @Method(selector = "initWithControlPoints::::")
    protected native @Pointer long init(float c1x, float c1y, float c2x, float c2y);
    @Method(selector = "getControlPointAtIndex:values:")
    protected native void getControlPoint(@MachineSizedUInt long idx, FloatPtr ptr);
    @Method(selector = "functionWithName:")
    protected static native @Pointer long create(CAMediaTimingFunctionName name);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
