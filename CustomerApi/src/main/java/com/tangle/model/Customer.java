package com.tangle.model;

import javax.persistence.*;

@Entity
//@Table(name="customer-detail")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String name;
    private String age;
    private String education;
    private String address;
    public Customer() {}
    public Customer(int cid, String name, String age, String education,String address) {
        super();
        this.cid = cid;
        this.name = name;
        this.age = age;
        this.education = education;
        this.address=address;
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
