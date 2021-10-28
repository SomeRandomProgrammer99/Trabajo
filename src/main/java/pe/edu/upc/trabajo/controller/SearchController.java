package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.trabajo.business.crud.ProductService;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.utils.ProductSearch;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("product")
	public String searchEmployees(Model model, @ModelAttribute("productSearch") ProductSearch productSearch) {

		List<Product> products = new ArrayList<>();
		
		try {
			products = productService.findByName(productSearch.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		model.addAttribute("productSearch", productSearch);
		model.addAttribute("products", products);		
		
		return "searches/view-products";
	}
	
}
