package com.example.customer.DAO;

import com.example.customer.model.Customer1;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CustomerDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertValues(Customer1 customer){
        entityManager.createNativeQuery("INSERT INTO customer (customer_name, password, email_id) VALUES (?,?,?)")
                .setParameter(1, customer.getCustomer_name())
                .setParameter(2, customer.getPassword())
                .setParameter(3, customer.getEmail_id())
                .executeUpdate();

    }
}
