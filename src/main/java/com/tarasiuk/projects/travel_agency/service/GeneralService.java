package com.tarasiuk.projects.travel_agency.service;

import com.tarasiuk.projects.travel_agency.entity.Hostel;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public abstract class GeneralService<T> {
    @Autowired
    protected EntityManager em;


    public abstract List<T> getAllObjects();

    public abstract T getObject(long id);


    public void addObject(T object) {
        em.merge(object);
    }

    public void updateObject(T object) {
        em.getTransaction().begin();
        em.merge(object);
        em.flush();
        em.getTransaction().commit();
        //logger.info("Updated object: " + object);
    }

    public void deleteObject(long id) {
        em.getTransaction().begin();
        em.remove(getObject(id));
        em.flush();
        em.getTransaction().commit();
        //logger.info("Deleted object with id = " + id);
    }




}
