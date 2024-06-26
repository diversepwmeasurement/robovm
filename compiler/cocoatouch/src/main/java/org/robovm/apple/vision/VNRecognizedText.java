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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRecognizedText/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, VNRequestRevisionProviding/*</implements>*/ {

    /*<ptr>*/public static class VNRecognizedTextPtr extends Ptr<VNRecognizedText, VNRecognizedTextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNRecognizedText.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNRecognizedText() {}
    protected VNRecognizedText(Handle h, long handle) { super(h, handle); }
    protected VNRecognizedText(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public VNRecognizedText(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "confidence")
    public native float getConfidence();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "requestRevision")
    public native @MachineSizedUInt long getRequestRevision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public VNRectangleObservation getBoundingBoxForRange(@ByVal NSRange range) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNRectangleObservation result = getBoundingBoxForRange(range, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "boundingBoxForRange:error:")
    private native VNRectangleObservation getBoundingBoxForRange(@ByVal NSRange range, NSError.NSErrorPtr error);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
