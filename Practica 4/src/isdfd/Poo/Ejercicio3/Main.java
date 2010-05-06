package isdfd.Poo.Ejercicio3;

public class Main {

	public static void main(String[] args) {

		ColaDeTrabajo ct=new ColaDeTrabajo("Cola 1");
		ct.addTrabajo(new Hoja());
		ct.addTrabajo(new Hoja());
		ct.setLista(true);
		try {
			Trabajo t = ct.sacar();
			t.ejecutar();
		} catch (NoListaException e) {
			e.printStackTrace();
		} catch (SinTrabajoEnColaException e) {
			e.printStackTrace();
		}
	}

}
