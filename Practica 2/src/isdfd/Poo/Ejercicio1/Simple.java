package isdfd.Poo.Ejercicio1;

public class Simple extends Reserva{
	
	private Plato plato;
	
	public int totalPlatos() {
		return 1;
	}

	public float valor() {
		return plato.getPrecio();
	}

	
	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato= plato;
	}
}