package isdfd.Poo.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Encargue {
	
	private List<Encargue>encargues=new ArrayList<Encargue>();
	
	public void addEncargue(Encargue e) {
		encargues.add(e);
	}
	
	public float costo() {
		float c=0;
		for(Encargue e:encargues) {
			c+=e.costo();
		}
		float f= c*0.90f;
		
		System.out.println("kit:"+f);
		return f;
	}
}
