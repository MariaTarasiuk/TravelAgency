package com.tarasiuk.projects.travel_agency.springData;

import com.tarasiuk.projects.travel_agency.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
