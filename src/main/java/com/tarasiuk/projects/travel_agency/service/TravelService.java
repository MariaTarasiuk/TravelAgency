package com.tarasiuk.projects.travel_agency.service;

import com.tarasiuk.projects.travel_agency.entity.Travel;
import com.tarasiuk.projects.travel_agency.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TravelService {
    @Autowired
    private EntityManager em;

    public List<Travel> getAll() {
        TypedQuery<Travel> query = em.createQuery("SELECT t FROM Travel t WHEre t.id = 2", Travel.class);
        return query.getResultList();
    }

    public void save(Travel travel) {
        em.merge(travel);
    }

    public Travel get(long id) {
        return em.find(Travel.class, id);
    }
}
