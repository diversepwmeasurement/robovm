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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureStillImageOutput/*</name>*/ 
    extends /*<extends>*/AVCaptureOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureStillImageOutputPtr extends Ptr<AVCaptureStillImageOutput, AVCaptureStillImageOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureStillImageOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureStillImageOutput(Handle h, long handle) { super(h, handle); }
    protected AVCaptureStillImageOutput(SkipInit skipInit) { super(skipInit); }
    public AVCaptureStillImageOutput() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    public AVVideoSettings getVideoOutputSettings() {
        return new AVVideoSettings(getOutputSettings0());
    }
    public void setVideoOutputSettings(AVVideoSettings outputSettings) {
        setOutputSettings0(outputSettings.getDictionary());
    }
    @WeaklyLinked
    public AVPixelBufferAttributes getPixelBufferOutputSettings() {
        return new AVPixelBufferAttributes(getOutputSettings0().as(CFDictionary.class));
    }
    @SuppressWarnings("unchecked")
    public void setPixelBufferOutputSettings(AVPixelBufferAttributes outputSettings) {
        setOutputSettings0(outputSettings.getDictionary().as(NSDictionary.class));
    }
    /*<properties>*/
    @Property(selector = "outputSettings")
    protected native NSDictionary<NSString, ?> getOutputSettings0();
    @Property(selector = "setOutputSettings:")
    protected native void setOutputSettings0(NSDictionary<NSString, ?> v);
    @Property(selector = "availableImageDataCVPixelFormatTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(CVPixelFormatType.AsListMarshaler.class) List<CVPixelFormatType> getAvailableImageDataCVPixelFormatTypes();
    @Property(selector = "availableImageDataCodecTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(CMVideoCodecType.AsListMarshaler.class) List<CMVideoCodecType> getAvailableImageDataCodecTypes();
    @Property(selector = "isStillImageStabilizationSupported")
    public native boolean isStillImageStabilizationSupported();
    @Property(selector = "automaticallyEnablesStillImageStabilizationWhenAvailable")
    public native boolean automaticallyEnablesStillImageStabilizationWhenAvailable();
    @Property(selector = "setAutomaticallyEnablesStillImageStabilizationWhenAvailable:")
    public native void setAutomaticallyEnablesStillImageStabilizationWhenAvailable(boolean v);
    @Property(selector = "isStillImageStabilizationActive")
    public native boolean isStillImageStabilizationActive();
    @Property(selector = "isHighResolutionStillImageOutputEnabled")
    public native boolean isHighResolutionStillImageOutputEnabled();
    @Property(selector = "setHighResolutionStillImageOutputEnabled:")
    public native void setHighResolutionStillImageOutputEnabled(boolean v);
    @Property(selector = "isCapturingStillImage")
    public native boolean isCapturingStillImage();
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput maxBracketedCapturePhotoCount instead.
     */
    @Deprecated
    @Property(selector = "maxBracketedCaptureStillImageCount")
    public native @MachineSizedUInt long getMaxBracketedCaptureStillImageCount();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput lensStabilizationDuringBracketedCaptureSupported instead.
     */
    @Deprecated
    @Property(selector = "isLensStabilizationDuringBracketedCaptureSupported")
    public native boolean isLensStabilizationDuringBracketedCaptureSupported();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput with AVCapturePhotoBracketSettings instead.
     */
    @Deprecated
    @Property(selector = "isLensStabilizationDuringBracketedCaptureEnabled")
    public native boolean isLensStabilizationDuringBracketedCaptureEnabled();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput with AVCapturePhotoBracketSettings instead.
     */
    @Deprecated
    @Property(selector = "setLensStabilizationDuringBracketedCaptureEnabled:")
    public native void setLensStabilizationDuringBracketedCaptureEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "captureStillImageAsynchronouslyFromConnection:completionHandler:")
    public native void captureStillImageAsynchronously(AVCaptureConnection connection, @Block VoidBlock2<CMSampleBuffer, NSError> handler);
    @Method(selector = "new")
    protected static native @Pointer long create();
    @Method(selector = "jpegStillImageNSDataRepresentation:")
    public static native NSData createJPEGStillImageNSDataRepresentation(CMSampleBuffer jpegSampleBuffer);
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput setPreparedPhotoSettingsArray:completionHandler: instead.
     */
    @Deprecated
    @Method(selector = "prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:")
    public native void prepareToCaptureStillImageBracket(AVCaptureConnection connection, NSArray<AVCaptureBracketedStillImageSettings> settings, @Block VoidBlock2<Boolean, NSError> handler);
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput capturePhotoWithSettings:delegate: instead.
     */
    @Deprecated
    @Method(selector = "captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:")
    public native void captureStillImageBracketAsynchronously(AVCaptureConnection connection, NSArray<AVCaptureBracketedStillImageSettings> settings, @Block VoidBlock3<CMSampleBuffer, AVCaptureBracketedStillImageSettings, NSError> handler);
    /*</methods>*/
}
