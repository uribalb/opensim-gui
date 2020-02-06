/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class XsensDataReader extends IMUDataReader {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected XsensDataReader(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.XsensDataReader_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsensDataReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_XsensDataReader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public XsensDataReader() {
    this(opensimCommonJNI.new_XsensDataReader__SWIG_0(), true);
  }

  public XsensDataReader(XsensDataReaderSettings settings) {
    this(opensimCommonJNI.new_XsensDataReader__SWIG_1(XsensDataReaderSettings.getCPtr(settings), settings), true);
  }

  public XsensDataReader(XsensDataReader arg0) {
    this(opensimCommonJNI.new_XsensDataReader__SWIG_2(XsensDataReader.getCPtr(arg0), arg0), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimCommonJNI.XsensDataReader_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new XsensDataReader(cPtr, true);
  }

  public XsensDataReaderSettings getSettings() {
    return new XsensDataReaderSettings(opensimCommonJNI.XsensDataReader_getSettings(swigCPtr, this), false);
  }

  public XsensDataReaderSettings updSettings() {
    return new XsensDataReaderSettings(opensimCommonJNI.XsensDataReader_updSettings(swigCPtr, this), false);
  }

}