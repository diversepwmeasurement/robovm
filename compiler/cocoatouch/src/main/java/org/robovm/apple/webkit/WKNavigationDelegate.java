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
package org.robovm.apple.webkit;

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
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
@ForceLinkClass(WKNSURLAuthenticationChallenge.class) // FIXME: manually added to workaround issue #336
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/WKNavigationDelegate/*</name>*/
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "webView:decidePolicyForNavigationAction:decisionHandler:")
    void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, @Block VoidBlock1<WKNavigationActionPolicy> decisionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:decidePolicyForNavigationAction:preferences:decisionHandler:")
    void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, WKWebpagePreferences preferences, @Block VoidBlock2<WKNavigationActionPolicy, WKWebpagePreferences> decisionHandler);
    @Method(selector = "webView:decidePolicyForNavigationResponse:decisionHandler:")
    void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse, @Block VoidBlock1<WKNavigationResponsePolicy> decisionHandler);
    @Method(selector = "webView:didStartProvisionalNavigation:")
    void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didReceiveServerRedirectForProvisionalNavigation:")
    void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFailProvisionalNavigation:withError:")
    void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Method(selector = "webView:didCommitNavigation:")
    void didCommitNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFinishNavigation:")
    void didFinishNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFailNavigation:withError:")
    void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Method(selector = "webView:didReceiveAuthenticationChallenge:completionHandler:")
    void didReceiveAuthenticationChallenge(WKWebView webView, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "webViewWebContentProcessDidTerminate:")
    void webContentProcessDidTerminate(WKWebView webView);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "webView:authenticationChallenge:shouldAllowDeprecatedTLS:")
    void shouldAllowDeprecatedTLS(WKWebView webView, NSURLAuthenticationChallenge challenge, @Block VoidBooleanBlock decisionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "webView:navigationAction:didBecomeDownload:")
    void didBecomeDownload(WKWebView webView, WKNavigationAction navigationAction, WKDownload download);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "webView:navigationResponse:didBecomeDownload:")
    void didBecomeDownload(WKWebView webView, WKNavigationResponse navigationResponse, WKDownload download);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
