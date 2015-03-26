/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.colas;
import com.rafaeloga.exceptions.*;
import com.rafaeloga.model.Reserve;
/**
 * Interfaz que representa una cola de resrvas. El primer elemento en entrar es
 * el primero en salir.
 * @author rafael.lopez
 */
public interface IQueue {
    /** Inserta un elemento al final de la cola
     * @param reserve
     * @throws com.rafaeloga.exceptions.DesbordamientoSuperior **/
    public void insert(Reserve reserve) throws DesbordamientoSuperior;
    /** Devuelve el elemento que mas tiempo lleva en la cola
     * @return Reserve
     * @throws com.rafaeloga.exceptions.DesbordamientoInferior **/
    public Reserve first() throws DesbordamientoInferior;
    /** Elimina el elemnto que lleva mas tiempo en la cola
     * @throws com.rafaeloga.exceptions.DesbordamientoInferior **/
    public void quitFirst() throws DesbordamientoInferior;
    /**Determina si la cola esta vacia
     * @return Boolean  **/
    public boolean isEmpty();  
}
