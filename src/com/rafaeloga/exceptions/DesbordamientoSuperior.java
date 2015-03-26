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
public class DesbordamientoSuperior extends Exception{

    public DesbordamientoSuperior() {
        super ("Desbordamiento Superior de la cola");
    }
    public DesbordamientoSuperior(String msg) {
        super (msg);
    }
}
