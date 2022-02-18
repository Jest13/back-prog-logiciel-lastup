package com.example.back.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@Entity
@EnableAutoConfiguration
@Table(name = "meuble")
public class Meuble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long meuble_id;

    @Column(name = "meubleName")
    private String meuble_name;

    @Column(name = "meublePrix")
    private String meuble_prix;

    @Column(name = "meubleInfo")
    private String meuble_info;

    @Column(name = "meubleShortInfo")
    private String meuble_short_info;

    @Column(name = "meubleType")
    private String meuble_type;

    @Column(name = "meubleStock")
    private String meuble_stock;


    public Meuble() {

    }


    public Meuble(String meuble_name, String meuble_info, String meuble_prix, String meuble_short_info, String meuble_type, String meuble_stock) {
        this.meuble_name = meuble_name;
        this.meuble_info = meuble_info;
        this.meuble_short_info = meuble_short_info;
        this.meuble_prix = meuble_prix;
        this.meuble_type = meuble_type;
        this.meuble_stock = meuble_stock;
    }

    public Long getMeuble_id() {
        return meuble_id;
    }

    public void setMeuble_id(Long meuble_id) {
        this.meuble_id = meuble_id;
    }

    public String getMeuble_name() {
        return meuble_name;
    }

    public void setMeuble_name(String meuble_name) {
        this.meuble_name = meuble_name;
    }

    public String getMeuble_prix() {
        return meuble_prix;
    }

    public void setMeuble_prix(String meuble_prix) {
        this.meuble_prix = meuble_prix;
    }

    public String getMeuble_info() {
        return meuble_info;
    }

    public void setMeuble_info(String meuble_info) {
        this.meuble_info = meuble_info;
    }

    public String getMeuble_short_info() {
        return meuble_short_info;
    }

    public void setMeuble_short_info(String meuble_short_info) {
        this.meuble_short_info = meuble_short_info;
    }

    public String getMeuble_type() {
        return meuble_type;
    }

    public void setMeuble_type(String meuble_type) {
        this.meuble_type = meuble_type;
    }

    public String getMeuble_stock() {
        return meuble_stock;
    }

    public void setMeuble_stock(String meuble_stock) {
        this.meuble_stock = meuble_stock;
    }
}