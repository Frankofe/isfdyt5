package isdfd.Poo.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Editor {

	private List<FiguraGeometrica>figuras=new ArrayList<FiguraGeometrica>();
	
	public void addFigura(FiguraGeometrica f) {
		figuras.add(f);
	}
	
	public void removeFigura(FiguraGeometrica f) {
		figuras.remove(f);
	}
	
	public double totalArea() {
		double t=0;
		for(FiguraGeometrica f:figuras) {
			t+=f.area();
		}
		return t;
	}

}
