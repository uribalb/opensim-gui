/* -------------------------------------------------------------------------- *
 * OpenSim: ConnectionEditor.java                                             *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib, Kevin Xu                                           *
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
package org.opensim.view.nodes;


import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import org.openide.util.Exceptions;
import org.opensim.modeling.*;
import org.opensim.utils.ErrorDialog;
import org.opensim.view.ExplorerTopComponent;
import org.opensim.view.SingleModelGuiElements;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;


/**
 *
 * @author ayman
 */
/**
 *  PropertyEditorAdaptor is an adaptor class to implement the expected signatures for methods to be used
 * by built in property editors. The signatures are along the form:
 * setValueX( X valueToSet)
 * X getValueX()
 * 
 * These signature patterns originate in JavaBeans
 * The actual functionality is implemented by the native side class PropertyHelper that can leverage RTTI
 * @author ayman
 */
public class ConnectionEditor {

    Component comp; // Object being edited or selected in navigator window
    AbstractSocket connector; // Property being edited
    OpenSimContext context = null; // Context object needed to recreate the system as needed, cached for speed
    Model model; // model to which comp belongs
    OneComponentNode node;

    Model clonedModel;
    State clonedState;
    
    public ConnectionEditor(AbstractSocket conn, OneComponentNode ownerNode) {
        this.connector = conn;
        this.model = ownerNode.getModelForNode();
        this.context = OpenSimDB.getInstance().getContext(model);
        this.comp = ownerNode.comp;
        this.node = ownerNode;
    }
    
    public void handleConnectionChangeCommon() {
        Boolean isFrame = connector.getConnecteeTypeName().equalsIgnoreCase("PhysicalFrame")||
                connector.getConnecteeTypeName().equalsIgnoreCase("Frame");
        ViewDB.getInstance().updateComponentVisuals(model, comp, isFrame);  
        ViewDB.repaintAll();
        if (node!= null) node.refreshNode();
        SingleModelGuiElements guiElem = OpenSimDB.getInstance().getModelGuiElements(model);
        guiElem.setUnsavedChangesFlag(true);
    }

    // String Properties
    public String getConnectedToName() {
        return connector.getConnecteeName();
    }

    public void setConnectedToName(String v) {
        setConnectedToNameAndPropagateChange(v, true);
    }

    private void setConnectedToNameAndPropagateChange(String v, boolean supportUndo) {
        String oldValue = getConnectedToName();
        handleConnectionChange(oldValue, v, supportUndo);
    }

    private void handleConnectionChange(final String oldValue, final String v, boolean supportUndo) {

        try {
            context.setConnecteeName(comp, connector, v);
         } catch (IOException iae) {
                 new JOptionPane(iae.getMessage(), 
				JOptionPane.ERROR_MESSAGE).createDialog(null, "Error").setVisible(true);
                 return; // change failed, no harm done

        }
        handleConnectionChangeCommon();
        
        if (supportUndo) {
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit() {

                @Override
                public void undo() throws CannotUndoException {
                    super.undo();
                    setConnectedToNameAndPropagateChange(oldValue, false);
                }

                @Override
                public String getUndoPresentationName() {
                    return "Undo "+connector.getName()+" change";
                }

                @Override
                public void redo() throws CannotRedoException {
                    super.redo();
                    setConnectedToNameAndPropagateChange(v, true);
                }
                 @Override
                public String getRedoPresentationName() {
                    return "Redo "+connector.getName()+" change";
                }
           };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
    }

            
}
