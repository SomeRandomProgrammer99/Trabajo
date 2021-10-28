package pe.edu.upc.trabajo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productor")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class TestController {

	
	@GetMapping("BasePost")	// request
	public String base() {
		return "productor/BasePost";
	}
	
	@GetMapping("dashboard")	// request
	public String dashboard() {
		return "productor/dashboard";
	}
	
	@GetMapping("Inicio")	// request
	public String inicio() {
		return "productor/Inicio";
	}
	@GetMapping("Inicio2")	// request
	public String inicio2() {
		return "productor/Inicio2";
	}
	@GetMapping("Login")	// request
	public String login() {
		return "productor/Login";
	}
	@GetMapping("carousel")	// request
	public String carousel() {
		return "productor/carousel";
	}
	
	@GetMapping("scroll")	// request
	public String scroll() {
		return "productor/scroll";
	}

	
	
	
	

	
}
