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
package org.robovm.apple.storekit;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPaymentTransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKPaymentTransactionPtr extends Ptr<SKPaymentTransaction, SKPaymentTransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPaymentTransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPaymentTransaction() {}
    protected SKPaymentTransaction(Handle h, long handle) { super(h, handle); }
    protected SKPaymentTransaction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "originalTransaction")
    public native SKPaymentTransaction getOriginalTransaction();
    @Property(selector = "payment")
    public native SKPayment getPayment();
    /**
     * @deprecated Deprecated in iOS 16.0. Hosted content is no longer supported
     */
    @Deprecated
    @Property(selector = "downloads")
    public native NSArray<SKDownload> getDownloads();
    @Property(selector = "transactionDate")
    public native NSDate getTransactionDate();
    @Property(selector = "transactionIdentifier")
    public native String getTransactionIdentifier();
    /**
     * @deprecated Deprecated in iOS 7.0. Use -[NSBundle appStoreReceiptURL]
     */
    @Deprecated
    @Property(selector = "transactionReceipt")
    public native NSData getTransactionReceipt();
    @Property(selector = "transactionState")
    public native SKPaymentTransactionState getTransactionState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
