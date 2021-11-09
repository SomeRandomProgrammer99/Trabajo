package pe.edu.upc.trabajo.utils;

public class Carrito {
		
	//----Products---   //----Order---
	//product_id        //order_id 
	//producer_id 		//shipment_id
	//product_name		//payment_id
	//description		//wholesaler_id
	//price				//amount
	//category_id		//date	
	
	//----Details---  
	//order_id
	//product_id
	//producer_id
	//quantity
	//unit_price
	
	private Integer item;//tiene aumento del item 
	private Integer idProducto;//captura el ide del producto
	private String  nombre;//nombre del producto
	private String  description;//descripcion del producto
	private Float precio;//precio de producto
	private Integer cantidad;//cantidad es un atributo que esta en la funcion
	private Float monto;//es la monto=(cantidad * precio)
	
	//listarCarrito.add(objeto) 
	//se debe devolver un objeto con el tamaño y el objeto carrito
		
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
		
}
