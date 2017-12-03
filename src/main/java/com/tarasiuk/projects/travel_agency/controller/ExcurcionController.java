package com.tarasiuk.projects.travel_agency.controller;


import com.tarasiuk.projects.travel_agency.entity.Excurcion;
import com.tarasiuk.projects.travel_agency.service.ExcurcionService;
import com.tarasiuk.projects.travel_agency.springData.ExcurcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("excurcion")
public class ExcurcionController {

    @Autowired
    private ExcurcionService excurcionService;

    @Autowired
    private ExcurcionRepository excurcionRepository;

    @GetMapping("/getAll")
    public List<Excurcion> getAllHostels(){
        //return excurcionService.getAllObjects();
        return excurcionRepository.findAll();
    }

    @GetMapping("/get")
    public Excurcion getHostel(@RequestParam("id") long id){
        //return excurcionService.getObject(id);
        return excurcionRepository.findOne(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Excurcion excurcion) {
        //return excurcionService.addObject(excurcion);
        excurcionRepository.save(excurcion);
    }
}
