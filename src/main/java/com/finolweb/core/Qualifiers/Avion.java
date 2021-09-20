package com.finolweb.core.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Avion implements Volador {

	public static final Logger log = LoggerFactory.getLogger(Avion.class);
	
	@Override
	public void volar() {

		log.info("Soy un Avion Estoy Volando");
		
	}

}
