package pe.edu.upc.trabajo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.trabajo.business.crud.PostService;
import pe.edu.upc.trabajo.models.entities.Post;
import pe.edu.upc.trabajo.utils.ProductSearch;


@Controller
@RequestMapping("/")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
//@SessionAttributes("{productSearch}")

public class FrontController {

	@Autowired 
	private PostService postService;
	
	@GetMapping
	public String index(Model model) {
		//ProductSearch productSearch = new ProductSearch();
		try {
			List<Post> posts = postService.getAll();
			model.addAttribute("posts",posts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//model.addAttribute("productSearch", productSearch);
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
