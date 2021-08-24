package modelo;

public class Casilla {
	private String direccion;
	private boolean head; 
	private boolean locked;
	private boolean isManzana;
	
	
	public Casilla(String direccion,boolean head,boolean locked,boolean isManzana) {
		this.setDireccion(direccion);
		this.setHead(head);
		this.setLocked(locked);
		this.setManzana(isManzana);
	}

	public boolean isLocked() {
		return locked;
	}


	public void setLocked(boolean locked) {
		this.locked = locked;
	}


	public boolean isHead() {
		return head;
	}


	public void setHead(boolean head) {
		this.head = head;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		String output=" ";
		output+=direccion;
		
		return output;
		
	}

	public boolean isManzana() {
		return isManzana;
	}

	public void setManzana(boolean isManzana) {
		this.isManzana = isManzana;
	}
}


