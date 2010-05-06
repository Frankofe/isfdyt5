package isdfd.Poo.Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo implements Trabajo{

	private String nombre;
	private boolean lista;
	private Queue<Trabajo>trabajos=new LinkedList<Trabajo>();
	
	public ColaDeTrabajo(String n) {
		nombre=n;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isLista() {
		return lista;
	}
	public void setLista(boolean lista) {
		this.lista = lista;
	}
	
	public void addTrabajo(Trabajo t) {
		trabajos.add(t);
	}
	
	public void delTrabajo(Trabajo t) {
		trabajos.remove(t);
	}
	
	public Trabajo sacar() throws NoListaException,SinTrabajoEnColaException{
		if(!lista) {
			throw new NoListaException(nombre,trabajos.size());
		}
		else {
			if(trabajos.size()!=0) {
				return trabajos.poll();
			}
			else {
				throw new SinTrabajoEnColaException(nombre);
			}
		}
	}

	public void ejecutar() {
		// TODO Auto-generated method stub
		
	}
	
}
