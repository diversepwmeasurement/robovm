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
package org.robovm.apple.photos;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHObjectChangeDetails<T extends PHObject>/*</name>*/
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHObjectChangeDetailsPtr<T extends PHObject> extends Ptr<PHObjectChangeDetails<T>, PHObjectChangeDetailsPtr<T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHObjectChangeDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHObjectChangeDetails() {}
    protected PHObjectChangeDetails(Handle h, long handle) { super(h, handle); }
    protected PHObjectChangeDetails(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "objectBeforeChanges")
    public native T getObjectBeforeChanges();
    @Property(selector = "objectAfterChanges")
    public native T getObjectAfterChanges();
    @Property(selector = "assetContentChanged")
    public native boolean assetContentChanged();
    @Property(selector = "objectWasDeleted")
    public native boolean objectWasDeleted();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
