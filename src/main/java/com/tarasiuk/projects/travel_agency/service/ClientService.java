package com.tarasiuk.projects.travel_agency.service;

import com.tarasiuk.projects.travel_agency.entity.Client;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class ClientService extends GeneralService {
    @Override
    public List getAllObjects() {
        TypedQuery<Client> query = em.createQuery("SELECT t FROM Client t", Client.class);
        return query.getResultList();
    }

    @Override
    public Client getObject(long id) {
        return em.find(Client.class, id);
    }
}
