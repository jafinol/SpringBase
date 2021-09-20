package com.finolweb.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.finolweb.core.Qualifiers.Animal;
import com.finolweb.core.Qualifiers.Avion;
import com.finolweb.core.Qualifiers.Nido;
import com.finolweb.core.Qualifiers.Pajaro;
import com.finolweb.core.Qualifiers.Perro;
import com.finolweb.core.autowire.AreaCalulatorService;
import com.finolweb.core.profile.EnviromentService;

@SpringBootApplication
public class CoreApplication {

	public static final Logger log = LoggerFactory.getLogger(CoreApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(CoreApplication.class, args);
		
		//Motor motor = new Motor(1981,"XL1");
		Perro perro = context.getBean(Perro.class);
		Pajaro pajaro = context.getBean(Pajaro.class);
		
		Avion avion = context.getBean(Avion.class);
		
		log.info("Objeto Perro {}", pajaro.getNombre());
			
		pajaro.volar();
		Animal animal = context.getBean("perro", Animal.class);
		log.info("Nombre {} Edad {}", animal.getNombre(), animal.getEdad());
		
		Nido nido = context.getBean(Nido.class);
		nido.imprimir();
		
		EnviromentService enviromentService = context.getBean(EnviromentService.class);
		log.info("Active Enviroment {}", enviromentService.getEnviroment());
		
	
		AreaCalulatorService calulator = context.getBean(AreaCalulatorService.class);
		
		log.info("Area Total {}", calulator.calcAreas());
		
	}

}
