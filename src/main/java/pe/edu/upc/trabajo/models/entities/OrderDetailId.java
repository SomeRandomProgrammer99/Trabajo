package pe.edu.upc.trabajo.models.entities;

import java.io.Serializable;
import java.util.Objects;


public class OrderDetailId implements Serializable {
	
	  private static final long serialVersionUID = 1L;

	    private Integer order;
	    private Integer product;

	    public  OrderDetailId() {
	        super();
	    }

	    // Constructor
	    public OrderDetailId(Integer order, Integer product) {
	        super();
	        this.order = order;
	        this.product = product;
	    }
	    // Getter y Setter
	    public Integer getOrder() {
	        return order;
	    }

	    public void setOrder(Integer order) {
	        this.order = order;
	    }

	    public Integer getProduct() {
	        return product;
	    }

	    public void setProduct(Integer product) {
	        this.product = product;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(order, product);
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        // Si es el mismo
	        if(this == obj)
	            return true;
	        // Si el obj es null o las clases de los objetos son diferentes
	        if(obj == null || this.getClass() != obj.getClass())
	            return false;
	        // Verificar que los atributos sean iguales.
	        // Cast
	        OrderDetailId orderDetailsId = (OrderDetailId)obj;

	        if(this.order != orderDetailsId.order)
	            return false;
	        if(this.product != orderDetailsId.product)
	            return false;
	        return true;
	    }
}
