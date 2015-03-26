/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.exceptions;

/**
 *
 * @author rafael.lopez
 */
public class DesbordamientoInferior extends Exception{

    public DesbordamientoInferior() {
        super ("Desbordamiento Inferior de la cola");
    }
    public DesbordamientoInferior(String msg) {
        super (msg);
    }
}
