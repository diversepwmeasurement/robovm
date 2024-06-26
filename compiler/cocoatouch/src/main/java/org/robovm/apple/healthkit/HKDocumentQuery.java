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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKDocumentQuery/*</name>*/ 
    extends /*<extends>*/HKQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKDocumentQueryPtr extends Ptr<HKDocumentQuery, HKDocumentQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKDocumentQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKDocumentQuery() {}
    protected HKDocumentQuery(Handle h, long handle) { super(h, handle); }
    protected HKDocumentQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDocumentType:predicate:limit:sortDescriptors:includeDocumentData:resultsHandler:")
    public HKDocumentQuery(HKDocumentType documentType, NSPredicate predicate, @MachineSizedUInt long limit, NSArray<NSSortDescriptor> sortDescriptors, boolean includeDocumentData, @Block VoidBlock4<HKDocumentQuery, NSArray<HKDocumentSample>, Boolean, NSError> resultsHandler) { super((SkipInit) null); initObject(init(documentType, predicate, limit, sortDescriptors, includeDocumentData, resultsHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "limit")
    public native @MachineSizedUInt long getLimit();
    @Property(selector = "sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    @Property(selector = "includeDocumentData")
    public native boolean isIncludeDocumentData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDocumentType:predicate:limit:sortDescriptors:includeDocumentData:resultsHandler:")
    protected native @Pointer long init(HKDocumentType documentType, NSPredicate predicate, @MachineSizedUInt long limit, NSArray<NSSortDescriptor> sortDescriptors, boolean includeDocumentData, @Block VoidBlock4<HKDocumentQuery, NSArray<HKDocumentSample>, Boolean, NSError> resultsHandler);
    /*</methods>*/
}
