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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AVAudioSessionCategoryOptions/*</name>*/ extends Bits</*<name>*/AVAudioSessionCategoryOptions/*</name>*/> {
    /*<values>*/
    public static final AVAudioSessionCategoryOptions None = new AVAudioSessionCategoryOptions(0L);
    public static final AVAudioSessionCategoryOptions MixWithOthers = new AVAudioSessionCategoryOptions(1L);
    public static final AVAudioSessionCategoryOptions DuckOthers = new AVAudioSessionCategoryOptions(2L);
    public static final AVAudioSessionCategoryOptions AllowBluetooth = new AVAudioSessionCategoryOptions(4L);
    public static final AVAudioSessionCategoryOptions DefaultToSpeaker = new AVAudioSessionCategoryOptions(8L);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVAudioSessionCategoryOptions InterruptSpokenAudioAndMixWithOthers = new AVAudioSessionCategoryOptions(17L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final AVAudioSessionCategoryOptions AllowBluetoothA2DP = new AVAudioSessionCategoryOptions(32L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final AVAudioSessionCategoryOptions AllowAirPlay = new AVAudioSessionCategoryOptions(64L);
    /**
     * @since Available in iOS 14.5 and later.
     */
    public static final AVAudioSessionCategoryOptions OverrideMutedMicrophoneInterruption = new AVAudioSessionCategoryOptions(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AVAudioSessionCategoryOptions/*</name>*/[] values = _values(/*<name>*/AVAudioSessionCategoryOptions/*</name>*/.class);

    public /*<name>*/AVAudioSessionCategoryOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/AVAudioSessionCategoryOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AVAudioSessionCategoryOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AVAudioSessionCategoryOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/AVAudioSessionCategoryOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AVAudioSessionCategoryOptions/*</name>*/[] values() {
        return values.clone();
    }
}
