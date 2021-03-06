/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorBaseRotation extends MatrixBaseRotation {
  private transient long swigCPtr;

  public VectorBaseRotation(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorBaseRotation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorBaseRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorBaseRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorBaseRotation(int m) {
    this(opensimSimbodyJNI.new_VectorBaseRotation__SWIG_0(m), true);
  }

  public VectorBaseRotation() {
    this(opensimSimbodyJNI.new_VectorBaseRotation__SWIG_1(), true);
  }

  public VectorBaseRotation(VectorBaseRotation source) {
    this(opensimSimbodyJNI.new_VectorBaseRotation__SWIG_2(VectorBaseRotation.getCPtr(source), source), true);
  }

  public int size() {
    return opensimSimbodyJNI.VectorBaseRotation_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.VectorBaseRotation_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.VectorBaseRotation_ncol(swigCPtr, this);
  }

  public VectorBaseRotation resize(int m) {
    return new VectorBaseRotation(opensimSimbodyJNI.VectorBaseRotation_resize(swigCPtr, this, m), false);
  }

  public VectorBaseRotation resizeKeep(int m) {
    return new VectorBaseRotation(opensimSimbodyJNI.VectorBaseRotation_resizeKeep(swigCPtr, this, m), false);
  }

  public void clear() {
    opensimSimbodyJNI.VectorBaseRotation_clear(swigCPtr, this);
  }

  public Rotation sum() {
    return new Rotation(opensimSimbodyJNI.VectorBaseRotation_sum(swigCPtr, this), true);
  }

}
