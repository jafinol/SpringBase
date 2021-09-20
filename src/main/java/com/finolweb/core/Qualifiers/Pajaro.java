package com.finolweb.core.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Pajaro extends Animal implements Volador{
	
	
	public static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	
	
	public Pajaro( @Value("2") Integer edad,  @Value("Loki") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void volar() {

		log.info("Soy un pajaro Estoy Volando");
	}

}
