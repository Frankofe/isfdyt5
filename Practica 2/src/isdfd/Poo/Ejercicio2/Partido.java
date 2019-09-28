package isdfd.Poo.Ejercicio2;

public class Partido {

	private Estadio estadio;
	private Equipo local;
	private Equipo visitante;
	private float entrada;
	
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	
	public float getEntrada() {
		return entrada;
	}
	public void setEntrada(float entrada) {
		this.entrada = entrada;
	}
	
	public int getCapacidad() {
		return estadio.getCapacidad();
	}
	
	public double montoRecaudado() {
		return estadio.getCapacidad()* this.getEntrada();
	}
}
