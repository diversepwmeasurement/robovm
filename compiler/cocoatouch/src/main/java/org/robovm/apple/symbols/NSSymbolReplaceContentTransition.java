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
package org.robovm.apple.symbols;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Symbols") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSSymbolReplaceContentTransition/*</name>*/ 
    extends /*<extends>*/NSSymbolContentTransition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSSymbolReplaceContentTransitionPtr extends Ptr<NSSymbolReplaceContentTransition, NSSymbolReplaceContentTransitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSSymbolReplaceContentTransition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSSymbolReplaceContentTransition() {}
    protected NSSymbolReplaceContentTransition(Handle h, long handle) { super(h, handle); }
    protected NSSymbolReplaceContentTransition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "transitionWithByLayer")
    public native NSSymbolReplaceContentTransition withByLayer();
    @Method(selector = "transitionWithWholeSymbol")
    public native NSSymbolReplaceContentTransition withWholeSymbol();
    @Method(selector = "transition")
    public static native NSSymbolReplaceContentTransition transition();
    @Method(selector = "replaceDownUpTransition")
    public static native NSSymbolReplaceContentTransition replaceDownUpTransition();
    @Method(selector = "replaceUpUpTransition")
    public static native NSSymbolReplaceContentTransition replaceUpUpTransition();
    @Method(selector = "replaceOffUpTransition")
    public static native NSSymbolReplaceContentTransition replaceOffUpTransition();
    /*</methods>*/
}
