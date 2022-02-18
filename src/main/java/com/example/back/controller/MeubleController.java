package com.example.back.controller;


import com.example.back.model.Meuble;
import com.example.back.repository.MeubleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MeubleController {

    @Autowired
    private MeubleRepository meubleRepository;

    @GetMapping("/meubles")
    public List<Meuble> getAllMeuble(){
        return meubleRepository.findAll();
    }
}
