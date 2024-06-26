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
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKQuantitySeriesSampleQuery/*</name>*/ 
    extends /*<extends>*/HKQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKQuantitySeriesSampleQueryPtr extends Ptr<HKQuantitySeriesSampleQuery, HKQuantitySeriesSampleQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKQuantitySeriesSampleQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKQuantitySeriesSampleQuery() {}
    protected HKQuantitySeriesSampleQuery(Handle h, long handle) { super(h, handle); }
    protected HKQuantitySeriesSampleQuery(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithQuantityType:predicate:quantityHandler:")
    public HKQuantitySeriesSampleQuery(HKQuantityType quantityType, NSPredicate predicate, @Block VoidBlock6<HKQuantitySeriesSampleQuery, HKQuantity, NSDateInterval, HKQuantitySample, Boolean, NSError> quantityHandler) { super((SkipInit) null); initObject(init(quantityType, predicate, quantityHandler)); }
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use initWithQuantityType:predicate:quantityHandler:
     */
    @Deprecated
    @Method(selector = "initWithSample:quantityHandler:")
    public HKQuantitySeriesSampleQuery(HKQuantitySample quantitySample, @Block VoidBlock5<HKQuantitySeriesSampleQuery, HKQuantity, NSDate, Boolean, NSError> quantityHandler) { super((SkipInit) null); initObject(init(quantitySample, quantityHandler)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "includeSample")
    public native boolean isIncludeSample();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setIncludeSample:")
    public native void setIncludeSample(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "orderByQuantitySampleStartDate")
    public native boolean isOrderByQuantitySampleStartDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setOrderByQuantitySampleStartDate:")
    public native void setOrderByQuantitySampleStartDate(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithQuantityType:predicate:quantityHandler:")
    protected native @Pointer long init(HKQuantityType quantityType, NSPredicate predicate, @Block VoidBlock6<HKQuantitySeriesSampleQuery, HKQuantity, NSDateInterval, HKQuantitySample, Boolean, NSError> quantityHandler);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use initWithQuantityType:predicate:quantityHandler:
     */
    @Deprecated
    @Method(selector = "initWithSample:quantityHandler:")
    protected native @Pointer long init(HKQuantitySample quantitySample, @Block VoidBlock5<HKQuantitySeriesSampleQuery, HKQuantity, NSDate, Boolean, NSError> quantityHandler);
    /*</methods>*/
}
