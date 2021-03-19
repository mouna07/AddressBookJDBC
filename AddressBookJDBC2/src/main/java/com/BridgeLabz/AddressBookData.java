package com.BridgeLabz;

import java.sql.Date;

public class AddressBookData {

    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phonenumber;
    private String email;
    private Date date;
    private int id;

    public AddressBookData(String firstname, String lastname, String address, String city, String state, int zip,
                           int phonenumber, String email,Date date) {
        this(firstname,lastname,address,city,state,zip,phonenumber,email);
        this.date = date;
    }
    public AddressBookData(String firstname, String lastname, String address, String city, String state, int zip,
                           int phonenumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phonenumber;
        this.email = email;

    }
    public AddressBookData(int id, String firstname, String lastname, String address, String city, String state, int zip,
                           int phonenumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phonenumber;
        this.email = email;
        this.id = id;

    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return  "firstname = " +firstname +", lastname = "+ lastname +", Address = " + address + ", city = "+city + ", state = "+ state + ", "
                + "zip = "+ zip  +", phoneNumber = " +phonenumber + ", email = "+email +", date = "+date;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
