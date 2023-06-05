package com.laundry.laundrySetup.repository;

import com.laundry.laundrySetup.dao.UserCategoryDAO;
import com.laundry.laundrySetup.entity.UserCategory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserCategoryImpl implements UserCategoryDAO {

    EntityManager entityManager;

    @Autowired
    public UserCategoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public UserCategory save(UserCategory category) {
        entityManager.persist(category);
        return category;
    }

    @Override
    public List<UserCategory> fetchAll() {
        TypedQuery<UserCategory> categoryTypedQuery = entityManager.createQuery("FROM UserCategory",UserCategory.class);
        return categoryTypedQuery.getResultList();
    }
}
