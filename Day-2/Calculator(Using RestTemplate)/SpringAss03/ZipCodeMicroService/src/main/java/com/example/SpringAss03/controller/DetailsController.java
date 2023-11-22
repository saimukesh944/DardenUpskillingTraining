package com.example.SpringAss03.controller;

import com.example.SpringAss03.entity.DetailsInfo;
import com.example.SpringAss03.repo.DetailsInfoRepo;
import com.example.SpringAss03.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DetailsController{
    @Autowired
    DetailsService service;
    @Autowired
    DetailsInfoRepo repo;

    @PostMapping
    public String addMethod(@RequestBody DetailsInfo detailsInfo){
        return  service.add(detailsInfo);

    }

    @GetMapping("/{zipcode}")
    public DetailsInfo getbyzipcode(@PathVariable int zipcode){
        return repo.findByZipcode(zipcode);
    }
}
