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
package org.robovm.apple.gamekit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 7.0. Use MCBrowserViewController along with MCBrowserViewControllerDelegate from the MultipeerConnectivity framework
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GKPeerPickerControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "peerPickerController:didSelectConnectionType:")
    void didSelectConnectionType(GKPeerPickerController picker, GKPeerPickerConnectionType type);
    @Method(selector = "peerPickerController:sessionForConnectionType:")
    GKSession getSession(GKPeerPickerController picker, GKPeerPickerConnectionType type);
    @Method(selector = "peerPickerController:didConnectPeer:toSession:")
    void didConnectPeer(GKPeerPickerController picker, String peerID, GKSession session);
    @Method(selector = "peerPickerControllerDidCancel:")
    void didCancel(GKPeerPickerController picker);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
