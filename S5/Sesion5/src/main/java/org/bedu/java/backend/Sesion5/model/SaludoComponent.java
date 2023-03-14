package org.bedu.java.backend.Sesion5.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SaludoComponent {
    private final String name;


    public SaludoComponent() {
        this.name = "Beto";
        System.out.println("Creando una instancia de Saludo");
    }

    public String getName() {
        return name;
    }
}
