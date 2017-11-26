package com.tarasiuk.projects.travel_agency.controller;

import com.tarasiuk.projects.travel_agency.entity.Travel;
import com.tarasiuk.projects.travel_agency.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("travel")
public class TravelController {
    @Autowired
    private TravelService travelService;

    @GetMapping("/getAll")
    public List<Travel> getAllTravels(){
        return travelService.getAll();
    }

    @GetMapping("/get")
    public Travel getTravel(@RequestParam("id") long id){
        return travelService.get(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Travel travel) {
        travelService.save(travel);
    }
}
