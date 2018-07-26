/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;
import javax.swing.JOptionPane;import java.awt.GraphicsEnvironment;
public class opensimExampleComponentsJNI {

  static {
      try{
          // All OpenSim classes required for GUI operation.
          System.loadLibrary("osimJavaJNI");
      }
      catch(UnsatisfiedLinkError e){
          String OS = System.getProperty("os.name").toLowerCase();
          String tip = "";
          if (OS.indexOf("win") >= 0) {
              tip = "\nMake sure OpenSim's bin directory is on your PATH.";
          } else if (OS.indexOf("mac") >= 0) {
              // Nothing for now; our use of RPATH means we were probably able
              // to locate the OpenSim dynamic libraries.
          } else /* linux */ {
              // Nothing for now; our use of RPATH means we were probably able
              // to locate the OpenSim dynamic libraries.
          }
          String msg = new String(
                  "Failed to load one or more dynamic libraries for OpenSim.\n"
                  + e + tip);

          String javaHome = System.getProperties().getProperty("java.home");
          boolean inMatlab = javaHome.toLowerCase().indexOf("matlab") >= 0;
          if (inMatlab) {
              msg +=  "\nSee https://simtk-confluence.stanford.edu/display/OpenSim40/Scripting+with+Matlab";
          }
          
          System.out.println(msg);
          String title = "Error: Failed to load OpenSim libraries";
          if (!GraphicsEnvironment.isHeadless()) {
              new JOptionPane(msg, JOptionPane.ERROR_MESSAGE)
                    .createDialog(null, title).setVisible(true);
          }
      }
  }

  public final static native long ToyReflexController_safeDownCast(long jarg1, OpenSimObject jarg1_);
  public final static native void ToyReflexController_assign(long jarg1, ToyReflexController jarg1_, long jarg2, OpenSimObject jarg2_);
  public final static native String ToyReflexController_getClassName();
  public final static native long ToyReflexController_clone(long jarg1, ToyReflexController jarg1_);
  public final static native String ToyReflexController_getConcreteClassName(long jarg1, ToyReflexController jarg1_);
  public final static native void ToyReflexController_copyProperty_gain(long jarg1, ToyReflexController jarg1_, long jarg2, ToyReflexController jarg2_);
  public final static native double ToyReflexController_get_gain__SWIG_0(long jarg1, ToyReflexController jarg1_, int jarg2);
  public final static native long ToyReflexController_upd_gain__SWIG_0(long jarg1, ToyReflexController jarg1_, int jarg2);
  public final static native void ToyReflexController_set_gain__SWIG_0(long jarg1, ToyReflexController jarg1_, int jarg2, double jarg3);
  public final static native int ToyReflexController_append_gain(long jarg1, ToyReflexController jarg1_, double jarg2);
  public final static native void ToyReflexController_constructProperty_gain(long jarg1, ToyReflexController jarg1_, double jarg2);
  public final static native double ToyReflexController_get_gain__SWIG_1(long jarg1, ToyReflexController jarg1_);
  public final static native long ToyReflexController_upd_gain__SWIG_1(long jarg1, ToyReflexController jarg1_);
  public final static native void ToyReflexController_set_gain__SWIG_1(long jarg1, ToyReflexController jarg1_, double jarg2);
  public final static native long new_ToyReflexController__SWIG_0();
  public final static native long new_ToyReflexController__SWIG_1(double jarg1);
  public final static native void ToyReflexController_computeControls(long jarg1, ToyReflexController jarg1_, long jarg2, State jarg2_, long jarg3, Vector jarg3_);
  public final static native void delete_ToyReflexController(long jarg1);
  public final static native long ToyPropMyoController_safeDownCast(long jarg1, OpenSimObject jarg1_);
  public final static native void ToyPropMyoController_assign(long jarg1, ToyPropMyoController jarg1_, long jarg2, OpenSimObject jarg2_);
  public final static native String ToyPropMyoController_getClassName();
  public final static native long ToyPropMyoController_clone(long jarg1, ToyPropMyoController jarg1_);
  public final static native String ToyPropMyoController_getConcreteClassName(long jarg1, ToyPropMyoController jarg1_);
  public final static native void ToyPropMyoController_copyProperty_gain(long jarg1, ToyPropMyoController jarg1_, long jarg2, ToyPropMyoController jarg2_);
  public final static native double ToyPropMyoController_get_gain__SWIG_0(long jarg1, ToyPropMyoController jarg1_, int jarg2);
  public final static native long ToyPropMyoController_upd_gain__SWIG_0(long jarg1, ToyPropMyoController jarg1_, int jarg2);
  public final static native void ToyPropMyoController_set_gain__SWIG_0(long jarg1, ToyPropMyoController jarg1_, int jarg2, double jarg3);
  public final static native int ToyPropMyoController_append_gain(long jarg1, ToyPropMyoController jarg1_, double jarg2);
  public final static native void ToyPropMyoController_constructProperty_gain(long jarg1, ToyPropMyoController jarg1_, double jarg2);
  public final static native double ToyPropMyoController_get_gain__SWIG_1(long jarg1, ToyPropMyoController jarg1_);
  public final static native long ToyPropMyoController_upd_gain__SWIG_1(long jarg1, ToyPropMyoController jarg1_);
  public final static native void ToyPropMyoController_set_gain__SWIG_1(long jarg1, ToyPropMyoController jarg1_, double jarg2);
  public final static native void ToyPropMyoController_PropertyIndex_socket_actuator_connectee_name_set(long jarg1, ToyPropMyoController jarg1_, long jarg2);
  public final static native long ToyPropMyoController_PropertyIndex_socket_actuator_connectee_name_get(long jarg1, ToyPropMyoController jarg1_);
  public final static native void ToyPropMyoController_connectSocket_actuator(long jarg1, ToyPropMyoController jarg1_, long jarg2, OpenSimObject jarg2_);
  public final static native void ToyPropMyoController_PropertyIndex_input_activation_connectee_name_set(long jarg1, ToyPropMyoController jarg1_, long jarg2);
  public final static native long ToyPropMyoController_PropertyIndex_input_activation_connectee_name_get(long jarg1, ToyPropMyoController jarg1_);
  public final static native void ToyPropMyoController_connectInput_activation__SWIG_0(long jarg1, ToyPropMyoController jarg1_, long jarg2, AbstractOutput jarg2_, String jarg3);
  public final static native void ToyPropMyoController_connectInput_activation__SWIG_1(long jarg1, ToyPropMyoController jarg1_, long jarg2, AbstractOutput jarg2_);
  public final static native void ToyPropMyoController_connectInput_activation__SWIG_2(long jarg1, ToyPropMyoController jarg1_, long jarg2, AbstractChannel jarg2_, String jarg3);
  public final static native void ToyPropMyoController_connectInput_activation__SWIG_3(long jarg1, ToyPropMyoController jarg1_, long jarg2, AbstractChannel jarg2_);
  public final static native void ToyPropMyoController__has_output_myo_control_set(long jarg1, ToyPropMyoController jarg1_, boolean jarg2);
  public final static native boolean ToyPropMyoController__has_output_myo_control_get(long jarg1, ToyPropMyoController jarg1_);
  public final static native long new_ToyPropMyoController();
  public final static native double ToyPropMyoController_computeControl(long jarg1, ToyPropMyoController jarg1_, long jarg2, State jarg2_);
  public final static native void ToyPropMyoController_computeControls(long jarg1, ToyPropMyoController jarg1_, long jarg2, State jarg2_, long jarg3, Vector jarg3_);
  public final static native void delete_ToyPropMyoController(long jarg1);
  public final static native long HopperDevice_safeDownCast(long jarg1, OpenSimObject jarg1_);
  public final static native void HopperDevice_assign(long jarg1, HopperDevice jarg1_, long jarg2, OpenSimObject jarg2_);
  public final static native String HopperDevice_getClassName();
  public final static native long HopperDevice_clone(long jarg1, HopperDevice jarg1_);
  public final static native String HopperDevice_getConcreteClassName(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice__has_output_length_set(long jarg1, HopperDevice jarg1_, boolean jarg2);
  public final static native boolean HopperDevice__has_output_length_get(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice__has_output_speed_set(long jarg1, HopperDevice jarg1_, boolean jarg2);
  public final static native boolean HopperDevice__has_output_speed_get(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice__has_output_tension_set(long jarg1, HopperDevice jarg1_, boolean jarg2);
  public final static native boolean HopperDevice__has_output_tension_get(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice__has_output_power_set(long jarg1, HopperDevice jarg1_, boolean jarg2);
  public final static native boolean HopperDevice__has_output_power_get(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice__has_output_height_set(long jarg1, HopperDevice jarg1_, boolean jarg2);
  public final static native boolean HopperDevice__has_output_height_get(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice__has_output_com_height_set(long jarg1, HopperDevice jarg1_, boolean jarg2);
  public final static native boolean HopperDevice__has_output_com_height_get(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice_copyProperty_actuator_name(long jarg1, HopperDevice jarg1_, long jarg2, HopperDevice jarg2_);
  public final static native String HopperDevice_get_actuator_name__SWIG_0(long jarg1, HopperDevice jarg1_, int jarg2);
  public final static native long HopperDevice_upd_actuator_name__SWIG_0(long jarg1, HopperDevice jarg1_, int jarg2);
  public final static native void HopperDevice_set_actuator_name__SWIG_0(long jarg1, HopperDevice jarg1_, int jarg2, String jarg3);
  public final static native int HopperDevice_append_actuator_name(long jarg1, HopperDevice jarg1_, String jarg2);
  public final static native void HopperDevice_constructProperty_actuator_name(long jarg1, HopperDevice jarg1_, String jarg2);
  public final static native String HopperDevice_get_actuator_name__SWIG_1(long jarg1, HopperDevice jarg1_);
  public final static native long HopperDevice_upd_actuator_name__SWIG_1(long jarg1, HopperDevice jarg1_);
  public final static native void HopperDevice_set_actuator_name__SWIG_1(long jarg1, HopperDevice jarg1_, String jarg2);
  public final static native long new_HopperDevice();
  public final static native double HopperDevice_getLength(long jarg1, HopperDevice jarg1_, long jarg2, State jarg2_);
  public final static native double HopperDevice_getSpeed(long jarg1, HopperDevice jarg1_, long jarg2, State jarg2_);
  public final static native double HopperDevice_getTension(long jarg1, HopperDevice jarg1_, long jarg2, State jarg2_);
  public final static native double HopperDevice_getPower(long jarg1, HopperDevice jarg1_, long jarg2, State jarg2_);
  public final static native double HopperDevice_getHeight(long jarg1, HopperDevice jarg1_, long jarg2, State jarg2_);
  public final static native double HopperDevice_getCenterOfMassHeight(long jarg1, HopperDevice jarg1_, long jarg2, State jarg2_);
  public final static native void delete_HopperDevice(long jarg1);
  public final static native long ToyReflexController_SWIGUpcast(long jarg1);
  public final static native long ToyPropMyoController_SWIGUpcast(long jarg1);
  public final static native long HopperDevice_SWIGUpcast(long jarg1);
}
