package com.laundry.laundrySetup.repository;

import com.laundry.laundrySetup.dao.LaundryServiceDAO;
import com.laundry.laundrySetup.entity.LaundryService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class LaundryServiceImpl implements LaundryServiceDAO {
    EntityManager entityManager;
    @Autowired
    public LaundryServiceImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public LaundryService save(LaundryService service) {
        entityManager.persist(service);
        return service;
    }

    @Override
    public List<LaundryService> fetchAll() {
        TypedQuery<LaundryService> serviceTypedQuery = entityManager.createQuery("FROM LaundryService", LaundryService.class);
        return serviceTypedQuery.getResultList();
    }
}
