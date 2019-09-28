package isdfd.Poo.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Mundial {

	private List<Partido>partidos= new ArrayList<Partido>();
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int totalPartidos() {
		return partidos.size();
	}
	
	//a)
	public void agregarPartido(Equipo l, Equipo v,Estadio e,float valorEntrada) {
		Partido p=new Partido();
		p.setLocal(l);
		p.setVisitante(v);
		p.setEstadio(e);
		p.setEntrada(valorEntrada);
		partidos.add(p);
	}
	
	//b)
	public Estadio estadioMasCapacidad() {
		int actual=0;
		Estadio mayor=null;
		for (Partido p:partidos) {
			if(p.getCapacidad()>actual) {
				actual= p.getCapacidad();
				mayor= p.getEstadio();
			}
		}
		return mayor;
	}
	
	//c)
	public int cantidadTotalEspectadores() {
		int total=0;
		for (Partido p:partidos) {
			total+=p.getCapacidad();
		}
		return total;
	}
	
	//d)
	public double montoRecaudado(Partido p) {
		return p.montoRecaudado();
	}
	
	//e)
	public int montoTotalRecaudado() {
		int t=0;
		for (Partido p:partidos) {
			t+=p.montoRecaudado();
		}
		return t;
	}

}
