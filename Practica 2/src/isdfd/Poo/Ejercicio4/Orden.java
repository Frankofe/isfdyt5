package isdfd.Poo.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Orden {

	private List<Encargue>encargues=new ArrayList<Encargue>();
	
	public float costo() {
		float c=0;
		for(Encargue e:encargues) {
			c+=e.costo();
		}
		return c;
	}
	
	public void addEncargue(Encargue e) {
		encargues.add(e);
	}
}
