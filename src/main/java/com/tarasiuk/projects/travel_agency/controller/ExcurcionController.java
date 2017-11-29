package com.tarasiuk.projects.travel_agency.controller;


import com.tarasiuk.projects.travel_agency.entity.Excurcion;
import com.tarasiuk.projects.travel_agency.service.ExcurcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("excurcion")
public class ExcurcionController {

    @Autowired
    private ExcurcionService excurcionService;

    @GetMapping("/getAll")
    public List<Excurcion> getAllHostels(){
        return excurcionService.getAllObjects();
    }

    @GetMapping("/get")
    public Excurcion getHostel(@RequestParam("id") long id){
        return excurcionService.getObject(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Excurcion excurcion) {
        excurcionService.addObject(excurcion);
    }
}
