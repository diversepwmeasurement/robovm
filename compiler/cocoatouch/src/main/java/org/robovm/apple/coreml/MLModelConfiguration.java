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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModelConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MLModelConfigurationPtr extends Ptr<MLModelConfiguration, MLModelConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLModelConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLModelConfiguration() {}
    protected MLModelConfiguration(Handle h, long handle) { super(h, handle); }
    protected MLModelConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MLModelConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "modelDisplayName")
    public native String getModelDisplayName();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setModelDisplayName:")
    public native void setModelDisplayName(String v);
    @Property(selector = "computeUnits")
    public native MLComputeUnits getComputeUnits();
    @Property(selector = "setComputeUnits:")
    public native void setComputeUnits(MLComputeUnits v);
    @Property(selector = "allowLowPrecisionAccumulationOnGPU")
    public native boolean isAllowLowPrecisionAccumulationOnGPU();
    @Property(selector = "setAllowLowPrecisionAccumulationOnGPU:")
    public native void setAllowLowPrecisionAccumulationOnGPU(boolean v);
    @Property(selector = "preferredMetalDevice")
    public native MTLDevice getPreferredMetalDevice();
    @Property(selector = "setPreferredMetalDevice:")
    public native void setPreferredMetalDevice(MTLDevice v);
    @Property(selector = "parameters")
    public native NSDictionary<MLParameterKey, ?> getParameters();
    @Property(selector = "setParameters:")
    public native void setParameters(NSDictionary<MLParameterKey, ?> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
