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
package org.robovm.apple.coremotion;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMAltimeter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMAltimeterPtr extends Ptr<CMAltimeter, CMAltimeterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMAltimeter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMAltimeter() {}
    protected CMAltimeter(Handle h, long handle) { super(h, handle); }
    protected CMAltimeter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startRelativeAltitudeUpdatesToQueue:withHandler:")
    public native void startRelativeAltitudeUpdates(NSOperationQueue queue, @Block VoidBlock2<CMAltitudeData, NSError> handler);
    @Method(selector = "stopRelativeAltitudeUpdates")
    public native void stopRelativeAltitudeUpdates();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "startAbsoluteAltitudeUpdatesToQueue:withHandler:")
    public native void startAbsoluteAltitudeUpdates(NSOperationQueue queue, @Block VoidBlock2<CMAbsoluteAltitudeData, NSError> handler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "stopAbsoluteAltitudeUpdates")
    public native void stopAbsoluteAltitudeUpdates();
    @Method(selector = "isRelativeAltitudeAvailable")
    public static native boolean isRelativeAltitudeAvailable();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "authorizationStatus")
    public static native CMAuthorizationStatus authorizationStatus();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "isAbsoluteAltitudeAvailable")
    public static native boolean isAbsoluteAltitudeAvailable();
    /*</methods>*/
}
