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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ {

    /*<ptr>*/public static class AVMetadataItemPtr extends Ptr<AVMetadataItem, AVMetadataItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMetadataItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMetadataItem() {}
    protected AVMetadataItem(Handle h, long handle) { super(h, handle); }
    protected AVMetadataItem(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public AVMetadataItem(AVMetadataItem metadataItem, @Block VoidBlock1<AVMetadataItemValueRequest> handler) { super((Handle) null, create(metadataItem, handler)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native AVMetadataIdentifier getIdentifier();
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "time")
    public native @ByVal CMTime getTime();
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    @Property(selector = "dataType")
    public native CMMetadataDataType getDataType();
    @Property(selector = "value")
    public native NSObject getValue();
    @Property(selector = "extraAttributes")
    public native AVMetadataExtraAttributes getExtraAttributes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "numberValue")
    public native NSNumber getNumberValue();
    @Property(selector = "dateValue")
    public native NSDate getDateValue();
    @Property(selector = "dataValue")
    public native NSData getDataValue();
    @Property(selector = "key")
    public native AVMetadataKey getKey();
    @Property(selector = "commonKey")
    public native AVMetadataKeyCommon getCommonKey();
    @Property(selector = "keySpace")
    public native AVMetadataKeySpace getKeySpace();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public AVKeyValueStatus getStatusOfValue(AVMetadataKey key) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AVKeyValueStatus result = getStatusOfValue(key, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "statusOfValueForKey:error:")
    private native AVKeyValueStatus getStatusOfValue(AVMetadataKey key, NSError.NSErrorPtr outError);
    @Method(selector = "loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(@org.robovm.rt.bro.annotation.Marshaler(AVMetadataKey.AsListMarshaler.class) List<AVMetadataKey> keys, @Block Runnable handler);
    @Method(selector = "metadataItemsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByPreferredLanguages(NSArray<AVMetadataItem> metadataItems, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> preferredLanguages);
    @Method(selector = "metadataItemsFromArray:filteredByIdentifier:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByIdentifier(NSArray<AVMetadataItem> metadataItems, AVMetadataIdentifier identifier);
    @Method(selector = "metadataItemsFromArray:filteredByMetadataItemFilter:")
    public static native NSArray<AVMetadataItem> filterMetadataItems(NSArray<AVMetadataItem> metadataItems, AVMetadataItemFilter metadataItemFilter);
    @Method(selector = "identifierForKey:keySpace:")
    public static native AVMetadataIdentifier getIdentifierForKey(AVMetadataKey key, AVMetadataKeySpace keySpace);
    @Method(selector = "keySpaceForIdentifier:")
    public static native AVMetadataKeySpace getKeySpaceForIdentifier(AVMetadataIdentifier identifier);
    @Method(selector = "keyForIdentifier:")
    public static native AVMetadataKey getKeyForIdentifier(AVMetadataIdentifier identifier);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "metadataItemWithPropertiesOfMetadataItem:valueLoadingHandler:")
    protected static native @Pointer long create(AVMetadataItem metadataItem, @Block VoidBlock1<AVMetadataItemValueRequest> handler);
    @Method(selector = "metadataItemsFromArray:withLocale:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByLocale(NSArray<AVMetadataItem> metadataItems, NSLocale locale);
    @Method(selector = "metadataItemsFromArray:withKey:keySpace:")
    public static native NSArray<AVMetadataItem> filterMetadataItemsByKey(NSArray<AVMetadataItem> metadataItems, AVMetadataKey key, AVMetadataKeySpace keySpace);
    /*</methods>*/
}
