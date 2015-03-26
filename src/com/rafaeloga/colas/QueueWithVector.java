/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.colas;

import com.rafaeloga.exceptions.*;
import com.rafaeloga.model.Reserve;

/**
 *
 * @author rafael.lopez
 */
public class QueueWithVector implements IQueue{
    
    /**Vector que contiene las reservas**/
    @SuppressWarnings("FieldMayBeFinal")
    private Reserve reserves[];
    /**Posicion del primer elemento de la cola**/
    int first;
    /**Posicion del ultimo elemento de la cola**/
    int end;
    /** Numero de elementos que contiene la cola**/
    @SuppressWarnings("FieldMayBeFinal")
    private int numElements;
    /** Constructor de la clase. Crea una cola vacia con el tamaño indicado en
     *  en el parametro tam
     * @param tam**/
    public QueueWithVector(int tam){
        reserves = new Reserve[tam];
        first = 0;
        end = -1;
        numElements = 0;        
    }   
    
    @Override
    public void insert(Reserve reserve) throws DesbordamientoSuperior{
       //Se comprueba si esta llena la cola
        if(numElements == reserves.length){
            throw new DesbordamientoSuperior("The queue is full. You can'r realize the insert operation");
        
        }
        //We increment de variables and assign the reserve to the vector in end position
        end++;
        reserves[end] = reserve;
        numElements++;
    }

    @Override
    public Reserve first() throws DesbordamientoInferior {
        //It's checked if the queue is empty
        if(isEmpty()){
            throw new DesbordamientoInferior("The queue is empty and there isn't any elements");
        }
        return reserves[first];
    }

    @Override
    public void quitFirst() throws DesbordamientoInferior {
        if(isEmpty()){
            throw new DesbordamientoInferior("The queue is empty and there isn't any elements");
        }
        first++;
        numElements--;
    }

    @Override
    public boolean isEmpty() {
        return (numElements==0);
    }
    
}
