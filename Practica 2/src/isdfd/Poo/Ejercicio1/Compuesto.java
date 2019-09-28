package isdfd.Poo.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Reserva{
	
	private List<Plato>platos= new ArrayList<Plato>();
	
	public int totalPlatos() {
		return platos.size();
	}
	
	public float valor() {
		float t=0;
		for(Plato p:platos) {
			t+= p.getPrecio();
		}
		return t * 0.95f;
	}
	
	public void addPlato(Plato p) {
		platos.add(p);
	}

	
	public void addAllPlato(List<Plato>p) {
		platos.addAll(p);
	}

}
