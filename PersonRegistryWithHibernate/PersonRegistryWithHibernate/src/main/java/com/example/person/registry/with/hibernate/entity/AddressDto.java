package com.example.person.registry.with.hibernate.entity;

public class AddressDto{

    public String street;
    public String civic;
    public Integer postalCode;
    public EnumAddress residenceOrDomicile;

    public AddressDto() {
    }

//    public AddressDto(String street, String civic, Integer postalCode, EnumAddress residenceOrDomicile) {
//        this.street = street;
//        this.civic = civic;
//        this.postalCode = postalCode;
//        this.residenceOrDomicile = residenceOrDomicile;
//    }

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

    public void setResidenceOrDomicile(EnumAddress home) {
        this.residenceOrDomicile = home;
    }
}