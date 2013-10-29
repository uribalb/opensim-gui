/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ReferenceDouble extends OpenSimObject {
  private long swigCPtr;

  public ReferenceDouble(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ReferenceDouble_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ReferenceDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ReferenceDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ReferenceDouble safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ReferenceDouble_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ReferenceDouble(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ReferenceDouble_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ReferenceDouble_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ReferenceDouble_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ReferenceDouble(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ReferenceDouble_getConcreteClassName(swigCPtr, this);
  }

  public int getNumRefs() {
    return opensimModelJNI.ReferenceDouble_getNumRefs(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__VecT_2_double_1_t getValidTimeRange() {
    return new SWIGTYPE_p_SimTK__VecT_2_double_1_t(opensimModelJNI.ReferenceDouble_getValidTimeRange(swigCPtr, this), true);
  }

  public SWIGTYPE_p_SimTK__Array_T_std__string_unsigned_int_t getNames() {
    return new SWIGTYPE_p_SimTK__Array_T_std__string_unsigned_int_t(opensimModelJNI.ReferenceDouble_getNames(swigCPtr, this), false);
  }

  public void getValues(State s, SimTKArrayDouble values) {
    opensimModelJNI.ReferenceDouble_getValues__SWIG_0(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(values), values);
  }

  public void getWeights(State s, SimTKArrayDouble weights) {
    opensimModelJNI.ReferenceDouble_getWeights__SWIG_0(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public SimTKArrayDouble getValues(State s) {
    return new SimTKArrayDouble(opensimModelJNI.ReferenceDouble_getValues__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public SimTKArrayDouble getWeights(State s) {
    return new SimTKArrayDouble(opensimModelJNI.ReferenceDouble_getWeights__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

}