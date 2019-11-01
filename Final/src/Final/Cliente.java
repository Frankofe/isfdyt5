package Final;

public class Cliente {

	private String nombre;
	private String direccion;
	private boolean cupon;
	private boolean delivery;
	
	public Cliente(String nombre, String direccion, boolean cupon, boolean delivery) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cupon = cupon;
		this.delivery = delivery;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isCupon() {
		return cupon;
	}
	public void setCupon(boolean cupon) {
		this.cupon = cupon;
	}
	public boolean isDelivery() {
		return delivery;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	
	
	
}
