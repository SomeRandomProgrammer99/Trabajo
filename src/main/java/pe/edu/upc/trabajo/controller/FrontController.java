package pe.edu.upc.trabajo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.trabajo.business.crud.PostService;
import pe.edu.upc.trabajo.models.entities.Post;


@Controller
@RequestMapping("/")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class FrontController {

	@Autowired 
	private PostService postService;
	
	@GetMapping()	// request
	public String index(Model model) {
		
		try {
			List<Post> posts=postService.getAll();
			model.addAttribute("posts",posts);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
