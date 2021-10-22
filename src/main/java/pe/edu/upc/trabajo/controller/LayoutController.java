package pe.edu.upc.trabajo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LayoutController {

	
	@GetMapping("layout")	// request
	public String navbar () {
		return "layout";
	}
			
	
}
