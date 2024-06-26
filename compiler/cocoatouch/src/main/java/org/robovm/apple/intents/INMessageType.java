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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/INMessageType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unspecified(0L),
    Text(1L),
    Audio(2L),
    DigitalTouch(3L),
    Handwriting(4L),
    Sticker(5L),
    TapbackLiked(6L),
    TapbackDisliked(7L),
    TapbackEmphasized(8L),
    TapbackLoved(9L),
    TapbackQuestioned(10L),
    TapbackLaughed(11L),
    MediaCalendar(12L),
    MediaLocation(13L),
    MediaAddressCard(14L),
    MediaImage(15L),
    MediaVideo(16L),
    MediaPass(17L),
    MediaAudio(18L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    PaymentSent(19L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    PaymentRequest(20L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    PaymentNote(21L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    Animoji(22L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    ActivitySnippet(23L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    File(24L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    Link(25L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    Reaction(26L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/INMessageType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INMessageType/*</name>*/ valueOf(long n) {
        for (/*<name>*/INMessageType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/INMessageType/*</name>*/.class.getName());
    }
}
