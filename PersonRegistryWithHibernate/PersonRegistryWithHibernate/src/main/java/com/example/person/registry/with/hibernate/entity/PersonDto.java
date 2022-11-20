package com.example.person.registry.with.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

public class PersonDto {

    private String name;

    private String surname;

    private String fiscalCode;

    private AddressDto address;

    private Date birthDate;

    public PersonDto(){
    }

//    public PersonDto(String name, String surname, String fiscalCode, AddressDto address, Date birthDate) {
//        this.name = name;
//        this.surname = surname;
//        this.fiscalCode = fiscalCode;
//        this.address = address;
//        this.birthDate = birthDate;
//    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
