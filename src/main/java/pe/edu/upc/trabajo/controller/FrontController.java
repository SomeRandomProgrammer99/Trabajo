package pe.edu.upc.trabajo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.trabajo.business.crud.ProductService;
import pe.edu.upc.trabajo.models.entities.Product;
//import pe.edu.upc.trabajo.utils.ProductSearch;


@Controller
@RequestMapping("/")// es la carpeta raiz, si se crea otra carpeta
//de de escribe "/nombreDeLaCarpeta "/
@SessionAttributes("{productSearch}")

public class FrontController {

	@Autowired 
	private ProductService productService; //postService;
	
	@GetMapping
	public String index(Model model) {
	//ProductSearch productSearch = new ProductSearch();
		try {
			List<Product> posts = productService.getAll();
			model.addAttribute("product",posts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//model.addAttribute("productSearch", productSearch);
		return "index";
	}
	
}
