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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKTurnBasedEventListenerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GKTurnBasedEventListener/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("player:didRequestMatchWithOtherPlayers:")
    public void didRequestMatch(GKPlayer player, NSArray<GKPlayer> playersToInvite) {}
    @NotImplemented("player:receivedTurnEventForMatch:didBecomeActive:")
    public void receivedTurnEvent(GKPlayer player, GKTurnBasedMatch match, boolean didBecomeActive) {}
    @NotImplemented("player:matchEnded:")
    public void matchEnded(GKPlayer player, GKTurnBasedMatch match) {}
    @NotImplemented("player:receivedExchangeRequest:forMatch:")
    public void receivedExchangeRequest(GKPlayer player, GKTurnBasedExchange exchange, GKTurnBasedMatch match) {}
    @NotImplemented("player:receivedExchangeCancellation:forMatch:")
    public void receivedExchangeCancellation(GKPlayer player, GKTurnBasedExchange exchange, GKTurnBasedMatch match) {}
    @NotImplemented("player:receivedExchangeReplies:forCompletedExchange:forMatch:")
    public void receivedExchangeReplies(GKPlayer player, NSArray<GKTurnBasedExchange> replies, GKTurnBasedExchange exchange, GKTurnBasedMatch match) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("player:wantsToQuitMatch:")
    public void wantsToQuitMatch(GKPlayer player, GKTurnBasedMatch match) {}
    /**
     * @deprecated Deprecated in iOS 8.0. Use -didRequestMatchWithOtherPlayers:
     */
    @Deprecated
    @NotImplemented("player:didRequestMatchWithPlayers:")
    public void didRequestMatch(GKPlayer player, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDsToInvite) {}
    /*</methods>*/
}
