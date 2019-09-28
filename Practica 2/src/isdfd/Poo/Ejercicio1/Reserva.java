package isdfd.Poo.Ejercicio1;

public abstract class Reserva {

	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float monto() {
		float m=valor();
		return cliente.descuento(m);
	}
	
	public abstract float valor();
	
	public abstract int totalPlatos();
	
}
