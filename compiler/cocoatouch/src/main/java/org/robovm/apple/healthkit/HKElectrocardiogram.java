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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKElectrocardiogram/*</name>*/ 
    extends /*<extends>*/HKSample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKElectrocardiogramPtr extends Ptr<HKElectrocardiogram, HKElectrocardiogramPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKElectrocardiogram.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKElectrocardiogram() {}
    protected HKElectrocardiogram(Handle h, long handle) { super(h, handle); }
    protected HKElectrocardiogram(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfVoltageMeasurements")
    public native @MachineSizedSInt long getNumberOfVoltageMeasurements();
    @Property(selector = "samplingFrequency")
    public native HKQuantity getSamplingFrequency();
    @Property(selector = "classification")
    public native HKElectrocardiogramClassification getClassification();
    @Property(selector = "averageHeartRate")
    public native HKQuantity getAverageHeartRate();
    @Property(selector = "symptomsStatus")
    public native HKElectrocardiogramSymptomsStatus getSymptomsStatus();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
