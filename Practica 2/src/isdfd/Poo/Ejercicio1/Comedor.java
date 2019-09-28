package isdfd.Poo.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Comedor {

	private List<Reserva>reservas= new ArrayList<Reserva>();
	
	//a)
	public void agregarReserva(Cliente cliente,Plato plato) {
		Simple s= new Simple();
		s.setCliente(cliente);
		s.setPlato(plato);
		reservas.add(s);
	}
	
	//b)
	public void agregarReserva(Cliente cliente, List<Plato>p) {
		Compuesto c= new Compuesto();
		c.setCliente(cliente);
		c.addAllPlato(p);
		reservas.add(c);
	}
	
	//c)
	public float valorReserva(Reserva r) {
		return r.monto();
	}
	
	//d)
	public int totalPlatos() {
		int t=0;
		for (Reserva r:reservas) {
			t+= r.totalPlatos();
		}
		return t;
	}
	
	//e)
	public float totalValor() {
		float t=0;
		for (Reserva r:reservas) {
			t+= r.monto();
		}
		return t;
	}
	
	//f)
	public Reserva reservaMasPlatos() {
		int m=0;
		Reserva mayor=null;
		for(Reserva r:reservas) {
			if(r.totalPlatos()> m) {
				m= r.totalPlatos();
				mayor= r;
			}
		}
		return mayor;
	}
}