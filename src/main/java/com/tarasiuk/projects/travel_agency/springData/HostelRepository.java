package com.tarasiuk.projects.travel_agency.springData;

import com.tarasiuk.projects.travel_agency.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository<Hostel, Long> {

    Hostel findByName(String name);
}
