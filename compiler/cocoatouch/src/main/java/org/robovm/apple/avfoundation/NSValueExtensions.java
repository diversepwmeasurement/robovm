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
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSValueExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSValueExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSValueExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "CMTimeValue")
    public static native @ByVal CMTime getCMTimeValue(NSValue thiz);
    @Property(selector = "CMTimeRangeValue")
    public static native @ByVal CMTimeRange getCMTimeRangeValue(NSValue thiz);
    @Property(selector = "CMTimeMappingValue")
    public static native @ByVal CMTimeMapping getCMTimeMappingValue(NSValue thiz);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "valueWithCMTime:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CMTime time);
    public static NSValue create(@ByVal CMTime time) { return create(ObjCClass.getByType(NSValue.class), time); }
    @Method(selector = "valueWithCMTimeRange:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CMTimeRange timeRange);
    public static NSValue create(@ByVal CMTimeRange timeRange) { return create(ObjCClass.getByType(NSValue.class), timeRange); }
    @Method(selector = "valueWithCMTimeMapping:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CMTimeMapping timeMapping);
    public static NSValue create(@ByVal CMTimeMapping timeMapping) { return create(ObjCClass.getByType(NSValue.class), timeMapping); }
    /*</methods>*/
}
