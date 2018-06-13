package com.example.int_systems.hutano.Pharmacy;

public class Response {
    String pharmacy_name, address ,distance, img_url;
    public Response(String pharmacy_name, String address, String distance, String img_url) {
        this.pharmacy_name = pharmacy_name;
        this.address = address;
        this.distance = distance;
        this.img_url = img_url;
    }

    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }


    
}
