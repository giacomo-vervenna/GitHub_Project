package com.example.person.registry.with.hibernate.dao.impl;

import com.example.person.registry.with.hibernate.dao.AddressDao;
import com.example.person.registry.with.hibernate.entity.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    private SessionFactory sessionFactory;

    @Autowired
    public AddressDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public Address create(Address address) {
        Session session = sessionFactory.getCurrentSession();
        session.save(address);
        return address;
    }

    @Override
    public Address update(Address address, String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Address get(String s) {
        return null;
    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
