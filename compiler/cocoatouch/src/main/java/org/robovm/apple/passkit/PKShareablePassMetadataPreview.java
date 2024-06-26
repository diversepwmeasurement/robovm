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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKShareablePassMetadataPreview/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKShareablePassMetadataPreviewPtr extends Ptr<PKShareablePassMetadataPreview, PKShareablePassMetadataPreviewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKShareablePassMetadataPreview.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKShareablePassMetadataPreview() {}
    protected PKShareablePassMetadataPreview(Handle h, long handle) { super(h, handle); }
    protected PKShareablePassMetadataPreview(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPassThumbnail:localizedDescription:")
    public PKShareablePassMetadataPreview(CGImage passThumbnail, String description) { super((SkipInit) null); initObject(init(passThumbnail, description)); }
    @Method(selector = "initWithTemplateIdentifier:")
    public PKShareablePassMetadataPreview(String templateIdentifier) { super((SkipInit) null); initObject(init(templateIdentifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "passThumbnailImage")
    public native CGImage getPassThumbnailImage();
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "ownerDisplayName")
    public native String getOwnerDisplayName();
    @Property(selector = "setOwnerDisplayName:")
    public native void setOwnerDisplayName(String v);
    @Property(selector = "provisioningTemplateIdentifier")
    public native String getProvisioningTemplateIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPassThumbnail:localizedDescription:")
    protected native @Pointer long init(CGImage passThumbnail, String description);
    @Method(selector = "initWithTemplateIdentifier:")
    protected native @Pointer long init(String templateIdentifier);
    /*</methods>*/
}
