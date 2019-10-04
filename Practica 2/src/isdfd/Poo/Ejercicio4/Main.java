package isdfd.Poo.Ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taller t=new Taller();
		Orden o=new Orden();
		
		Kit k1=new Kit();
		k1.addEncargue(new Pieza(10f));
		Kit k2=new Kit();
		k2.addEncargue(new Pieza(20f));
		k2.addEncargue(new Pieza(30f));
		k1.addEncargue(k2);
		o.addEncargue(k1);
		t.addOrden(o);
		System.out.println("Costo:" + t.costoTotal());
	}

}
