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
package org.robovm.apple.metrickit;

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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXMetricManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MXMetricManagerPtr extends Ptr<MXMetricManager, MXMetricManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXMetricManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXMetricManager() {}
    protected MXMetricManager(Handle h, long handle) { super(h, handle); }
    protected MXMetricManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pastPayloads")
    public native NSArray<MXMetricPayload> getPastPayloads();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "pastDiagnosticPayloads")
    public native NSArray<MXDiagnosticPayload> getPastDiagnosticPayloads();
    @Property(selector = "sharedManager")
    public static native MXMetricManager getSharedManager();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addSubscriber:")
    public native void addSubscriber(MXMetricManagerSubscriber subscriber);
    @Method(selector = "removeSubscriber:")
    public native void removeSubscriber(MXMetricManagerSubscriber subscriber);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static boolean extendLaunchMeasurementForTaskID(String taskID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = extendLaunchMeasurementForTaskID(taskID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "extendLaunchMeasurementForTaskID:error:")
    private static native boolean extendLaunchMeasurementForTaskID(String taskID, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static boolean finishExtendedLaunchMeasurementForTaskID(String taskID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = finishExtendedLaunchMeasurementForTaskID(taskID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "finishExtendedLaunchMeasurementForTaskID:error:")
    private static native boolean finishExtendedLaunchMeasurementForTaskID(String taskID, NSError.NSErrorPtr error);
    /*</methods>*/
}
