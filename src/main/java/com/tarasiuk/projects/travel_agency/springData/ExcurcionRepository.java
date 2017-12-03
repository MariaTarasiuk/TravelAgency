package com.tarasiuk.projects.travel_agency.springData;

import com.tarasiuk.projects.travel_agency.entity.Excurcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcurcionRepository extends JpaRepository<Excurcion, Long> {
    Excurcion findByName(String name);
}
