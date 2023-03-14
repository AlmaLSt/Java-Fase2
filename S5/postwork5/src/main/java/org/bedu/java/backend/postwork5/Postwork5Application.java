package org.bedu.java.backend.postwork5;

import org.bedu.java.backend.postwork5.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class Postwork5Application implements CommandLineRunner {

	private Persona persona;
	public Postwork5Application(Persona persona) {
		this.persona = persona;
	}

	public static void main(String[] args) {
		SpringApplication.run(Postwork5Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();

		System.out.println("Ingresa tu apellido: ");
		String apellido = scanner.nextLine();


		System.out.println("Ingresa tu numero de telefono");

		if (scanner.hasNext("\\d{3}[- ]?\\d{3}[- ]?\\d{4}$")) {
			String telefono = scanner.nextLine();
			System.out.println("Numero valido " + telefono);

			String reemplazaTel = telefono.replaceAll("[^0-9]", "");
			String formateado = String.format("(%s)-%s-%s", reemplazaTel.substring(0, 2), reemplazaTel.substring(2, 6), reemplazaTel.substring(6, 10));

			persona.setTelefono(formateado);

		} else {
			System.out.println("Numero invalido, asegurate que este en el siguiente formato ###-###-####");
		}

		persona.setNombre(nombre);
		persona.setApellido(apellido);

		System.out.println("Hola " + persona.getNombre() + " " + persona.getApellido() + " tu número de telefono es " + persona.getTelefono());
	}
}
