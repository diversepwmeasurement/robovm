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
package org.robovm.apple.safariservices;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SafariServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSafariViewControllerDataStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSafariViewControllerDataStorePtr extends Ptr<SFSafariViewControllerDataStore, SFSafariViewControllerDataStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSafariViewControllerDataStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SFSafariViewControllerDataStore() {}
    protected SFSafariViewControllerDataStore(Handle h, long handle) { super(h, handle); }
    protected SFSafariViewControllerDataStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultDataStore")
    public static native SFSafariViewControllerDataStore getDefaultDataStore();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "clearWebsiteDataWithCompletionHandler:")
    public native void clearWebsiteData(@Block Runnable completion);
    /*</methods>*/
}
