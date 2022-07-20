package com.webapp.carsApp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "renters")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "renter_id", nullable = false, unique=true)
    Integer renter_id;

    @Column(name = "address", length=60)
    String address;

    @Column(name = "birthdate")
    String birthdate;

    @Column(name = "e_mail", nullable = false, length=60)
    String e_mail;

    @Column(name = "gender", length=2)
    String gender;

    @Column(name = "last_name", nullable = false, length=60)
    String last_name;

    @Column(name = "name", nullable = false, length=40)
    String name;

    @Column(name = "password", length=20)
    String password;

    @Column(name = "telephone_no", length=12)
    String telephone_no;

    public Integer getId() {
        return renter_id;
    }

    public void setId_number(Integer renter_id) {
        this.renter_id = renter_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone_no() {
        return telephone_no;
    }

    public void setTelephone_no(String telephone_no) {
        this.telephone_no = telephone_no;
    }

}
