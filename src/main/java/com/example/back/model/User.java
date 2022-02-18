package com.example.back.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;
    private String name;
    private String email;
    private String lastname;
    private String password;
    private String age;
    private String taille;
    private String initial_exp_id;
    private String lvl;
    private String gender;
    private String premium;
    @Column(nullable = false, updatable = false)
    private String userCode;


    public User(){

    }

    public User(String name, String email, String lastname,
                String password, String age, String taille,
                String initial_exp_id, String lvl, String gender, String premium, String userCode ) {
        this.name = name;
        this.email = email;
        this.lastname = lastname;
        this.password = password;
        this.age = age;
        this.taille = taille;
        this.initial_exp_id = initial_exp_id;
        this.lvl = lvl;
        this.gender = gender;
        this.premium = premium;
        this.userCode = userCode;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {return lastname; }
    public void setLastname(String lastname) {this.name = lastname; }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) {this.password = password; }

    public String getAge() { return age; }
    public void setAge(String age) {this.age = age; }

    public String getTaille() { return taille; }
    public void setTaille(String taille) {this.taille = taille; }

    public String getInitial_exp_id() {return initial_exp_id;}
    public void setInitial_exp_id(String initial_exp_id) {this.initial_exp_id = initial_exp_id; }

    public String getLvl() {return lvl; }
    public void setLvl(String lvl) {this.lvl = lvl; }

    public String getGender() {return gender; }
    public void setGender(String gender) {this.gender = gender; }

    public String getpremium() {return premium; }
    public void setPremium(String premium) {this.premium = premium; }

    public String getUserCode(){
        return userCode;
    }

    public void setUserCode() {this.userCode = userCode; }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }






    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email'" + email + '\'' +
            ", lastname'" + lastname + '\'' +
            ", password'" + password + '\'' +
            ", age'" + age + '\'' +
            ", taille'" + taille + '\'' +
            ", initial_exp_id'" + initial_exp_id + '\'' +
            ", lvl'" + lvl + '\'' +
            ", gender'" + gender + '\'' +
            ", premium'" + premium + '\'' +
                ", usercode '" + userCode + '\'' +

        '}';
    }
}
