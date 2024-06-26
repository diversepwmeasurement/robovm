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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 9.0. UIAlertView is deprecated. Use UIAlertController with a preferredStyle of UIAlertControllerStyleAlert instead
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAlertView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIAlertViewPtr extends Ptr<UIAlertView, UIAlertViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIAlertView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIAlertView() {}
    protected UIAlertView(Handle h, long handle) { super(h, handle); }
    protected UIAlertView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIAlertView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UIAlertView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    
    public UIAlertView(String title, String message, UIAlertViewDelegate delegate, String cancelButtonTitle, 
            String ... otherButtonTitles) {
        super((SkipInit) null);
        initObject(init(title, message, delegate, cancelButtonTitle, 0));
        for (String otherButtonTitle : otherButtonTitles) {
            addButton(otherButtonTitle);
        }
        updateStrongRef(null, delegate);
    }
    
    @Method(selector = "initWithTitle:message:delegate:cancelButtonTitle:otherButtonTitles:")
    protected native @Pointer long init(String title, String message, UIAlertViewDelegate delegate, String cancelButtonTitle, @Pointer long otherButtonTitles);
    
    /*<properties>*/
    @Property(selector = "delegate")
    public native UIAlertViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIAlertViewDelegate v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "numberOfButtons")
    public native @MachineSizedSInt long getNumberOfButtons();
    @Property(selector = "cancelButtonIndex")
    public native @MachineSizedSInt long getCancelButtonIndex();
    @Property(selector = "setCancelButtonIndex:")
    public native void setCancelButtonIndex(@MachineSizedSInt long v);
    @Property(selector = "firstOtherButtonIndex")
    public native @MachineSizedSInt long getFirstOtherButtonIndex();
    @Property(selector = "isVisible")
    public native boolean isVisible();
    @Property(selector = "alertViewStyle")
    public native UIAlertViewStyle getAlertViewStyle();
    @Property(selector = "setAlertViewStyle:")
    public native void setAlertViewStyle(UIAlertViewStyle v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "addButtonWithTitle:")
    public native @MachineSizedSInt long addButton(String title);
    @Method(selector = "buttonTitleAtIndex:")
    public native String getButtonTitle(@MachineSizedSInt long buttonIndex);
    @Method(selector = "show")
    public native void show();
    @Method(selector = "dismissWithClickedButtonIndex:animated:")
    public native void dismiss(@MachineSizedSInt long buttonIndex, boolean animated);
    @Method(selector = "textFieldAtIndex:")
    public native UITextField getTextField(@MachineSizedSInt long textFieldIndex);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
