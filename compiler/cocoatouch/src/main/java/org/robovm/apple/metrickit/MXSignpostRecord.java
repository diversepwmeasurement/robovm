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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXSignpostRecord/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MXSignpostRecordPtr extends Ptr<MXSignpostRecord, MXSignpostRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXSignpostRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXSignpostRecord() {}
    protected MXSignpostRecord(Handle h, long handle) { super(h, handle); }
    protected MXSignpostRecord(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MXSignpostRecord(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "subsystem")
    public native String getSubsystem();
    @Property(selector = "category")
    public native String getCategory();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "beginTimeStamp")
    public native NSDate getBeginTimeStamp();
    @Property(selector = "endTimeStamp")
    public native NSDate getEndTimeStamp();
    @Property(selector = "duration")
    public native NSMeasurement<NSUnitDuration> getDuration();
    @Property(selector = "isInterval")
    public native boolean isInterval();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "JSONRepresentation")
    public native NSData JSONRepresentation();
    @Method(selector = "dictionaryRepresentation")
    public native NSDictionary<?, ?> dictionaryRepresentation();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
