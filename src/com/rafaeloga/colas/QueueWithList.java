/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.colas;

import com.rafaeloga.exceptions.DesbordamientoInferior;
import com.rafaeloga.exceptions.DesbordamientoSuperior;
import com.rafaeloga.model.Node;
import com.rafaeloga.model.Reserve;

/**
 *
 * @author rafael.lopez
 */
public class QueueWithList implements IQueue {

    private Node begin;
    private Node end;

    public QueueWithList() {
        begin = null;
        end = null;
    }
    
    @Override
    public void insert(Reserve reserve) throws DesbordamientoSuperior {
        //A node is created with node=null
        Node node = new Node(reserve);
        node.setNode(null);
        //If the list is empty then the new node is the first and the end
        if(isEmpty()){
            begin = node;
            end = node;            
        }
        //Else the last node point the new node and the new node is the last node
        else{
            end.setNode(node);
            end = node;
        }
    }

    @Override
    public Reserve first() throws DesbordamientoInferior {
        if(isEmpty()){
            throw  new DesbordamientoInferior("The queue is empty and there isn't firt element");
        }
        return begin.getReserve();
    }

    @Override
    public void quitFirst() throws DesbordamientoInferior {
        if(isEmpty()){
            throw new DesbordamientoInferior("The queue is empty and there isn't firt element");
        }
        begin = begin.getNode();
        
        if(begin==null){
            end = null;
        }
        
    }

    @Override
    public boolean isEmpty() {
        return (begin == null);
    }
    
}
