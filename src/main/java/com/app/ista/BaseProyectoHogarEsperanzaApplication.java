package com.app.ista;

import com.app.ista.controller.ActividadPersonaController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BaseProyectoHogarEsperanzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProyectoHogarEsperanzaApplication.class, args);
	}
}
