package com.example.person.registry.with.hibernate.controller;

import com.example.person.registry.with.hibernate.entity.PersonDto;
import com.example.person.registry.with.hibernate.request.PersonRequest;
import com.example.person.registry.with.hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public HttpStatus createPerson(@RequestBody PersonRequest request){

        service.create(request.getPersonDTO());
        return HttpStatus.CREATED;
    }

    @GetMapping("{fiscalCode}")
    public PersonDto getPersonByFiscalCode(@PathVariable("fiscalCode") String fiscalCode ){
        return service.getPerson(fiscalCode);
    }
}
