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
public class Destiny {

    private String hotelName;
    private String hotelDescription;
    private String travelCompany;
    private String city;
    private String country;

    public Destiny(String hotelName, String hotelDescription, String travelCompany, String city, String country) {
        this.hotelName = hotelName;
        this.hotelDescription = hotelDescription;
        this.travelCompany = travelCompany;
        this.city = city;
        this.country = country;
    }
    

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public String getTravelCompany() {
        return travelCompany;
    }

    public void setTravelCompany(String travelCompany) {
        this.travelCompany = travelCompany;
    }
}
