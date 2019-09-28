package isdfd.Poo.Ejercicio7;

public class Internacional extends Transaccion {

	private Moneda moneda;

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	
	public float conversionAPesos(){
		return getMonto() * moneda.monto();
	}
	
	public float getImpuesto(){
		return (getMonto()*moneda.monto())* 0.1f;
	}

}
