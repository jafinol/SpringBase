package com.finolweb.core.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AreaCalulatorService {
	
	@Autowired
	private List<Figure> figures;
	
	
	public double calcAreas() {
		double area =0;
		for (Figure figure : figures) {
			
			area=figure.calculateArea();
		}
		return area;
		
	}

}
