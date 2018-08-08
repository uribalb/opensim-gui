/* -------------------------------------------------------------------------- *
 * OpenSim: EditPreferencesJPanel.java                                        *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */

/*
 * EditPreferencesJPanel.java
 *
 * Created on February 13, 2007, 4:32 PM
 */

package org.opensim.view.actions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.opensim.modeling.OpenSimObject;
import org.opensim.utils.TheApp;
import org.opensim.view.pub.ViewDB;


/**
 *
 * @author  Ayman. Edit user preferences. So far no validation is done on the type 
 * and/or content of what the user types, and cancel doesn't function.
 *
 * @todo: 1. Assert type correctness (hard because types are not maintained by the backing Preferences object
 *        2. Provide type specific editors so that FileBrowser, ColorChooser etc. can be used.
 */
public class EditPreferencesJPanel extends javax.swing.JPanel {
   
   DefaultTableModel preferencesTableModelInstance;
   String[] deprecatedList = new String[] {
       "Screen Background Color",
       "GeometryPath",
       "Muscle Color",
       "MuscleColor",
       "MarkerColor",
       "MusclePointColor",
       "MusclePoint Color",
       "WrapObjectColor",
       "WrapObject Color",
       "ShowWrapObjects",
       "DefaultCloseAction",
       "Display Contact Geometry",
       "BackgroundColor",
       "Markers Color",
       "AntiAliasingFrames",
       "Marker Display Radius",
       "NonCurrentModelOpacity",
       "Refresh Rate (ms.)",
       "Muscle Dsiplay Radius",
       "BuildDate",
       "One Material Meshes",
       "Save Movie Frames",
       "Experimental Marker Size"
   };
   /** Creates new form EditPreferencesJPanel */
   public EditPreferencesJPanel() throws BackingStoreException {
      initComponents();
      jTable1.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
      initContent();
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "User Preferences"));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Option", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

   private Vector<String> filterAndSort(Vector<String> list, String regexp) {
      Vector<String> filtered = new Vector<String>();
      for(int i=list.size()-1; i>=0; i--) {
         if(list.get(i).matches(regexp)) {
            filtered.add(list.get(i));
            list.remove(i);
         }
      }
      Collections.sort(filtered);
      return filtered;
   }
   private void initContent() throws BackingStoreException {
      // Get preferences from TheApp instance and display them
      //String[] options = TheApp.getCurrentVersionPreferences().keys();
      Vector<String> options = new Vector<String>(Arrays.asList(TheApp.getCurrentVersionPreferences().keys()));
      // Some basic sorting
      Vector<String> sortedOptions = new Vector<String>();
      sortedOptions.addAll(filterAndSort(options, ".*Color"));
      sortedOptions.addAll(filterAndSort(options, ".*Path"));
      sortedOptions.addAll(filterAndSort(options, ".*Dir.*"));
      sortedOptions.addAll(filterAndSort(options, ".*")); // whatever's left 
      for(int i=0; i< sortedOptions.size(); i++){
          boolean deprecated = false;
          for(int j=0; j< deprecatedList.length && !deprecated; j++){
              if (sortedOptions.get(i).equalsIgnoreCase(deprecatedList[j]))
                  deprecated=true;
          }
          if (deprecated)
              continue;
         ((DefaultTableModel)jTable1.getModel()).addRow(
                 new Object[]{
                        sortedOptions.get(i),
                        TheApp.getCurrentVersionPreferences().get(sortedOptions.get(i), "")});         
      }
      
   }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   
   
   public void apply()
   {
      TableModel data = jTable1.getModel();
      // Cycle thru and set preferences 
      for(int i=0; i< data.getRowCount(); i++){
         String key = (String)data.getValueAt(i, 0);
         String value = (String)data.getValueAt(i, 1);
         TheApp.getCurrentVersionPreferences().put(key, value);         
         }   
      ViewDB.getInstance().applyPreferences();
      //String saved = TheApp.getCurrentVersionPreferences().get("Debug", "0");
      //int debugLevel = Integer.parseInt(saved);
      //OpenSimObject.setDebugLevel(debugLevel);
     
   }
   
}
