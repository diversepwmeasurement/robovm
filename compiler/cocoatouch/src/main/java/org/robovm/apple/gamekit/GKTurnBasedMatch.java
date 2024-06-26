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
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKTurnBasedMatch/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKTurnBasedMatchPtr extends Ptr<GKTurnBasedMatch, GKTurnBasedMatchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKTurnBasedMatch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKTurnBasedMatch() {}
    protected GKTurnBasedMatch(Handle h, long handle) { super(h, handle); }
    protected GKTurnBasedMatch(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "matchID")
    public native String getMatchID();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "participants")
    public native NSArray<GKTurnBasedParticipant> getParticipants();
    @Property(selector = "status")
    public native GKTurnBasedMatchStatus getStatus();
    @Property(selector = "currentParticipant")
    public native GKTurnBasedParticipant getCurrentParticipant();
    @Property(selector = "matchData")
    public native NSData getMatchData();
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "matchDataMaximumSize")
    public native @MachineSizedUInt long getMatchDataMaximumSize();
    @Property(selector = "exchanges")
    public native NSArray<GKTurnBasedExchange> getExchanges();
    @Property(selector = "activeExchanges")
    public native NSArray<GKTurnBasedExchange> getActiveExchanges();
    @Property(selector = "completedExchanges")
    public native NSArray<GKTurnBasedExchange> getCompletedExchanges();
    @Property(selector = "exchangeDataMaximumSize")
    public native @MachineSizedUInt long getExchangeDataMaximumSize();
    @Property(selector = "exchangeMaxInitiatedExchangesPerPlayer")
    public native @MachineSizedUInt long getExchangeMaxInitiatedExchangesPerPlayer();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GKTurnTimeoutDefault", optional=true)
    public static native double getDefaultTimeout();
    @GlobalValue(symbol="GKTurnTimeoutNone", optional=true)
    public static native double getNoneTimeout();
    
    @Method(selector = "setLocalizableMessageWithKey:arguments:")
    public native void setLocalizableMessage(String key, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> arguments);
    @Method(selector = "rematchWithCompletionHandler:")
    public native void rematch(@Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    @Method(selector = "acceptInviteWithCompletionHandler:")
    public native void acceptInvite(@Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    @Method(selector = "declineInviteWithCompletionHandler:")
    public native void declineInvite(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "removeWithCompletionHandler:")
    public native void remove(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "loadMatchDataWithCompletionHandler:")
    public native void loadMatchData(@Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:")
    public native void endTurn(NSArray<GKTurnBasedParticipant> nextParticipants, double timeout, NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:")
    public native void participantQuitInTurn(GKTurnBasedMatchOutcome matchOutcome, NSArray<GKTurnBasedParticipant> nextParticipants, double timeout, NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "participantQuitOutOfTurnWithOutcome:withCompletionHandler:")
    public native void participantQuitOutOfTurn(GKTurnBasedMatchOutcome matchOutcome, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "endMatchInTurnWithMatchData:completionHandler:")
    public native void endMatch(NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 14.0. Use -endMatchInTurnWithMatchData:scores:completionHandler
     */
    @Deprecated
    @Method(selector = "endMatchInTurnWithMatchData:scores:achievements:completionHandler:")
    public native void endMatch(NSData matchData, NSArray<GKScore> scores, NSArray<GKAchievement> achievements, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "endMatchInTurnWithMatchData:leaderboardScores:achievements:completionHandler:")
    public native void endMatchInTurn(NSData matchData, NSArray<GKLeaderboardScore> scores, NSArray<?> achievements, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "saveCurrentTurnWithMatchData:completionHandler:")
    public native void saveCurrentTurn(NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "saveMergedMatchData:withResolvedExchanges:completionHandler:")
    public native void saveMergedMatchData(NSData matchData, NSArray<GKTurnBasedExchange> exchanges, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:")
    public native void sendExchange(NSArray<GKTurnBasedParticipant> participants, NSData data, String key, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> arguments, double timeout, @Block VoidBlock2<GKTurnBasedExchange, NSError> completionHandler);
    @Method(selector = "sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:")
    public native void sendReminder(NSArray<GKTurnBasedParticipant> participants, String key, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> arguments, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "findMatchForRequest:withCompletionHandler:")
    public static native void findMatch(GKMatchRequest request, @Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    @Method(selector = "loadMatchesWithCompletionHandler:")
    public static native void loadMatches(@Block VoidBlock2<NSArray<GKTurnBasedMatch>, NSError> completionHandler);
    @Method(selector = "loadMatchWithID:withCompletionHandler:")
    public static native void loadMatches(String matchID, @Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    /*</methods>*/
}
