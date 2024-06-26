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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGPath/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGPathPtr extends Ptr<CGPath, CGPathPtr> {}/*</ptr>*/
    
    public interface Applier {
        void apply(CGPathElementType type, CGPoint point1, CGPoint point2, CGPoint point3);
    }
    
    /*<bind>*/static { Bro.bind(CGPath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    
    private static final java.lang.reflect.Method cbApplier;
    
    static {
        try {
            cbApplier = CGPath.class.getDeclaredMethod("cbApplier", long.class, CGPathElement.class);
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
    
    /*<constructors>*/
    protected CGPath() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public static CGPath createCopyByDashingPath(CGPath path, CGAffineTransform transform, double phase, double[] lengths) {
        return createCopyByDashingPath(path, transform, phase, 
                lengths != null ? VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(lengths)) : 0, 
                lengths != null ? lengths.length : 0);
    }
    public static CGPath createCopyByDashingPath(CGPath path, CGAffineTransform transform, double phase, float[] lengths) {
        return createCopyByDashingPath(path, transform, phase, 
                lengths != null ? VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(lengths)) : 0, 
                lengths != null ? lengths.length : 0);
    }
    public void apply(Applier applier) {
        if (applier == null) {
            throw new NullPointerException("applier");
        }
        apply(VM.getObjectAddress(applier), VM.getCallbackMethodImpl(cbApplier));
    }

    @Callback
    private static void cbApplier(@Pointer long applierPtr, CGPathElement element) {
        Applier applier = (Applier) VM.castAddressToObject(applierPtr);
        CGPoint point1 = null;
        CGPoint point2 = null;
        CGPoint point3 = null;
        switch (element.getType()) {
        case AddLineToPoint:
        case MoveToPoint:
            point1 = element.getPoints();
            break;
        case AddQuadCurveToPoint:
            point1 = element.getPoints();
            point2 = point1.next();
            break;
        case AddCurveToPoint:
            point1 = element.getPoints();
            point2 = point1.next();
            point3 = point2.next();
            break;
        case CloseSubpath:
            break;
        }
        applier.apply(element.getType(), point1, point2, point3);
    }
    /*<methods>*/
    @Bridge(symbol="CGPathGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CGPathCreateCopy", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopy(CGPath path);
    @Bridge(symbol="CGPathCreateCopyByTransformingPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByTransformingPath(CGPath path, CGAffineTransform transform);
    @Bridge(symbol="CGPathCreateWithRect", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createWithRect(@ByVal CGRect rect, CGAffineTransform transform);
    @Bridge(symbol="CGPathCreateWithEllipseInRect", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createWithEllipseInRect(@ByVal CGRect rect, CGAffineTransform transform);
    @Bridge(symbol="CGPathCreateWithRoundedRect", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createWithRoundedRect(@ByVal CGRect rect, @MachineSizedFloat double cornerWidth, @MachineSizedFloat double cornerHeight, CGAffineTransform transform);
    @Bridge(symbol="CGPathCreateCopyByDashingPath", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByDashingPath(CGPath path, CGAffineTransform transform, @MachineSizedFloat double phase, @Pointer long lengths, @MachineSizedUInt long count);
    @Bridge(symbol="CGPathCreateCopyByStrokingPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByStrokingPath(CGPath path, CGAffineTransform transform, @MachineSizedFloat double lineWidth, CGLineCap lineCap, CGLineJoin lineJoin, @MachineSizedFloat double miterLimit);
    @Bridge(symbol="CGPathEqualToPath", optional=true)
    public native boolean equalsTo(CGPath path2);
    @Bridge(symbol="CGPathIsEmpty", optional=true)
    public native boolean isEmpty();
    @Bridge(symbol="CGPathIsRect", optional=true)
    public native boolean isRect(CGRect rect);
    @Bridge(symbol="CGPathGetCurrentPoint", optional=true)
    public native @ByVal CGPoint getCurrentPoint();
    @Bridge(symbol="CGPathGetBoundingBox", optional=true)
    public native @ByVal CGRect getBoundingBox();
    @Bridge(symbol="CGPathGetPathBoundingBox", optional=true)
    public native @ByVal CGRect getPathBoundingBox();
    @Bridge(symbol="CGPathContainsPoint", optional=true)
    public native boolean containsPoint(CGAffineTransform m, @ByVal CGPoint point, boolean eoFill);
    @Bridge(symbol="CGPathApply", optional=true)
    private native void apply(@Pointer long info, @Pointer long function);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CGPathApplyWithBlock", optional=true)
    public native void applyWithBlock(@Block VoidBlock1<CGPathElement> block);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyByNormalizing", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByNormalizing(CGPath path, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyByUnioningPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByUnioningPath(CGPath path, CGPath maskPath, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyByIntersectingPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByIntersectingPath(CGPath path, CGPath maskPath, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyBySubtractingPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyBySubtractingPath(CGPath path, CGPath maskPath, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyBySymmetricDifferenceOfPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyBySymmetricDifferenceOfPath(CGPath path, CGPath maskPath, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyOfLineBySubtractingPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyOfLineBySubtractingPath(CGPath path, CGPath maskPath, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyOfLineByIntersectingPath", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyOfLineByIntersectingPath(CGPath path, CGPath maskPath, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateSeparateComponents", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createSeparateComponents(CGPath path, boolean evenOddFillRule);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathCreateCopyByFlattening", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPath createCopyByFlattening(CGPath path, @MachineSizedFloat double flatteningThreshold);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGPathIntersectsPath", optional=true)
    public native boolean intersectsPath(CGPath path2, boolean evenOddFillRule);
    /*</methods>*/
}
