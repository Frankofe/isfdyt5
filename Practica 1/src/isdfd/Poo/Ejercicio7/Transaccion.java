package isdfd.Poo.Ejercicio7;

public abstract class Transaccion {

	private float monto;
	private Cliente cliente;
	
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public float getMonto() {
		return monto;
	}

	public abstract float getImpuesto();
	public abstract float conversionAPesos();

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
}

