package com.example.person.registry.with.hibernate.entity.mapper;

import com.example.person.registry.with.hibernate.entity.Address;
import com.example.person.registry.with.hibernate.entity.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public AddressMapper() {
    }

    public AddressDto toDto(Address address) {

        AddressDto dto = new AddressDto();

        dto.setStreet(address.getStreet());
        dto.setCivic(address.getCivic());
        dto.setResidenceOrDomicile(address.getResidenceOrDomicile());
        dto.setPostalCode(address.getPostalCode());

        return dto;
    }

    public Address toModel(AddressDto dto) {

        Address a = new Address();

        a.setStreet(dto.getStreet());
        a.setCivic(dto.getCivic());
        a.setResidenceOrDomicile(dto.getResidenceOrDomicile());
        a.setPostalCode(dto.getPostalCode());

        return a;
    }


}