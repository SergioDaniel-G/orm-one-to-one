package com.ejemplo.orms;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemplo.orms.entity.Socio;
import com.ejemplo.orms.entity.Tarjeta;
import com.ejemplo.orms.repositorio.SocioRepositorio;

@SpringBootApplication
public class OrmApplication implements CommandLineRunner {

	@Autowired
	private SocioRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(OrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// this code is to create a socio//

		Socio socio = new Socio("javi", "javi@hotmail.com");
		Tarjeta tarjeta = new Tarjeta(new Date(), socio);
		socio.setTarjeta(tarjeta);
		repositorio.save(socio);

		// para listar todos los socios
		repositorio.findAll().forEach(x -> {
			System.out.println(x.getNombre() + "-" + x.getTarjeta().getFechaDecaducidad() + "-" + x.getCorreo());
		});

		//Optional<Socio> socio = repositorio.findById(2L);
		//repositorio.delete(socio.get());
	}

}
