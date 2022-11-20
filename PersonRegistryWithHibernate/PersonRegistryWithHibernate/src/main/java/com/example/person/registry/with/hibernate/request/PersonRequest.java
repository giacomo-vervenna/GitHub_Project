package com.example.person.registry.with.hibernate.request;

import com.example.person.registry.with.hibernate.entity.PersonDto;
import org.springframework.stereotype.Component;


public class PersonRequest {
    private PersonDto dto = new PersonDto();

    public PersonRequest() {
        super();
    }

    public PersonDto getPersonDTO() {
        return dto;
    }

    public void setPersonDTO(PersonDto dto) {
        this.dto = dto;
    }
}
