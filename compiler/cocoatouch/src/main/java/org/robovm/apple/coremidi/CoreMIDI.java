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
package org.robovm.apple.coremidi;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CoreMIDI/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CoreMIDI.class); }/*</bind>*/
    /*<constants>*/
    public static final int ChannelsWholePort = 127;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MIDINetworkBonjourServiceType", optional=true)
    public static native NSString NetworkServiceTypeBonjour();
    @GlobalValue(symbol="MIDINetworkNotificationContactsDidChange", optional=true)
    public static native NSString NetworkNotificationContactsDidChange();
    @GlobalValue(symbol="MIDINetworkNotificationSessionDidChange", optional=true)
    public static native NSString NetworkNotificationSessionDidChange();
    
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="MIDIBluetoothDriverActivateAllConnections", optional=true)
    public static native OSStatus function__MIDIBluetoothDriverActivateAllConnections();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="MIDIBluetoothDriverDisconnect", optional=true)
    public static native OSStatus function__MIDIBluetoothDriverDisconnect(String uuid);
    /*</methods>*/
}
