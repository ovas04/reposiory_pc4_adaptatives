package com.springservices.controllers;

import com.springservices.Persona;
import com.springservices.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService iPersonaService;

    @RequestMapping(value = {"","/personas"}, method= RequestMethod.GET)
    public List<Persona> listar(){

        return iPersonaService.listar();

    }

}
