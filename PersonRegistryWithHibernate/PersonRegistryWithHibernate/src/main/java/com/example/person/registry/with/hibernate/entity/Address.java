package com.example.person.registry.with.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {


    @Id
    @Column(name =  "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "street")
    private String street;

    @Column(name = "civic")
    private String civic;

    @Column(name = "postalcode")
    private Integer postalCode;


    @Column(name = "home", columnDefinition = "ENUM( 'RESIDENCE', 'DOMICILE')")
    private EnumAddress residenceOrDomicile;

    public Address() {
    }

    public Address(String street, String civic, Integer postalCode, EnumAddress residenceOrDomicile) {
        this.civic = civic;
        this.postalCode = postalCode;
        this.street = street;
        this.residenceOrDomicile = residenceOrDomicile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCivic() {
        return civic;
    }

    public void setCivic(String civic) {
        this.civic = civic;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public EnumAddress getResidenceOrDomicile() {
        return residenceOrDomicile;
    }

    public void setResidenceOrDomicile(EnumAddress residenceOrDomicile) {
        this.residenceOrDomicile = residenceOrDomicile;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", civic='" + civic + '\'' +
                ", postalCode=" + postalCode +
                ", residenceOrDomicile=" + residenceOrDomicile +
                '}';
    }
}
