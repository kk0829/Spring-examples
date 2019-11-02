package com.xingkong.springdatajpa.controller;

import com.xingkong.springdatajpa.dto.ApplicationCreateDTO;
import com.xingkong.springdatajpa.dto.ApplicationUpdateDTO;
import com.xingkong.springdatajpa.entity.Application;
import com.xingkong.springdatajpa.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author kk
 * @date 2019-11-02 17:09
 */
@RestController
public class ApplicationController {

    @Autowired
    private ApplicationRepository repository;

    @GetMapping(value = "/api/applications.json")
    public List<Application> listAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/api/application.json")
    public Application findById(@RequestParam(value = "id", required = true) Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping(value = "/api/application.json")
    public Application create(@RequestBody ApplicationCreateDTO createDTO) {
        Application application = new Application();
        application.setName(createDTO.getName());
        application.setDescription(createDTO.getDescription());
        return repository.save(application);
    }

    @PutMapping(value = "/api/application.json")
    public Application updateById(@Valid @RequestBody ApplicationUpdateDTO updateDTO) {
        Application application = repository.findById(updateDTO.getId()).orElse(null);

        if (application != null) {
            application.setName(updateDTO.getName());
            application.setDescription(updateDTO.getDescription());
            return repository.save(application);
        }
        return application;
    }
}
