package pe.edu.upc.trabajo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productor")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class PagesController {

	
	@GetMapping("dashboard")	// request
	public String dashboard() {
		return "productor/dashboard";
	}
	
	@GetMapping("Inicio")	// request
	public String inicio() {
		return "productor/Inicio";
	}
	/*
	@GetMapping("product-list")	// request
	public String productlist() {
		return "productor/product-list";
	}*/
	
}
