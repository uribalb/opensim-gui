/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Constraint extends ModelComponent {
  private transient long swigCPtr;

  public Constraint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Constraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Constraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Constraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Constraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Constraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Constraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Constraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Constraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Constraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Constraint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_isEnforced(Constraint source) {
    opensimModelSimulationJNI.Constraint_copyProperty_isEnforced(swigCPtr, this, Constraint.getCPtr(source), source);
  }

  public boolean get_isEnforced(int i) {
    return opensimModelSimulationJNI.Constraint_get_isEnforced__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_isEnforced(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Constraint_upd_isEnforced__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_isEnforced(int i, boolean value) {
    opensimModelSimulationJNI.Constraint_set_isEnforced__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_isEnforced(boolean value) {
    return opensimModelSimulationJNI.Constraint_append_isEnforced(swigCPtr, this, value);
  }

  public void constructProperty_isEnforced(boolean initValue) {
    opensimModelSimulationJNI.Constraint_constructProperty_isEnforced(swigCPtr, this, initValue);
  }

  public boolean get_isEnforced() {
    return opensimModelSimulationJNI.Constraint_get_isEnforced__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_isEnforced() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Constraint_upd_isEnforced__SWIG_1(swigCPtr, this), false);
  }

  public void set_isEnforced(boolean value) {
    opensimModelSimulationJNI.Constraint_set_isEnforced__SWIG_1(swigCPtr, this, value);
  }

  public void updateFromConstraint(State s, Constraint aConstraint) {
    opensimModelSimulationJNI.Constraint_updateFromConstraint(swigCPtr, this, State.getCPtr(s), s, Constraint.getCPtr(aConstraint), aConstraint);
  }

  public boolean isEnforced(State s) {
    return opensimModelSimulationJNI.Constraint_isEnforced(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean setIsEnforced(State s, boolean isEnforced) {
    return opensimModelSimulationJNI.Constraint_setIsEnforced(swigCPtr, this, State.getCPtr(s), s, isEnforced);
  }

  public void calcConstraintForces(State s, VectorOfSpatialVec bodyForcesInAncestor, Vector mobilityForces) {
    opensimModelSimulationJNI.Constraint_calcConstraintForces(swigCPtr, this, State.getCPtr(s), s, VectorOfSpatialVec.getCPtr(bodyForcesInAncestor), bodyForcesInAncestor, Vector.getCPtr(mobilityForces), mobilityForces);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelSimulationJNI.Constraint_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelSimulationJNI.Constraint_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelSimulationJNI.Constraint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void setContactPointForInducedAccelerations(State s, Vec3 point) {
    opensimModelSimulationJNI.Constraint_setContactPointForInducedAccelerations(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(point), point);
  }

}
