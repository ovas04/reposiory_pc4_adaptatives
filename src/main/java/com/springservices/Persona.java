package com.springservices;

import java.io.Serializable;

public class Persona implements Serializable {

    private String name;

    private String username;


    public Persona() {
    }

    public Persona(String name, String username) {
        this.name = name;
        this.username = username;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
