/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.colas;

import com.rafaeloga.exceptions.DesbordamientoInferior;
import com.rafaeloga.exceptions.DesbordamientoSuperior;
import com.rafaeloga.model.Reserve;

/**
 *
 * @author rafael.lopez
 */
public class QueueWithList implements IQueue {

    @Override
    public void insert(Reserve reserve) throws DesbordamientoSuperior {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reserve first() throws DesbordamientoInferior {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitFirst() throws DesbordamientoInferior {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
