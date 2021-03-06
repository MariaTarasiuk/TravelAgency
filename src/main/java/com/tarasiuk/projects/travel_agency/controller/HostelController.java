package com.tarasiuk.projects.travel_agency.controller;

import com.tarasiuk.projects.travel_agency.entity.Hostel;
import com.tarasiuk.projects.travel_agency.service.GeneralService;
import com.tarasiuk.projects.travel_agency.service.HostelService;

import com.tarasiuk.projects.travel_agency.springData.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hostel")
public class HostelController {

    @Autowired
    private HostelService hostelService;

    @Autowired
    private HostelRepository hostelRepository;

    @GetMapping("/getAll")
    public List<Hostel> getAllHostels(){
//        return hostelService.getAllObjects();
        return hostelRepository.findAll();
    }

    @GetMapping("/get")
    public Hostel getHostel(@RequestParam("id") long id){
//        return hostelService.getObject(id);
        return hostelRepository.findOne(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Hostel hostel) {
//        hostelService.addObject(hostel);
        hostelRepository.save(hostel);
    }
}
