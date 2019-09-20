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
package org.robovm.apple.homekit;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMHomeManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMHomeManagerPtr extends Ptr<HMHomeManager, HMHomeManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMHomeManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMHomeManager() {}
    protected HMHomeManager(Handle h, long handle) { super(h, handle); }
    protected HMHomeManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HMHomeManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HMHomeManagerDelegate v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "authorizationStatus")
    public native HMHomeManagerAuthorizationStatus getAuthorizationStatus();
    @Property(selector = "primaryHome")
    public native HMHome getPrimaryHome();
    @Property(selector = "homes")
    public native NSArray<HMHome> getHomes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updatePrimaryHome:completionHandler:")
    public native void updatePrimaryHome(HMHome home, @Block VoidBlock1<NSError> completion);
    @Method(selector = "addHomeWithName:completionHandler:")
    public native void addHome(String homeName, @Block VoidBlock2<HMHome, NSError> completion);
    @Method(selector = "removeHome:completionHandler:")
    public native void removeHome(HMHome home, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
