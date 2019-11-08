package Final;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String direccion;
	
	private List<Cupon> cupones = new ArrayList<Cupon>();
		
	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
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
	
	public double aplicarCargos(double total) {
		double t = total;
		for(Cupon c: cupones) {
			t += c.cargo(t);
		}
		
		return t;
	}
		
}