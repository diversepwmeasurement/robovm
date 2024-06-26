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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableMetadataItem/*</name>*/ 
    extends /*<extends>*/AVMetadataItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableMetadataItemPtr extends Ptr<AVMutableMetadataItem, AVMutableMetadataItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableMetadataItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableMetadataItem() {}
    protected AVMutableMetadataItem(Handle h, long handle) { super(h, handle); }
    protected AVMutableMetadataItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native AVMetadataIdentifier getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(AVMetadataIdentifier v);
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String v);
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    @Property(selector = "setTime:")
    public native void setTime(@ByVal CMTime v);
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(@ByVal CMTime v);
    @Property(selector = "dataType")
    public native CMMetadataDataType getDataType();
    @Property(selector = "setDataType:")
    public native void setDataType(CMMetadataDataType v);
    @Property(selector = "value")
    public native NSObject getValue();
    @Property(selector = "setValue:")
    public native void setValue(NSObject v);
    @Property(selector = "extraAttributes")
    public native AVMetadataExtraAttributes getExtraAttributes();
    @Property(selector = "setExtraAttributes:")
    public native void setExtraAttributes(AVMetadataExtraAttributes v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setStartDate:")
    public native void setStartDate(NSDate v);
    @Property(selector = "keySpace")
    public native AVMetadataKeySpace getKeySpace();
    @Property(selector = "setKeySpace:")
    public native void setKeySpace(AVMetadataKeySpace v);
    @Property(selector = "key")
    public native AVMetadataKey getKey();
    @Property(selector = "setKey:")
    public native void setKey(AVMetadataKey v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
