/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodiesList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public BodiesList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodiesList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_BodiesList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BodiesList(Component root, ComponentFilter f) {
    this(opensimModelJNI.new_BodiesList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public BodiesList(Component root) {
    this(opensimModelJNI.new_BodiesList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public BodyIterator begin() {
    return new BodyIterator(opensimModelJNI.BodiesList_begin(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelJNI.BodiesList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

  public BodyIterator end() {
    return new BodyIterator(opensimModelJNI.BodiesList_end(swigCPtr, this), true);
  }

}