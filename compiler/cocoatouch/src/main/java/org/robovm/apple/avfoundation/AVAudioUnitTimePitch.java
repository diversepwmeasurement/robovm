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
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioUnitTimePitch/*</name>*/ 
    extends /*<extends>*/AVAudioUnitTimeEffect/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioUnitTimePitchPtr extends Ptr<AVAudioUnitTimePitch, AVAudioUnitTimePitchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioUnitTimePitch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioUnitTimePitch() {}
    protected AVAudioUnitTimePitch(Handle h, long handle) { super(h, handle); }
    protected AVAudioUnitTimePitch(SkipInit skipInit) { super(skipInit); }
    @WeaklyLinked
    @Method(selector = "initWithAudioComponentDescription:")
    public AVAudioUnitTimePitch(@ByVal AudioComponentDescription audioComponentDescription) { super(audioComponentDescription); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rate")
    public native float getRate();
    @Property(selector = "setRate:")
    public native void setRate(float v);
    @Property(selector = "pitch")
    public native float getPitch();
    @Property(selector = "setPitch:")
    public native void setPitch(float v);
    @Property(selector = "overlap")
    public native float getOverlap();
    @Property(selector = "setOverlap:")
    public native void setOverlap(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiate(@ByVal AudioComponentDescription audioComponentDescription, AudioComponentInstantiationOptions options, @Block VoidBlock2<AVAudioUnit, NSError> completionHandler);
    /*</methods>*/
}
