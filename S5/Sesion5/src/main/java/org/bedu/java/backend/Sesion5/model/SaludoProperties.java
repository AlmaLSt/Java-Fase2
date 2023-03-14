package org.bedu.java.backend.Sesion5.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoProperties {
    private String name;

//    public SaludoProperties(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
