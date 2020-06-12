package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.services.Servicio;

@Controller
public class PersonaController {
	
	@Autowired
	Servicio  servicio;
	
	
	@RequestMapping("/algo")
	public  String cargaInicial(Model m ) {
		
	  m.addAttribute("algo", "algo");
		
		return "index";
		
	}
	 
	 
	
	@GetMapping("/")
	public String  pruebaMetodo(Model m  ) {
		
		m.addAttribute("listaPersonas",servicio.getPersonas());
		
		servicio.getPersonas().stream().forEach(objeto->{System.out.println(" "+  objeto.getNombre() +  " " +  objeto.getApellido());});
		
		
		
		return "index";
		
		
	}
}
