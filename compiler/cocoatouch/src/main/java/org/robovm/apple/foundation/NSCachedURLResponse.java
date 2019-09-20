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
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCachedURLResponse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSCachedURLResponsePtr extends Ptr<NSCachedURLResponse, NSCachedURLResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCachedURLResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSCachedURLResponse() {}
    protected NSCachedURLResponse(Handle h, long handle) { super(h, handle); }
    protected NSCachedURLResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithResponse:data:")
    public NSCachedURLResponse(NSURLResponse response, NSData data) { super((SkipInit) null); initObject(init(response, data)); }
    @Method(selector = "initWithResponse:data:userInfo:storagePolicy:")
    public NSCachedURLResponse(NSURLResponse response, NSData data, NSDictionary<?, ?> userInfo, NSURLCacheStoragePolicy storagePolicy) { super((SkipInit) null); initObject(init(response, data, userInfo, storagePolicy)); }
    @Method(selector = "initWithCoder:")
    public NSCachedURLResponse(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "response")
    public native NSURLResponse getResponse();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "storagePolicy")
    public native NSURLCacheStoragePolicy getStoragePolicy();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithResponse:data:")
    protected native @Pointer long init(NSURLResponse response, NSData data);
    @Method(selector = "initWithResponse:data:userInfo:storagePolicy:")
    protected native @Pointer long init(NSURLResponse response, NSData data, NSDictionary<?, ?> userInfo, NSURLCacheStoragePolicy storagePolicy);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
