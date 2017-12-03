package com.tarasiuk.projects.travel_agency.controller;

import com.tarasiuk.projects.travel_agency.entity.Hostel;
import com.tarasiuk.projects.travel_agency.entity.TravelAgent;
import com.tarasiuk.projects.travel_agency.service.TravelAgentService;
import com.tarasiuk.projects.travel_agency.springData.TravelAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("travelagent")

public class TravelAgentController {
    @Autowired
    private TravelAgentService travelAgentService;

    @Autowired
    private TravelAgentRepository travelAgentRepository;

    @GetMapping("/getAll")
    public List<TravelAgent> getAllTravelAgents(){

        //return travelAgentService.getAllObjects();
        return  travelAgentRepository.findAll();
    }

    @GetMapping("/get")
    public TravelAgent getTravelAgent(@RequestParam("id") long id){
        //return travelAgentService.getObject(id);
        return travelAgentRepository.findOne(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody TravelAgent travelAgent) {
        //travelAgentService.addObject(travelAgent);
        travelAgentRepository.save(travelAgent);
    }
}
