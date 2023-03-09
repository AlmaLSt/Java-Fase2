package org.bedu.java.backend.sesion4postwork;

import org.bedu.java.backend.sesion4postwork.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Sesion4PostworkApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Sesion4PostworkApplication.class, args);
	}

	private Persona persona;

	public Sesion4PostworkApplication(Persona persona) {
		this.persona = persona;
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();

		System.out.println("Ingresa tu apellido: ");
		String apellido = scanner.nextLine();

		persona.setNombre(nombre);
		persona.setApellido(apellido);

		System.out.println("Hola " + persona.getNombre() + " " + persona.getApellido());
	}


}
