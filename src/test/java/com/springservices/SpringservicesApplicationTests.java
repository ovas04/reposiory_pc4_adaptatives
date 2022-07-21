package com.springservices;

import com.springservices.services.PersonaServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringservicesApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){

        Persona persona = new Persona("Roberto", "Abierto");

        Assertions.assertEquals(persona.getName(),"Roberto");


    }

    @Test
    public void test2(){

        PersonaServiceImpl personaService = new PersonaServiceImpl();

        final List<Persona> list = personaService.listar();

        Assertions.assertEquals(((Object) list).getClass().getSimpleName(), ArrayList.class.getSimpleName());

    }

    @Test
    public void test3(){

        Persona persona = new Persona();

        Assertions.assertNotEquals(persona.getName(), "Roberto");


    }
}
