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
/**
 * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMovieAccessLog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMovieAccessLogPtr extends Ptr<MPMovieAccessLog, MPMovieAccessLogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMovieAccessLog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMovieAccessLog() {}
    protected MPMovieAccessLog(Handle h, long handle) { super(h, handle); }
    protected MPMovieAccessLog(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "extendedLogData")
    public native NSData getExtendedLogData();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "extendedLogDataStringEncoding")
    public native NSStringEncoding getExtendedLogDataStringEncoding();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "events")
    public native NSArray<MPMovieAccessLogEvent> getEvents();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
