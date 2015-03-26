/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.colas;

import com.rafaeloga.exceptions.DesbordamientoInferior;
import com.rafaeloga.model.Reserve;

/**
 *
 * @author rafael.lopez
 */
public class ColaVector implements ICola{
    
    /**Vector que contiene las reservas**/
    @SuppressWarnings("FieldMayBeFinal")
    private Reserve reservas[];
    /**Posicion del primer elemento de la cola**/
    int inicio;
    /**Posicion del ultimo elemento de la cola**/
    int fin;
    /** Numero de elementos que contiene la cola**/
    @SuppressWarnings("FieldMayBeFinal")
    private int numElementos;
    /** Constructor de la clase. Crea una cola vacia con el tamaño indicado en
     *  en el parametr
     * @param tam**/
    public ColaVector(int tam){
        reservas = new Reserve[tam];
        inicio = 0;
        fin = -1;
        numElementos = 0;        
    }   
    
    @Override
    public void inserta(Reserve reserve) {
       //Se comprueba si esta llena la cola
        if(numElementos == reservas.length){
            
        
        }
    }

    @Override
    public Reserve primero() throws DesbordamientoInferior {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quitarPrimero() throws DesbordamientoInferior {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esVacia() {
        return (numElementos==0);
    }
    
}
