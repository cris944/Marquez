package pe.edu.upeu.syscasos.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping
	public String index() {
		return "Bienvenido al Proyecto ....";
	}
}
