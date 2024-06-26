/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class IDeviceConnectionRef {
  private transient long swigCPtr;

  protected IDeviceConnectionRef(long cPtr, @SuppressWarnings("unused") boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected IDeviceConnectionRef() {
    swigCPtr = 0;
  }

  protected static long getCPtr(IDeviceConnectionRef obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public int hashCode() {
    return 31 + (int) (swigCPtr ^ (swigCPtr >>> 32));
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    IDeviceConnectionRef other = (IDeviceConnectionRef) obj;
    return swigCPtr == other.swigCPtr;
  }
}
