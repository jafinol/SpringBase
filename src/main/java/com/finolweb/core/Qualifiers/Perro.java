package com.finolweb.core.Qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Perro extends Animal {

	public Perro(@Value("1") Integer edad, @Value("Negron")  String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}
	
	

}
