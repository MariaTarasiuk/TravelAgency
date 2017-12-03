package com.tarasiuk.projects.travel_agency.springData;

import com.tarasiuk.projects.travel_agency.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel,Long> {
}
