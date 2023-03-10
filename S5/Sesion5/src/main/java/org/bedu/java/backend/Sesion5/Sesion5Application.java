package org.bedu.java.backend.Sesion5;

import org.bedu.java.backend.Sesion5.model.Saludo;
import org.bedu.java.backend.Sesion5.service.SaludoService;
import org.bedu.java.backend.Sesion5.service.SaludoServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Ejemplo 1
//
// @SpringBootApplication
//public class Sesion5Application implements CommandLineRunner {
//
///* ejemplo 1: poco seguro y lento
//	@Autowired
//	private Saludo saludo;*/
//
///* Ejemplo 2:
//
//  private Saludo saludo;
//	@Autowired
//	public void setSaludo(Saludo saludo){
//		this.saludo = saludo;
//	}*/
//
// Ejemplo 3:
//	private final Saludo saludo;
/// @Autowired -->se puede poner aqui o abajo
//	public Sesion5Application(@Autowired Saludo saludo) {
//		this.saludo = saludo;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(Sesion5Application.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(saludo.getName());
//	}
//}

@SpringBootApplication
public class Sesion5Application implements CommandLineRunner {

	private final SaludoService saludoService;
	private final SaludoServiceProperties saludoServiceProperties;

	public Sesion5Application(@Autowired SaludoService saludoService, @Autowired SaludoServiceProperties saludoServiceProperties) {
		this.saludoService = saludoService;
		this.saludoServiceProperties = saludoServiceProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sesion5Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
		System.out.println(saludoServiceProperties.saluda());
	}
}


