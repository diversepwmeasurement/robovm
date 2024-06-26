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
package org.robovm.apple.corevideo;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
/*<visibility>*/public abstract/*</visibility>*/ class /*<name>*/CVBuffer/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CVBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    protected CFType getAttachment(CFString key) {
        return getAttachment(key, new IntPtr());
    }
    
    protected CVAttachmentMode getAttachmentMode(CFString key) {
        IntPtr ptr = new IntPtr();
        getAttachment(key, ptr);
        return CVAttachmentMode.valueOf(ptr.get());
    }
    /*<methods>*/
    @Bridge(symbol="CVBufferSetAttachment", optional=true)
    protected native void setAttachment(CFString key, CFType value, CVAttachmentMode attachmentMode);
    /**
     * @deprecated Deprecated in iOS 15.0. Use CVBufferCopyAttachment
     */
    @Deprecated
    @Bridge(symbol="CVBufferGetAttachment", optional=true)
    protected native CFType getAttachment(CFString key, IntPtr attachmentMode);
    @Bridge(symbol="CVBufferRemoveAttachment", optional=true)
    protected native void removeAttachment(CFString key);
    @Bridge(symbol="CVBufferRemoveAllAttachments", optional=true)
    protected native void removeAllAttachments();
    /**
     * @deprecated Deprecated in iOS 15.0. Use CVBufferCopyAttachments
     */
    @Deprecated
    @Bridge(symbol="CVBufferGetAttachments", optional=true)
    protected native NSDictionary getAttachments(CVAttachmentMode attachmentMode);
    @Bridge(symbol="CVBufferSetAttachments", optional=true)
    protected native void setAttachments(NSDictionary theAttachments, CVAttachmentMode attachmentMode);
    @Bridge(symbol="CVBufferPropagateAttachments", optional=true)
    protected native void propagateAttachments(CVBuffer destinationBuffer);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CVBufferCopyAttachments", optional=true)
    protected native CFDictionary copyAttachments(CVAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CVBufferCopyAttachment", optional=true)
    protected native CFType copyAttachment(CFString key, IntPtr attachmentMode);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CVBufferHasAttachment", optional=true)
    protected native boolean hasAttachment(CFString key);
    /*</methods>*/
}
