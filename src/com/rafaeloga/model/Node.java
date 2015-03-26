/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.model;

/**
 * Node to implment a Queue with a linked list
 * @author rafael.lopez
 */
public class Node {
    /**Information of the node**/
    private Reserve reserve;
    private Node node;

    public Node(Reserve reserve) {
        this.reserve = reserve;
    }    

    public Reserve getReserve() {
        return reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    
}
