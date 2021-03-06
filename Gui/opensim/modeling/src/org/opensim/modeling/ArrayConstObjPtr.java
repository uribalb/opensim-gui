/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayConstObjPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayConstObjPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayConstObjPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ArrayConstObjPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayConstObjPtr(OpenSimObject aDefaultValue, int aSize, int aCapacity) {
    this(opensimCommonJNI.new_ArrayConstObjPtr__SWIG_0(OpenSimObject.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayConstObjPtr(OpenSimObject aDefaultValue, int aSize) {
    this(opensimCommonJNI.new_ArrayConstObjPtr__SWIG_1(OpenSimObject.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayConstObjPtr(OpenSimObject aDefaultValue) {
    this(opensimCommonJNI.new_ArrayConstObjPtr__SWIG_2(OpenSimObject.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayConstObjPtr() {
    this(opensimCommonJNI.new_ArrayConstObjPtr__SWIG_3(), true);
  }

  public ArrayConstObjPtr(ArrayConstObjPtr aArray) {
    this(opensimCommonJNI.new_ArrayConstObjPtr__SWIG_4(ArrayConstObjPtr.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayConstObjPtr aArray) {
    return opensimCommonJNI.ArrayConstObjPtr_arrayEquals(swigCPtr, this, ArrayConstObjPtr.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimCommonJNI.ArrayConstObjPtr_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.ArrayConstObjPtr_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.ArrayConstObjPtr_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimCommonJNI.ArrayConstObjPtr_size(swigCPtr, this);
  }

  public int append(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayConstObjPtr_append__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int append(ArrayConstObjPtr aArray) {
    return opensimCommonJNI.ArrayConstObjPtr_append__SWIG_1(swigCPtr, this, ArrayConstObjPtr.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, OpenSimObject aValue) {
    return opensimCommonJNI.ArrayConstObjPtr_insert(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimCommonJNI.ArrayConstObjPtr_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, OpenSimObject aValue) {
    opensimCommonJNI.ArrayConstObjPtr_set(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aValue), aValue);
  }

  public OpenSimObject get(int aIndex) {
    long cPtr = opensimCommonJNI.ArrayConstObjPtr_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public OpenSimObject getitem(int index) {
    long cPtr = opensimCommonJNI.ArrayConstObjPtr_getitem(swigCPtr, this, index);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void setitem(int index, OpenSimObject val) {
    opensimCommonJNI.ArrayConstObjPtr_setitem(swigCPtr, this, index, OpenSimObject.getCPtr(val), val);
  }

  public OpenSimObject getLast() {
    long cPtr = opensimCommonJNI.ArrayConstObjPtr_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public int findIndex(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayConstObjPtr_findIndex(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int rfindIndex(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayConstObjPtr_rfindIndex(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int searchBinary(OpenSimObject aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimCommonJNI.ArrayConstObjPtr_searchBinary__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(OpenSimObject aValue, boolean aFindFirst, int aLo) {
    return opensimCommonJNI.ArrayConstObjPtr_searchBinary__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(OpenSimObject aValue, boolean aFindFirst) {
    return opensimCommonJNI.ArrayConstObjPtr_searchBinary__SWIG_2(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayConstObjPtr_searchBinary__SWIG_3(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

}
