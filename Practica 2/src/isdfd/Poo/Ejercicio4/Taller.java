package isdfd.Poo.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Taller {

	private List<Orden>ordenes=new ArrayList<Orden>();
	
	public float costoReparacion(Orden o) {
		return o.costo();
	}
	
	public float costoTotal() {
		float t=0;
		for(Orden o:ordenes) {
			t+=o.costo();
		}
		return t;
	}
	
	public void addOrden(Orden o) {
		ordenes.add(o);
	}
}
