package com.example.person.registry.with.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {

    @Column
    private String name;

    @Column
    private String surname;

    @Id
    @Column
    private String fiscalCode;

    @Column(name = "cell_number")
    private String cellNumber;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(columnDefinition = "ENUM( 'M', 'F')")
    private EnumGender gender;

    public Person(){
    }

    public Person(String name, String surname, String fiscalCode, String cellNumber, Address address, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
        this.cellNumber = cellNumber;
        this.address = address;
        this.birthDate = birthDate;
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

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", address=" + address +
                ", birthDate=" + birthDate +
                '}';
    }
}
