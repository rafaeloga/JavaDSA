/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeloga.model;

/**
 *
 * @author rafael.lopez
 */
public class Reserve {

   
    private String clientName;
    private String clientSurname;
    private Destiny clientDestiny;
    
     public Reserve(String clientName, String clientSurname, Destiny clientDestiny) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientDestiny = clientDestiny;
    }
    
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public Destiny getClientDestiny() {
        return clientDestiny;
    }

    public void setClientDestiny(Destiny clientDestiny) {
        this.clientDestiny = clientDestiny;
    }
    
}
