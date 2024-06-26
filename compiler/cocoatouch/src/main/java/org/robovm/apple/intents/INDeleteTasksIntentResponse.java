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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 * @deprecated Deprecated in iOS 15.0. INDeleteTasksIntentResponse is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INDeleteTasksIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INDeleteTasksIntentResponsePtr extends Ptr<INDeleteTasksIntentResponse, INDeleteTasksIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INDeleteTasksIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INDeleteTasksIntentResponse() {}
    protected INDeleteTasksIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INDeleteTasksIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCode:userActivity:")
    public INDeleteTasksIntentResponse(INDeleteTasksIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INDeleteTasksIntentResponseCode getCode();
    @Property(selector = "deletedTasks")
    public native NSArray<INTask> getDeletedTasks();
    @Property(selector = "setDeletedTasks:")
    public native void setDeletedTasks(NSArray<INTask> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCode:userActivity:")
    protected native @Pointer long init(INDeleteTasksIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
