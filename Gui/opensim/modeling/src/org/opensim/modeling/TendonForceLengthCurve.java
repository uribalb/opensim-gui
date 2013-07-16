/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TendonForceLengthCurve extends Function {
  private long swigCPtr;

  public TendonForceLengthCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.TendonForceLengthCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TendonForceLengthCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_TendonForceLengthCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TendonForceLengthCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.TendonForceLengthCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TendonForceLengthCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.TendonForceLengthCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.TendonForceLengthCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.TendonForceLengthCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TendonForceLengthCurve(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.TendonForceLengthCurve_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_strain_at_one_norm_force(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.TendonForceLengthCurve_PropertyIndex_strain_at_one_norm_force_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_strain_at_one_norm_force() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.TendonForceLengthCurve_PropertyIndex_strain_at_one_norm_force_get(swigCPtr, this), true);
  }

  public void copyProperty_strain_at_one_norm_force(TendonForceLengthCurve source) {
    opensimModelJNI.TendonForceLengthCurve_copyProperty_strain_at_one_norm_force(swigCPtr, this, TendonForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_strain_at_one_norm_force() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_getProperty_strain_at_one_norm_force(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_strain_at_one_norm_force() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_updProperty_strain_at_one_norm_force(swigCPtr, this), false);
  }

  public double get_strain_at_one_norm_force(int i) {
    return opensimModelJNI.TendonForceLengthCurve_get_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_strain_at_one_norm_force(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_strain_at_one_norm_force(int i, double value) {
    opensimModelJNI.TendonForceLengthCurve_set_strain_at_one_norm_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_strain_at_one_norm_force(double value) {
    return opensimModelJNI.TendonForceLengthCurve_append_strain_at_one_norm_force(swigCPtr, this, value);
  }

  public void constructProperty_strain_at_one_norm_force(double initValue) {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_strain_at_one_norm_force(swigCPtr, this, initValue);
  }

  public double get_strain_at_one_norm_force() {
    return opensimModelJNI.TendonForceLengthCurve_get_strain_at_one_norm_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_strain_at_one_norm_force() {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_strain_at_one_norm_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_strain_at_one_norm_force(double value) {
    opensimModelJNI.TendonForceLengthCurve_set_strain_at_one_norm_force__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_stiffness_at_one_norm_force(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.TendonForceLengthCurve_PropertyIndex_stiffness_at_one_norm_force_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_stiffness_at_one_norm_force() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.TendonForceLengthCurve_PropertyIndex_stiffness_at_one_norm_force_get(swigCPtr, this), true);
  }

  public void copyProperty_stiffness_at_one_norm_force(TendonForceLengthCurve source) {
    opensimModelJNI.TendonForceLengthCurve_copyProperty_stiffness_at_one_norm_force(swigCPtr, this, TendonForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_stiffness_at_one_norm_force() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_getProperty_stiffness_at_one_norm_force(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_stiffness_at_one_norm_force() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_updProperty_stiffness_at_one_norm_force(swigCPtr, this), false);
  }

  public double get_stiffness_at_one_norm_force(int i) {
    return opensimModelJNI.TendonForceLengthCurve_get_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness_at_one_norm_force(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness_at_one_norm_force(int i, double value) {
    opensimModelJNI.TendonForceLengthCurve_set_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness_at_one_norm_force(double value) {
    return opensimModelJNI.TendonForceLengthCurve_append_stiffness_at_one_norm_force(swigCPtr, this, value);
  }

  public void constructProperty_stiffness_at_one_norm_force() {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_stiffness_at_one_norm_force__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_stiffness_at_one_norm_force(double initValue) {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_stiffness_at_one_norm_force() {
    return opensimModelJNI.TendonForceLengthCurve_get_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness_at_one_norm_force() {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness_at_one_norm_force(double value) {
    opensimModelJNI.TendonForceLengthCurve_set_stiffness_at_one_norm_force__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_norm_force_at_toe_end(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.TendonForceLengthCurve_PropertyIndex_norm_force_at_toe_end_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_norm_force_at_toe_end() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.TendonForceLengthCurve_PropertyIndex_norm_force_at_toe_end_get(swigCPtr, this), true);
  }

  public void copyProperty_norm_force_at_toe_end(TendonForceLengthCurve source) {
    opensimModelJNI.TendonForceLengthCurve_copyProperty_norm_force_at_toe_end(swigCPtr, this, TendonForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_norm_force_at_toe_end() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_getProperty_norm_force_at_toe_end(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_norm_force_at_toe_end() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_updProperty_norm_force_at_toe_end(swigCPtr, this), false);
  }

  public double get_norm_force_at_toe_end(int i) {
    return opensimModelJNI.TendonForceLengthCurve_get_norm_force_at_toe_end__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_norm_force_at_toe_end(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_norm_force_at_toe_end__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_norm_force_at_toe_end(int i, double value) {
    opensimModelJNI.TendonForceLengthCurve_set_norm_force_at_toe_end__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_norm_force_at_toe_end(double value) {
    return opensimModelJNI.TendonForceLengthCurve_append_norm_force_at_toe_end(swigCPtr, this, value);
  }

  public void constructProperty_norm_force_at_toe_end() {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_norm_force_at_toe_end__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_norm_force_at_toe_end(double initValue) {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_norm_force_at_toe_end__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_norm_force_at_toe_end() {
    return opensimModelJNI.TendonForceLengthCurve_get_norm_force_at_toe_end__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_norm_force_at_toe_end() {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_norm_force_at_toe_end__SWIG_1(swigCPtr, this), false);
  }

  public void set_norm_force_at_toe_end(double value) {
    opensimModelJNI.TendonForceLengthCurve_set_norm_force_at_toe_end__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_curviness(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.TendonForceLengthCurve_PropertyIndex_curviness_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_curviness() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.TendonForceLengthCurve_PropertyIndex_curviness_get(swigCPtr, this), true);
  }

  public void copyProperty_curviness(TendonForceLengthCurve source) {
    opensimModelJNI.TendonForceLengthCurve_copyProperty_curviness(swigCPtr, this, TendonForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_curviness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_getProperty_curviness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_curviness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.TendonForceLengthCurve_updProperty_curviness(swigCPtr, this), false);
  }

  public double get_curviness(int i) {
    return opensimModelJNI.TendonForceLengthCurve_get_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_curviness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_curviness(int i, double value) {
    opensimModelJNI.TendonForceLengthCurve_set_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_curviness(double value) {
    return opensimModelJNI.TendonForceLengthCurve_append_curviness(swigCPtr, this, value);
  }

  public void constructProperty_curviness() {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_curviness__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_curviness(double initValue) {
    opensimModelJNI.TendonForceLengthCurve_constructProperty_curviness__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_curviness() {
    return opensimModelJNI.TendonForceLengthCurve_get_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_curviness() {
    return new SWIGTYPE_p_double(opensimModelJNI.TendonForceLengthCurve_upd_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_curviness(double value) {
    opensimModelJNI.TendonForceLengthCurve_set_curviness__SWIG_1(swigCPtr, this, value);
  }

  public TendonForceLengthCurve() {
    this(opensimModelJNI.new_TendonForceLengthCurve__SWIG_0(), true);
  }

  public TendonForceLengthCurve(double strainAtOneNormForce, double stiffnessAtOneNormForce, double normForceAtToeEnd, double curviness) {
    this(opensimModelJNI.new_TendonForceLengthCurve__SWIG_1(strainAtOneNormForce, stiffnessAtOneNormForce, normForceAtToeEnd, curviness), true);
  }

  public TendonForceLengthCurve(double strainAtOneNormForce) {
    this(opensimModelJNI.new_TendonForceLengthCurve__SWIG_2(strainAtOneNormForce), true);
  }

  public double getStrainAtOneNormForce() {
    return opensimModelJNI.TendonForceLengthCurve_getStrainAtOneNormForce(swigCPtr, this);
  }

  public double getStiffnessAtOneNormForceInUse() {
    return opensimModelJNI.TendonForceLengthCurve_getStiffnessAtOneNormForceInUse(swigCPtr, this);
  }

  public double getNormForceAtToeEndInUse() {
    return opensimModelJNI.TendonForceLengthCurve_getNormForceAtToeEndInUse(swigCPtr, this);
  }

  public double getCurvinessInUse() {
    return opensimModelJNI.TendonForceLengthCurve_getCurvinessInUse(swigCPtr, this);
  }

  public boolean isFittedCurveBeingUsed() {
    return opensimModelJNI.TendonForceLengthCurve_isFittedCurveBeingUsed(swigCPtr, this);
  }

  public void setStrainAtOneNormForce(double aStrainAtOneNormForce) {
    opensimModelJNI.TendonForceLengthCurve_setStrainAtOneNormForce(swigCPtr, this, aStrainAtOneNormForce);
  }

  public void setOptionalProperties(double aStiffnessAtOneNormForce, double aNormForceAtToeEnd, double aCurviness) {
    opensimModelJNI.TendonForceLengthCurve_setOptionalProperties(swigCPtr, this, aStiffnessAtOneNormForce, aNormForceAtToeEnd, aCurviness);
  }

  public double calcValue(Vector x) {
    return opensimModelJNI.TendonForceLengthCurve_calcValue__SWIG_0(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcValue(double aNormLength) {
    return opensimModelJNI.TendonForceLengthCurve_calcValue__SWIG_1(swigCPtr, this, aNormLength);
  }

  public double calcDerivative(double aNormLength, int order) {
    return opensimModelJNI.TendonForceLengthCurve_calcDerivative(swigCPtr, this, aNormLength, order);
  }

  public double calcIntegral(double aNormLength) {
    return opensimModelJNI.TendonForceLengthCurve_calcIntegral(swigCPtr, this, aNormLength);
  }

  public SWIGTYPE_p_SimTK__VecT_2_double_1_t getCurveDomain() {
    return new SWIGTYPE_p_SimTK__VecT_2_double_1_t(opensimModelJNI.TendonForceLengthCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimModelJNI.TendonForceLengthCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimModelJNI.TendonForceLengthCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
