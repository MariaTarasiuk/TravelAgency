package com.tarasiuk.projects.travel_agency.service;

import com.tarasiuk.projects.travel_agency.entity.Hostel;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HostelService extends GeneralService<Hostel> {


    @Override
    public List<Hostel> getAllObjects() {
        TypedQuery<Hostel> query = em.createQuery("SELECT t FROM Hostel t", Hostel.class);
        return query.getResultList();
    }

    @Override
    public Hostel getObject(long id) {
        return em.find(Hostel.class, id);
    }

}
