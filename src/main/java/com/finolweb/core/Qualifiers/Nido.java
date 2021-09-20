package com.finolweb.core.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {
	
	
	@Autowired
	//@Qualifier("Pajaro") 
	private Animal animal;
	
	public static final Logger log = LoggerFactory.getLogger(Animal.class);
	
	
	public void imprimir() {
		log.info("El nido tiene el animal {}", animal.getNombre());
	}
}
