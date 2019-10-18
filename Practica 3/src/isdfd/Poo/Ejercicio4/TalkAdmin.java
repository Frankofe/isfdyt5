package isdfd.Poo.Ejercicio4;

public class TalkAdmin {

	public static void main (String[] args) {
		Gato g=new Gato();
		hacerhablar(g);
		Perro p=new Perro();
		hacerhablar(p);
		RelojCucu rc=new RelojCucu();
		hacerhablar(rc);
	}
	
	public static void hacerhablar(Hablador h) {
		h.habla();
	}
}
