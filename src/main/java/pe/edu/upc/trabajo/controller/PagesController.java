package pe.edu.upc.trabajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.trabajo.business.crud.ProducerService;
import pe.edu.upc.trabajo.models.entities.Producer;
import pe.edu.upc.trabajo.utils.ProductSearch;

@Controller
@RequestMapping("/mayorista")/*/ es la carpeta raiz, si se crea otra carpeta
de de escribe "/nombreDeLaCarpeta "*/
public class PagesController {

	/*
	@Autowired 
	private ProducerService producerService; //postService;
	
	
	@GetMapping("producerView")	// request
	public String dashboard(Model model) {
		ProductSearch productSearch = new ProductSearch();
		
		try {
			List<Producer> producers = producerService.getAll();
			model.addAttribute("producer",producers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("productSearch", productSearch);
		return "productores/producerView";
	}
	
	*/
	@GetMapping("payment")	// request
	public String Type1() {
		return "mayorista/typePayment";
	}
	
	@GetMapping("shippment")	// request
	public String Type2() {
		return "mayorista/typeshippment";
	}
	
	@GetMapping("error")	// request
	public String error() {
		return "mayorista/error";
	}
	
	@GetMapping("status")	// request
	public String Status(Model model) {
		ProductSearch productSearch = new ProductSearch();
		model.addAttribute("productSearch", productSearch);
		return "mayorista/shipmentStatus";
	}
	
	@GetMapping("order")	// request
	public String order(Model model) {
		ProductSearch productSearch = new ProductSearch();
		model.addAttribute("productSearch", productSearch);
		return "mayorista/order.html";
	}
}
