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
package org.robovm.apple.sharedwithyou;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SharedWithYou") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWRemoveParticipantAlertController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SWRemoveParticipantAlertControllerPtr extends Ptr<SWRemoveParticipantAlertController, SWRemoveParticipantAlertControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWRemoveParticipantAlertController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SWRemoveParticipantAlertController() {}
    protected SWRemoveParticipantAlertController(Handle h, long handle) { super(h, handle); }
    protected SWRemoveParticipantAlertController(SkipInit skipInit) { super(skipInit); }
    public SWRemoveParticipantAlertController(SWPerson participant, SWCollaborationHighlight highlight) { super((Handle) null, create(participant, highlight)); retain(getHandle()); }
    @Method(selector = "initWithNibName:bundle:")
    public SWRemoveParticipantAlertController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public SWRemoveParticipantAlertController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "alertControllerWithParticipant:highlight:")
    protected static native @Pointer long create(SWPerson participant, SWCollaborationHighlight highlight);
    /*</methods>*/
}
