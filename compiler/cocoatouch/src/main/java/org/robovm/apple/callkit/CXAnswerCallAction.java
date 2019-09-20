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
package org.robovm.apple.callkit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXAnswerCallAction/*</name>*/ 
    extends /*<extends>*/CXCallAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXAnswerCallActionPtr extends Ptr<CXAnswerCallAction, CXAnswerCallActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXAnswerCallAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CXAnswerCallAction() {}
    protected CXAnswerCallAction(Handle h, long handle) { super(h, handle); }
    protected CXAnswerCallAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCallUUID:")
    public CXAnswerCallAction(NSUUID callUUID) { super(callUUID); }
    @Method(selector = "initWithCoder:")
    public CXAnswerCallAction(NSCoder aDecoder) { super(aDecoder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fulfillWithDateConnected:")
    public native void fulfill(NSDate dateConnected);
    /*</methods>*/
}
