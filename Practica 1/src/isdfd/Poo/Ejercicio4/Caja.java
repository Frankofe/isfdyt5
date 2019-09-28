package isdfd.Poo.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private float valor;
	private List<Producto> productos=new ArrayList<Producto>();
	
	public void addProductos(Producto p) {
		productos.add(p);
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
