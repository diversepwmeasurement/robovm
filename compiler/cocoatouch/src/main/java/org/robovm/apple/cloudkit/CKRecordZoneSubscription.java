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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKRecordZoneSubscription/*</name>*/ 
    extends /*<extends>*/CKSubscription/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CKRecordZoneSubscriptionPtr extends Ptr<CKRecordZoneSubscription, CKRecordZoneSubscriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKRecordZoneSubscription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKRecordZoneSubscription() {}
    protected CKRecordZoneSubscription(Handle h, long handle) { super(h, handle); }
    protected CKRecordZoneSubscription(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use initWithZoneID:subscriptionID:
     */
    @Deprecated
    @Method(selector = "initWithZoneID:")
    public CKRecordZoneSubscription(CKRecordZoneID zoneID) { super((SkipInit) null); initObject(init(zoneID)); }
    @Method(selector = "initWithZoneID:subscriptionID:")
    public CKRecordZoneSubscription(CKRecordZoneID zoneID, String subscriptionID) { super((SkipInit) null); initObject(init(zoneID, subscriptionID)); }
    @Method(selector = "initWithCoder:")
    public CKRecordZoneSubscription(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "zoneID")
    public native CKRecordZoneID getZoneID();
    @Property(selector = "recordType")
    public native String getRecordType();
    @Property(selector = "setRecordType:")
    public native void setRecordType(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use initWithZoneID:subscriptionID:
     */
    @Deprecated
    @Method(selector = "initWithZoneID:")
    protected native @Pointer long init(CKRecordZoneID zoneID);
    @Method(selector = "initWithZoneID:subscriptionID:")
    protected native @Pointer long init(CKRecordZoneID zoneID, String subscriptionID);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
