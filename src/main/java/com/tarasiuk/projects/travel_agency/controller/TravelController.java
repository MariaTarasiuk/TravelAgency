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
    public List<Travel> getAllHostels(){
        return travelService.getAllObjects();
    }

    @GetMapping("/get")
    public Travel getHostel(@RequestParam("id") long id){
        return travelService.getObject(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Travel travel) {
        travelService.addObject(travel);
    }
}
