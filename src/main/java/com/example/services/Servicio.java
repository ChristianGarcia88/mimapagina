package com.example.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Persona;

@Component
public class Servicio {

	
	public List<Persona> getPersonas(){
		
		
		return  Arrays.asList( new  Persona(1,"Julian", "Garcia"),  new  Persona(2,"Miryiam", "Guchubo") ,new  Persona(3,"Dilmar", "Garcia") ,new  Persona(4,"David", "Guchubp"));
		
		
		
		
		
		
	}
	
	
	
	
}
