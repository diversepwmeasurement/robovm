/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public enum MobileImageMounterError {
  MOBILE_IMAGE_MOUNTER_E_SUCCESS(0),
  MOBILE_IMAGE_MOUNTER_E_INVALID_ARG(-1),
  MOBILE_IMAGE_MOUNTER_E_PLIST_ERROR(-2),
  MOBILE_IMAGE_MOUNTER_E_CONN_FAILED(-3),
  MOBILE_IMAGE_MOUNTER_E_COMMAND_FAILED(-4),
  MOBILE_IMAGE_MOUNTER_E_DEVICE_LOCKED(-5),
  MOBILE_IMAGE_MOUNTER_E_UNKNOWN_ERROR(-256);

  public final int swigValue() {
    return swigValue;
  }

  public static MobileImageMounterError swigToEnum(int swigValue) {
    MobileImageMounterError[] swigValues = MobileImageMounterError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (MobileImageMounterError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + MobileImageMounterError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private MobileImageMounterError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private MobileImageMounterError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private MobileImageMounterError(MobileImageMounterError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

