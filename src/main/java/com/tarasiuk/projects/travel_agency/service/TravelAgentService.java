package com.tarasiuk.projects.travel_agency.service;


import com.tarasiuk.projects.travel_agency.entity.Travel;
import com.tarasiuk.projects.travel_agency.entity.TravelAgent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class TravelAgentService extends GeneralService {
    @Override
    public List<TravelAgent> getAllObjects() {
        TypedQuery<TravelAgent> query = em.createQuery("SELECT t FROM TravelAgent t", TravelAgent.class);
        return query.getResultList();
    }

    @Override
    public TravelAgent getObject(long id) {
        return em.find(TravelAgent.class, id);
    }
}
