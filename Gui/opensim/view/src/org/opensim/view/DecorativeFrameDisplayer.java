/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.view;

import org.opensim.modeling.DecorativeFrame;
import org.opensim.modeling.DecorativeGeometry;
import org.opensim.modeling.OpenSimObject;
import vtk.vtkActor;
import vtk.vtkAxes;
import vtk.vtkAxesActor;
import vtk.vtkPolyData;

/**
 *
 * @author Ayman
 */
class DecorativeFrameDisplayer extends DecorativeGeometryDisplayer {

    private final DecorativeFrame ag;
    vtkAxes frameSrc = new vtkAxes();
    
    public DecorativeFrameDisplayer(DecorativeFrame arg0) {
        //super(object);
        this.ag = arg0.clone();
        //if (ag.hasUserRef()) setObj(ag.getUserRefAsObject());

    }

    private vtkPolyData getPolyData(DecorativeFrame ag) {
        frameSrc.SetScaleFactor(ag.getAxisLength());
        return frameSrc.GetOutput();
    }
    
    @Override
    void updateDisplayFromDecorativeGeometry() {
        vtkPolyData polyData = getPolyData(ag);
        //updatePropertiesForPolyData(polyData);
        createAndConnectMapper(polyData);
        setXformAndAttributesFromDecorativeGeometry(ag);
    }

    @Override
    vtkActor getVisuals() {
        updateDisplayFromDecorativeGeometry();
        return this;
    }
 
    @Override
    int getBodyId() {
        return ag.getBodyId();
    }
    @Override
    int getIndexOnBody() {
        return ag.getIndexOnBody();
    }
    
    @Override
    DecorativeGeometry getDecorativeGeometry() {
        return ag;
    }   
    
    @Override
    void updateGeometry(DecorativeGeometry arg) {
        DecorativeFrame arg0 = (DecorativeFrame) arg;
        ag.setAxisLength(arg0.getAxisLength());
        updateDisplayFromDecorativeGeometry();
    }

}