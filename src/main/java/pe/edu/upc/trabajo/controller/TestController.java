package pe.edu.upc.trabajo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class TestController {

	
	@GetMapping("BasePost")	// request
	public String base() {
		return "pages/BasePost";
	}
	
	@GetMapping("dashboard")	// request
	public String dashboard() {
		return "pages/dashboard";
	}
	
	@GetMapping("Inicio")	// request
	public String inicio() {
		return "pages/Inicio";
	}
	@GetMapping("Inicio2")	// request
	public String inicio2() {
		return "pages/Inicio2";
	}
	@GetMapping("Login")	// request
	public String login() {
		return "pages/Login";
	}
	@GetMapping("carousel")	// request
	public String carousel() {
		return "pages/carousel";
	}
	
	
	

	
}
