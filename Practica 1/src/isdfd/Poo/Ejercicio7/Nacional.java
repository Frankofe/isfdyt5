package isdfd.Poo.Ejercicio7;

public class Nacional extends Transaccion {
	
	public float conversionAPesos(){
		return getMonto();
	}
	
	public float getImpuesto(){
		return getMonto()* 0.08f;
	}

}
