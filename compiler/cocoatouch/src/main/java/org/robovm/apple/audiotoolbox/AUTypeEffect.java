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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/AUTypeEffect/*</name>*/ implements AUSubType {
    /*<values>*/
    PeakLimiter(1819112562L),
    DynamicsProcessor(1684237680L),
    LowPassFilter(1819304307L),
    HighPassFilter(1752195443L),
    BandPassFilter(1651532147L),
    HighShelfFilter(1752393830L),
    LowShelfFilter(1819502694L),
    ParametricEQ(1886217585L),
    Distortion(1684632436L),
    Delay(1684368505L),
    SampleDelay(1935961209L),
    NBandEQ(1851942257L),
    Reverb2(1920361010L),
    /**
     * @since Available in iOS 16.0 and later.
     */
    AUSoundIsolation(1987012979L),
    /**
     * @deprecated Deprecated in iOS 13.0. Use kAudioUnitSubType_GraphicEQ
     */
    @Deprecated
    AUiPodEQ(1768973681L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AUTypeEffect/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AUTypeEffect/*</name>*/ valueOf(long n) {
        for (/*<name>*/AUTypeEffect/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AUTypeEffect/*</name>*/.class.getName());
    }
}
