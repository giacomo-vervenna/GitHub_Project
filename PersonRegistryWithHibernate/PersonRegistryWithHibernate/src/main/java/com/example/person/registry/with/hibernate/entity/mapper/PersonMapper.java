package com.example.person.registry.with.hibernate.entity.mapper;

import com.example.person.registry.with.hibernate.entity.Person;
import com.example.person.registry.with.hibernate.entity.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    private AddressMapper addressMapper;

    @Autowired
    public PersonMapper(AddressMapper addressMapper){
        this.addressMapper = addressMapper;
    }

    public PersonDto toDto(Person person) {

        PersonDto dto = new PersonDto();

        dto.setName(person.getName());
        dto.setSurname(person.getSurname());
        dto.setFiscalCode(person.getFiscalCode());
        dto.setBirthDate(person.getBirthDate());
        dto.setAddress(addressMapper.toDto(person.getAddress()));

        return dto;
    }

    public Person toModel(PersonDto dto) {

        Person p = new Person();

        p.setName(dto.getName());
        p.setSurname(dto.getSurname());
        p.setFiscalCode(dto.getFiscalCode());
        p.setAddress(addressMapper.toModel(dto.getAddress()));
        p.setBirthDate(dto.getBirthDate());

        return p;
    }
}
