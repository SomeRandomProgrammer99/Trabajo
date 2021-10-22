package pe.edu.upc.trabajo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.trabajo.business.crud.PostService;
import pe.edu.upc.trabajo.business.crud.ProductService;
import pe.edu.upc.trabajo.business.crud.UserService;
import pe.edu.upc.trabajo.models.entities.Post;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.models.entities.User;


@Controller
@RequestMapping("/")

public class ProfileController {

	@Autowired 
	private PostService postService;

	@Autowired 
	private ProductService productService;

	@Autowired 
	private UserService userService;

	
	@GetMapping("profile")// request , es el nombre que se pone en el navegador
	public String postCard(Model model) {
		
		try {
			List<Post> posts=postService.getAll();
			model.addAttribute("posts",posts);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "profile";//es el nombre del html
	}
	

}
