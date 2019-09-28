package isdfd.Poo.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private String direccion;
	private List<Contenedor> contenedores=new ArrayList<Contenedor>();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void addContenedor(Contenedor unContenedor){
		contenedores.add(unContenedor);
	}
	
	public void delContenedor(Contenedor unContenedor){
		contenedores.remove(unContenedor);
	}
}
