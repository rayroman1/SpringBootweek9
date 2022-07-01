package com.example.demo2.exam;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@Entity
//@Table(name = "users")
public class Users1 {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int uid=0;
    
    String lastname="";
    String firstname="";

    
    Users1()
    {

    }
   Users1(int uid,String lastname, String firstname)
    {
        this.uid=uid;
        this.lastname=lastname;
        this.firstname=firstname;

    }

    public int getUid() {
        return uid;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Users1{" +
                "uid=" + uid +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
