package com.bridgelabz.addressbook.model;

public class Person {

    public String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private long phoneNumber;

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getZip()
    {
        return zip;
    }
    public void setZip(String zip)
    {
        this.zip=zip;
    }
    public long getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public Person(String firstName, String lastName, String address, String city, String state, String zip, long phoneNumber)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
    }
    public String toString()
    {
        return "First Name:"+firstName+"\tLast Name:"+lastName+"\tAddress:"+address+"\tCity:"+city+"\tState:"+state+"\tZipcode:"+zip+"\tMobile No:"+phoneNumber;
    }
}

