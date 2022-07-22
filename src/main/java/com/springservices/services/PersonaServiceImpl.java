package com.springservices.services;

import com.springservices.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService{

    private static final List<Persona> listaPersonas = new ArrayList<Persona>();

    @Override
    public List<Persona> listar() {

        listaPersonas.add(new Persona("Oscar","ovas"));
        listaPersonas.add(new Persona("Carolina","ovas"));
        listaPersonas.add(new Persona("Jake","ovas"));

        return  listaPersonas;
    }
}
