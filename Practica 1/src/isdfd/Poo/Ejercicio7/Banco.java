package isdfd.Poo.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nombre;
	private String ubicacion;
	private List<Transaccion>transacciones=new ArrayList<Transaccion>();
	private Cliente cliente;
	
	public void agregarTrans(Transaccion t){
		transacciones.add(t);
	}
	
	public int cantidadTrans(){
		return transacciones.size();
	}
	
	public float impuestoACobrar(Transaccion unaTransaccion){
		return unaTransaccion.getImpuesto();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public float impuestosACobrar() {
		float total = 0;
		for (Transaccion t: transacciones) {
			total+=t.getImpuesto();
		}
		return total;
	}
	
	public float montoTotalDeTransacciones() {
		float total = 0;
		for (Transaccion t: transacciones) {
			total+=t.getMonto()+t.getImpuesto();
		}
		return total;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
