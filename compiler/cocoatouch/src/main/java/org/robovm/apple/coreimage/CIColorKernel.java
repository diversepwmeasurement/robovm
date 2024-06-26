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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIColorKernel/*</name>*/ 
    extends /*<extends>*/CIKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIColorKernelPtr extends Ptr<CIColorKernel, CIColorKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIColorKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIColorKernel() {}
    protected CIColorKernel(Handle h, long handle) { super(h, handle); }
    protected CIColorKernel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "applyWithExtent:arguments:")
    public native CIImage apply(@ByVal CGRect extent, NSArray<?> args);
    /**
     * @deprecated Deprecated in iOS 12.0. Core Image Kernel Language API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "kernelsWithString:")
    public static native NSArray<CIKernel> createKernels(String string);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static NSArray<CIKernel> kernelsWithMetalString(String source) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<CIKernel> result = kernelsWithMetalString(source, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "kernelsWithMetalString:error:")
    private static native NSArray<CIKernel> kernelsWithMetalString(String source, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static CIColorKernel create(String name, NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CIColorKernel result = create(name, data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "kernelWithFunctionName:fromMetalLibraryData:error:")
    private static native CIColorKernel create(String name, NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static CIColorKernel create(String name, NSData data, int format) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CIColorKernel result = create(name, data, format, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "kernelWithFunctionName:fromMetalLibraryData:outputPixelFormat:error:")
    private static native CIColorKernel create(String name, NSData data, int format, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "kernelNamesFromMetalLibraryData:")
    public static native NSArray<NSString> getKernelNamesFromMetalLibraryData(NSData data);
    /*</methods>*/
}
