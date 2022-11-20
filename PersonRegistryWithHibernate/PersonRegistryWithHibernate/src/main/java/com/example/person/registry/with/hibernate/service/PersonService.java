package com.example.person.registry.with.hibernate.service;

import com.example.person.registry.with.hibernate.dao.impl.PersonDaoImpl;
import com.example.person.registry.with.hibernate.entity.Person;
import com.example.person.registry.with.hibernate.entity.PersonDto;
import com.example.person.registry.with.hibernate.entity.mapper.PersonMapper;
import org.hibernate.property.access.internal.PropertyAccessStrategyNoopImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonMapper mapper;
    private PersonDaoImpl dao;

    @Autowired
    public PersonService(PersonMapper mapper, PersonDaoImpl dao) {
        this.mapper = mapper;
        this.dao = dao;
    }

    public PersonDto create(PersonDto dto){

        Person person = mapper.toModel(dto);
        dao.create(person);
        return dto;
    }

    public PersonDto getPerson(String fiscalCode){

        return mapper.toDto(dao.get(fiscalCode));
    }
}
