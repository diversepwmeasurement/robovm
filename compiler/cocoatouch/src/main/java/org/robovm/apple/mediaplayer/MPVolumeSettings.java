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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPVolumeSettings/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(MPVolumeSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 11.3. Use MPVolumeView to present volume controls.
     */
    @Deprecated
    @Bridge(symbol="MPVolumeSettingsAlertShow", optional=true)
    public static native void showAlert();
    /**
     * @deprecated Deprecated in iOS 11.3. Use MPVolumeView to present volume controls.
     */
    @Deprecated
    @Bridge(symbol="MPVolumeSettingsAlertHide", optional=true)
    public static native void hideAlert();
    /**
     * @deprecated Deprecated in iOS 11.3. Use MPVolumeView to present volume controls.
     */
    @Deprecated
    @Bridge(symbol="MPVolumeSettingsAlertIsVisible", optional=true)
    public static native boolean isAlertVisible();
    /*</methods>*/
}
