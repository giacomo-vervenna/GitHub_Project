package com.example.person.registry.with.hibernate.dao.impl;

import com.example.person.registry.with.hibernate.dao.PersonDao;
import com.example.person.registry.with.hibernate.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory;

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public Person create(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
        return person;
    }

    @Override
    public Person update(Person person, String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Person get(String s) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }
}
