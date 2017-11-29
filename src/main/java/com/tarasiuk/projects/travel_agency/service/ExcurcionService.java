package com.tarasiuk.projects.travel_agency.service;

import com.tarasiuk.projects.travel_agency.entity.Excurcion;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class ExcurcionService extends GeneralService {
    @Override
    public List<Excurcion> getAllObjects() {
        TypedQuery<Excurcion> query = em.createQuery("SELECT t FROM Excurcion t", Excurcion.class);
        return query.getResultList();
    }

    @Override
    public Excurcion getObject(long id) {
        return em.find(Excurcion.class, id);
    }
}
