package com.app.web;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		Estudiante estudiante1 = new Estudiante("Pedro", "Donoso", "pedro.eduardo.donoso@gmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Eduardo", "Ramírez", "eduardo2025@hotmail.com");
		repositorio.save(estudiante2);
	}

}
