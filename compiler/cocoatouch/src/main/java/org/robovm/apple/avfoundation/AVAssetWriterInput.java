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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetWriterInput/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetWriterInputPtr extends Ptr<AVAssetWriterInput, AVAssetWriterInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetWriterInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetWriterInput() {}
    protected AVAssetWriterInput(Handle h, long handle) { super(h, handle); }
    protected AVAssetWriterInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public AVAssetWriterInput(AVMediaType mediaType, AVAudioSettings outputSettings) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary()));
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public AVAssetWriterInput(AVMediaType mediaType, AVAudioSettings outputSettings, CMFormatDescription sourceFormatHint) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary(), sourceFormatHint));
    }
    public AVAssetWriterInput(AVMediaType mediaType, AVVideoSettings outputSettings) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary()));
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public AVAssetWriterInput(AVMediaType mediaType, AVVideoSettings outputSettings, CMFormatDescription sourceFormatHint) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary(), sourceFormatHint));
    }
    
    
    public AVAudioSettings getOutputAudioSettings() {
        return new AVAudioSettings(getOutputSettings());
    }
    public AVVideoSettings getOutputVideoSettings() {
        return new AVVideoSettings(getOutputSettings());
    }
    /*<properties>*/
    @Property(selector = "mediaType")
    public native AVMediaType getMediaType();
    @Property(selector = "outputSettings")
    protected native NSDictionary<NSString, ?> getOutputSettings();
    @Property(selector = "sourceFormatHint")
    public native CMFormatDescription getSourceFormatHint();
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    @Property(selector = "isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    @Property(selector = "expectsMediaDataInRealTime")
    public native boolean expectsMediaDataInRealTime();
    @Property(selector = "setExpectsMediaDataInRealTime:")
    public native void setExpectsMediaDataInRealTime(boolean v);
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String v);
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    @Property(selector = "setNaturalSize:")
    public native void setNaturalSize(@ByVal CGSize v);
    @Property(selector = "transform")
    public native @ByVal CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal CGAffineTransform v);
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    @Property(selector = "setPreferredVolume:")
    public native void setPreferredVolume(float v);
    @Property(selector = "marksOutputTrackAsEnabled")
    public native boolean marksOutputTrackAsEnabled();
    @Property(selector = "setMarksOutputTrackAsEnabled:")
    public native void setMarksOutputTrackAsEnabled(boolean v);
    @Property(selector = "mediaTimeScale")
    public native int getMediaTimeScale();
    @Property(selector = "setMediaTimeScale:")
    public native void setMediaTimeScale(int v);
    @Property(selector = "preferredMediaChunkDuration")
    public native @ByVal CMTime getPreferredMediaChunkDuration();
    @Property(selector = "setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByVal CMTime v);
    @Property(selector = "preferredMediaChunkAlignment")
    public native @MachineSizedSInt long getPreferredMediaChunkAlignment();
    @Property(selector = "setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@MachineSizedSInt long v);
    @Property(selector = "sampleReferenceBaseURL")
    public native NSURL getSampleReferenceBaseURL();
    @Property(selector = "setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "mediaDataLocation")
    public native AVAssetWriterInputMediaDataLocation getMediaDataLocation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMediaDataLocation:")
    public native void setMediaDataLocation(AVAssetWriterInputMediaDataLocation v);
    @Property(selector = "performsMultiPassEncodingIfSupported")
    public native boolean performsMultiPassEncodingIfSupported();
    @Property(selector = "setPerformsMultiPassEncodingIfSupported:")
    public native void setPerformsMultiPassEncodingIfSupported(boolean v);
    @Property(selector = "canPerformMultiplePasses")
    public native boolean canPerformMultiplePasses();
    @Property(selector = "currentPassDescription")
    public native AVAssetWriterInputPassDescription getCurrentPassDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMediaType:outputSettings:")
    protected native @Pointer long init(AVMediaType mediaType, NSDictionary<NSString, ?> outputSettings);
    @Method(selector = "initWithMediaType:outputSettings:sourceFormatHint:")
    protected native @Pointer long init(AVMediaType mediaType, NSDictionary<NSString, ?> outputSettings, CMFormatDescription sourceFormatHint);
    @WeaklyLinked
    @Method(selector = "requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReady(DispatchQueue queue, @Block Runnable block);
    @Method(selector = "appendSampleBuffer:")
    public native boolean appendSampleBuffer(CMSampleBuffer sampleBuffer);
    @Method(selector = "markAsFinished")
    public native void markAsFinished();
    @Method(selector = "canAddTrackAssociationWithTrackOfInput:type:")
    public native boolean canAddTrackAssociation(AVAssetWriterInput input, AVTrackAssociationType trackAssociationType);
    @Method(selector = "addTrackAssociationWithTrackOfInput:type:")
    public native void addTrackAssociation(AVAssetWriterInput input, AVTrackAssociationType trackAssociationType);
    @WeaklyLinked
    @Method(selector = "respondToEachPassDescriptionOnQueue:usingBlock:")
    public native void respondToEachPassDescriptionOnQueue(DispatchQueue queue, @Block Runnable block);
    @Method(selector = "markCurrentPassAsFinished")
    public native void markCurrentPassAsFinished();
    /*</methods>*/
}
