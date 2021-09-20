package com.finolweb.core.herencia;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {
	
	 @Value("1980") 
	 private int modelo;
	 @Value("XL1") 
	 private String marca;
	 
	 
	public Motor() {
	}


	public Motor(int modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Motor [modelo=" + modelo + ", marca=" + marca + "]";
	}

	
	
	 
	

}
