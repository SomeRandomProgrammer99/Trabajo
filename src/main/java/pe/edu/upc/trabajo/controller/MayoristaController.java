package pe.edu.upc.trabajo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.trabajo.business.crud.ProducerService;
import pe.edu.upc.trabajo.business.crud.ProductService;
import pe.edu.upc.trabajo.models.entities.Producer;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.utils.Carrito;
import pe.edu.upc.trabajo.utils.ProductSearch;

@Controller
@RequestMapping("/mayorista")
/*
 * es la carpeta raiz, si se crea otra carpeta de de escribe
 * "/nombreDeLaCarpeta "
 */
public class MayoristaController {

	
	  @Autowired private ProductService productService; //postService;
	 /* 
	 * 
	 * @GetMapping("producerView") // request public String dashboard(Model model) {
	 * ProductSearch productSearch = new ProductSearch();
	 * 
	 * try { List<Producer> producers = producerService.getAll();
	 * model.addAttribute("producer",producers); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * model.addAttribute("productSearch", productSearch); return
	 * "productores/producerView"; }
	 */
	
	
	List<Carrito> listarCarrito=new ArrayList<>(); 
	Carrito car;
	
	int item;
	double totalPagar=0;
	int cantidad=1;

	@GetMapping("order") // request
	public String order(Model model/*, @PathVariable("id")Integer id*/) {
		//id=Integer.parseInt(id);
		ProductSearch productSearch = new ProductSearch();
		/*try {
			totalPagar=0;
			Optional<Product> productOptional = productService.findById(id);
			Product product=productOptional.get();
			item=item+1;
			car=new Carrito(); 
			car.setItem(item);
			car.setIdProducto(product.getProduct());
			car.setNombre(product.getName());
			car.setDescription(product.getDescription());
			car.setPrecio(product.getPrice());
			car.setCantidad(cantidad);
			car.setMonto(cantidad*product.getPrice());
			listarCarrito.add(car);
			for(int i=0;i>listarCarrito.size();i++ ) {
				totalPagar+=listarCarrito.get(i).getPrecio();
			}
			model.addAttribute("totalPagar",totalPagar);
			model.addAttribute("listarCarrito",listarCarrito);
			model.addAttribute("listarCarrito",listarCarrito.size());
			//model.addAttribute("producers", producers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		model.addAttribute("productSearch", productSearch);
		return "mayorista/order";
	}
	
	@GetMapping("payment") // request
	public String Type1() {
		return "mayorista/typePayment";
	}

	@GetMapping("shippment") // request
	public String Type2() {
		return "mayorista/typeshippment";
	}

	@GetMapping("error") // request
	public String error() {
		return "mayorista/error";
	}

	@GetMapping("status") // request
	public String Status(Model model) {
		ProductSearch productSearch = new ProductSearch();
		model.addAttribute("productSearch", productSearch);
		return "mayorista/shipmentStatus";
	}

	

}
