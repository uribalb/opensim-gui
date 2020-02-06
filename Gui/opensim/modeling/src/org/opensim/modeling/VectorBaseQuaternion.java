/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorBaseQuaternion extends MatrixBaseQuaternion {
  private transient long swigCPtr;

  public VectorBaseQuaternion(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorBaseQuaternion_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorBaseQuaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorBaseQuaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorBaseQuaternion(int m) {
    this(opensimSimbodyJNI.new_VectorBaseQuaternion__SWIG_0(m), true);
  }

  public VectorBaseQuaternion() {
    this(opensimSimbodyJNI.new_VectorBaseQuaternion__SWIG_1(), true);
  }

  public VectorBaseQuaternion(VectorBaseQuaternion source) {
    this(opensimSimbodyJNI.new_VectorBaseQuaternion__SWIG_2(VectorBaseQuaternion.getCPtr(source), source), true);
  }

  public int size() {
    return opensimSimbodyJNI.VectorBaseQuaternion_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.VectorBaseQuaternion_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.VectorBaseQuaternion_ncol(swigCPtr, this);
  }

  public VectorBaseQuaternion resize(int m) {
    return new VectorBaseQuaternion(opensimSimbodyJNI.VectorBaseQuaternion_resize(swigCPtr, this, m), false);
  }

  public VectorBaseQuaternion resizeKeep(int m) {
    return new VectorBaseQuaternion(opensimSimbodyJNI.VectorBaseQuaternion_resizeKeep(swigCPtr, this, m), false);
  }

  public void clear() {
    opensimSimbodyJNI.VectorBaseQuaternion_clear(swigCPtr, this);
  }

  public Quaternion sum() {
    return new Quaternion(opensimSimbodyJNI.VectorBaseQuaternion_sum(swigCPtr, this), true);
  }

}