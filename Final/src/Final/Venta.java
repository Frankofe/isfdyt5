package Final;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	private int numeroVenta;
	
	private List <Helado> helados = new ArrayList<Helado>();
	
	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	public void addHelado(Helado h) {
		helados.add(h);
	}
	
	public void removeHelado(Helado h) {
		helados.remove(h);
	}
	
	public double totalHelado(Helado h) {
		return h.importe();
	}
	
	public double totalVenta() {
		double total = 0;
		for (Helado h: helados) {
			total += h.importe();
		}
		return total;
	}
	
}
