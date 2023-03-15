package org.bedu.java.backend.sesion6.controller;

import org.bedu.java.backend.sesion6.model.Direccion;
import org.bedu.java.backend.sesion6.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UserController {

    @PostMapping
   public ResponseEntity<User> creaUsuario(@RequestBody User user){
        System.out.println("creaUsuario");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " +user.getLastname());
        System.out.println("User: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        Direccion direccion = new Direccion();
        direccion.setStreet("Cordoba");
        direccion.setNumber("86");
        direccion.setZipCode("58963");

        user.setDireccion(direccion);

//        return ResponseEntity.status(HttpStatus.CREATED).body(user);

        return ResponseEntity.status(HttpStatus.CREATED).eTag("BETO").body(user);
    }

    @PostMapping("/{id}")
public String creaUsuarioParams(@RequestBody User user, @PathVariable("id") long id){
    System.out.println("creaUsuarioParams");
    System.out.println("Name: " + user.getName());
    System.out.println("Lastname: " + user.getLastname());
    System.out.println("Email: " + user.getEmail());
    System.out.println("Password: " + user.getPassword());
    return "Usuario " + id + "creado";
}

    @PostMapping("/reto01")
    public String creaUsuarioReto1(@RequestBody User user, @RequestParam long id, @RequestParam String rol
    ){
        System.out.println("creaUsuarioParams");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        return "Usuario " + id + "creado con el rol " + rol;
    }
}
