package pe.edu.upc.trabajo.controller;


import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


import pe.edu.upc.trabajo.business.crud.PostService;
import pe.edu.upc.trabajo.business.crud.ProductService;
import pe.edu.upc.trabajo.business.crud.UserService;
import pe.edu.upc.trabajo.models.entities.Post;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.models.entities.User;


@Controller
@SessionAttributes("post")
@RequestMapping("/pages")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class PublicationController {

	@Autowired 
	private PostService postService;
	
	@Autowired 
	private UserService userService;
	@Autowired 
	private ProductService productService;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	
	@GetMapping("publication")	// request
	public String publication(Model model) {
		
		try {
			List<Post> posts=postService.getAll();
			model.addAttribute("posts",posts);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "pages/publication";
	}
	
	@GetMapping("{id}/postedit")
	public String edit(Model model, @PathVariable("id") Integer id) {
		try {
			if(postService.existsById(id)) {
				Optional<Post> optional = postService.findById(id);
				List<Product> products = productService.getAll();
				List<User> users= userService.getAll();
				model.addAttribute("post", optional.get());
				model.addAttribute("products", products);
				model.addAttribute("users", users);
			} else {
				return "redirect:/pages";
			}
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "pages/postedit";
	}
	
	@PostMapping("save")
	public String save(Model model, @ModelAttribute("post") Post post ) {
		
		System.out.println(post.getId());
		System.out.println(post.getName());
		System.out.println(post.getDescription());
		System.out.println(post.getDate());
		System.out.println(post.getProduct());
		System.out.println(post.getUser());
		try {				
			Post postSave = postService.update(post);		
			model.addAttribute("post", postSave);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/pages/publication";
	}


	@PostMapping("saveNew")
	public String saveNew(Model model, @Valid @ModelAttribute("post") Post post, 
			BindingResult result) {
		if(result.hasErrors()) {
			
		}
		//System.out.println(post.getId());
		System.out.println(post.getName());
		System.out.println(post.getDescription());
		System.out.println(post.getDate());
		System.out.println(post.getProduct().getPrice());
		System.out.println(post.getUser().getCompany());
		try {
			Post postSave = postService.create(post);		
			model.addAttribute("post", postSave);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/pages/publication";
	}
	
	
	
}