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
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 15.0. INCarDefrosterResolutionResult is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCarDefrosterResolutionResult/*</name>*/ 
    extends /*<extends>*/INIntentResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INCarDefrosterResolutionResultPtr extends Ptr<INCarDefrosterResolutionResult, INCarDefrosterResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCarDefrosterResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INCarDefrosterResolutionResult() {}
    protected INCarDefrosterResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INCarDefrosterResolutionResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "successWithResolvedCarDefroster:")
    public static native INCarDefrosterResolutionResult success(INCarDefroster resolvedCarDefroster);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +successWithResolvedCarDefroster:
     */
    @Deprecated
    @Method(selector = "successWithResolvedValue:")
    public static native INCarDefrosterResolutionResult successValue(INCarDefroster resolvedValue);
    @Method(selector = "confirmationRequiredWithCarDefrosterToConfirm:")
    public static native INCarDefrosterResolutionResult confirmationRequired(INCarDefroster carDefrosterToConfirm);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use +confirmationRequiredWithCarDefrosterToConfirm:
     */
    @Deprecated
    @Method(selector = "confirmationRequiredWithValueToConfirm:")
    public static native INCarDefrosterResolutionResult confirmationRequiredForValue(INCarDefroster valueToConfirm);
    @Method(selector = "needsValue")
    public static native INCarDefrosterResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INCarDefrosterResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INCarDefrosterResolutionResult unsupported();
    /*</methods>*/
}
