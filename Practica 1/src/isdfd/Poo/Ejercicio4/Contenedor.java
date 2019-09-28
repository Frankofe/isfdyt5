package isdfd.Poo.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

	private int numero;
	private float peso;
	private String destino;
	private List<Articulo> articulos=new ArrayList<Articulo>();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public float pesoArticulo(Articulo unArticulo){
		return unArticulo.getPeso();
	}
	
	public void addArticulo(Articulo a) {
		articulos.add(a);
	}
	
	
}
