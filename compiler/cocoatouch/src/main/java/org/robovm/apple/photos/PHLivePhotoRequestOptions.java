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
package org.robovm.apple.photos;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHLivePhotoRequestOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHLivePhotoRequestOptionsPtr extends Ptr<PHLivePhotoRequestOptions, PHLivePhotoRequestOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHLivePhotoRequestOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHLivePhotoRequestOptions() {}
    protected PHLivePhotoRequestOptions(Handle h, long handle) { super(h, handle); }
    protected PHLivePhotoRequestOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "version")
    public native PHImageRequestOptionsVersion getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(PHImageRequestOptionsVersion v);
    @Property(selector = "deliveryMode")
    public native PHImageRequestOptionsDeliveryMode getDeliveryMode();
    @Property(selector = "setDeliveryMode:")
    public native void setDeliveryMode(PHImageRequestOptionsDeliveryMode v);
    @Property(selector = "isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();
    @Property(selector = "setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean v);
    @Property(selector = "progressHandler")
    public native @Block VoidBlock4<Double, NSError, BooleanPtr, NSDictionary<?, ?>> getProgressHandler();
    @Property(selector = "setProgressHandler:")
    public native void setProgressHandler(@Block VoidBlock4<Double, NSError, BooleanPtr, NSDictionary<?, ?>> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
