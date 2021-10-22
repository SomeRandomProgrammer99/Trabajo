package pe.edu.upc.trabajo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class FrontController {

	
	@GetMapping("index")	// request
	public String index() {
		return "index";
	}
	
	
	/*@GetMapping// request , es el nombre que se pone en el navegador
	public String index(Model model) {
		
		try {
			List<Department> departments=departmentService.getAll();
			model.addAttribute("departments",departments);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";//es el nombre del html
	}
	*/
	
}
