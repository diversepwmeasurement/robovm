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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
@Marshaler(/*<name>*/CFStreamSocketSOCKSProxy/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFStreamSocketSOCKSProxy/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFStreamSocketSOCKSProxy toObject(Class<CFStreamSocketSOCKSProxy> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CFStreamSocketSOCKSProxy(o);
        }
        @MarshalsPointer
        public static long toNative(CFStreamSocketSOCKSProxy o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFStreamSocketSOCKSProxy> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFStreamSocketSOCKSProxy> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CFStreamSocketSOCKSProxy(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFStreamSocketSOCKSProxy> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFStreamSocketSOCKSProxy i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CFStreamSocketSOCKSProxy(CFDictionary data) {
        super(data);
    }
    public CFStreamSocketSOCKSProxy() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CFString key) {
        return data.containsKey(key);
    }
    public <T extends NativeObject> T get(CFString key, Class<T> type) {
        if (has(key)) {
            return data.get(key, type);
        }
        return null;
    }
    public CFStreamSocketSOCKSProxy set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public String getHost() {
        if (has(Keys.ProxyHost())) {
            CFString val = get(Keys.ProxyHost(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CFStreamSocketSOCKSProxy setHost(String host) {
        set(Keys.ProxyHost(), new CFString(host));
        return this;
    }
    public int getPort() {
        if (has(Keys.ProxyPort())) {
            CFNumber val = get(Keys.ProxyPort(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CFStreamSocketSOCKSProxy setPort(int port) {
        set(Keys.ProxyPort(), CFNumber.valueOf(port));
        return this;
    }
    public CFStreamSocketSOCKSVersion getVersion() {
        if (has(Keys.Version())) {
            CFString val = get(Keys.Version(), CFString.class);
            return CFStreamSocketSOCKSVersion.valueOf(val);
        }
        return null;
    }
    public CFStreamSocketSOCKSProxy setVersion(CFStreamSocketSOCKSVersion version) {
        set(Keys.Version(), version.value());
        return this;
    }
    public String getUser() {
        if (has(Keys.User())) {
            CFString val = get(Keys.User(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CFStreamSocketSOCKSProxy setUser(String user) {
        set(Keys.User(), new CFString(user));
        return this;
    }
    public String getPassword() {
        if (has(Keys.Password())) {
            CFString val = get(Keys.Password(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CFStreamSocketSOCKSProxy setPassword(String password) {
        set(Keys.Password(), new CFString(password));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCFStreamPropertySOCKSProxyHost", optional=true)
        public static native CFString ProxyHost();
        @GlobalValue(symbol="kCFStreamPropertySOCKSProxyPort", optional=true)
        public static native CFString ProxyPort();
        @GlobalValue(symbol="kCFStreamPropertySOCKSVersion", optional=true)
        public static native CFString Version();
        @GlobalValue(symbol="kCFStreamPropertySOCKSUser", optional=true)
        public static native CFString User();
        @GlobalValue(symbol="kCFStreamPropertySOCKSPassword", optional=true)
        public static native CFString Password();
    }
    /*</keys>*/
}
