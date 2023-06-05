package com.laundry.laundrySetup.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "laundry_service")
public class LaundryService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private int id;

    @Column(name = "service")
    private String service;


    @Column(name = "service_img_url")
    private String imgUrl;

    public LaundryService(){

    }

    public LaundryService(String service, String imgUrl) {
        this.service = service;
        this.imgUrl = imgUrl;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
