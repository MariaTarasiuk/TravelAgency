package com.tarasiuk.projects.travel_agency.controller;

import com.tarasiuk.projects.travel_agency.entity.Client;
import com.tarasiuk.projects.travel_agency.service.ClientService;
import com.tarasiuk.projects.travel_agency.springData.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientControler {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/getAll")
    public List<Client> getAllHostels(){
        //return clientService.getAllObjects();
        return clientRepository.findAll();
    }

    @GetMapping("/get")
    public Client getHostel(@RequestParam("id") long id){
        //return clientService.getObject(id);
        return clientRepository.findOne(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Client client) {
        //clientService.addObject(client);
        clientRepository.save(client);
    }
}
