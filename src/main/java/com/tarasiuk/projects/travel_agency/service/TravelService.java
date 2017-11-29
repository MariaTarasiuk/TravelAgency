package com.tarasiuk.projects.travel_agency.service;

import com.tarasiuk.projects.travel_agency.entity.Travel;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class TravelService extends GeneralService {
    @Autowired
    private EntityManager em;

    @Override
    public List getAllObjects() {
        TypedQuery<Travel> query = em.createQuery("SELECT t FROM Travel t WHEre t.id = 2", Travel.class);
        return query.getResultList();
    }

    @Override
    public Travel getObject(long id) {
        return em.find(Travel.class, id);
    }
}
