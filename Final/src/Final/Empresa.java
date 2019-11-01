package Final;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	
	public void setNombre(String n) {
		nombre=n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	// Empleados
	
	
	
	//-------------------------------------------------------------------------
	
	// Compras
	
	private List<Compra>compras=new ArrayList<Compra>();
	
	public void addCompra(Compra c) {
		compras.add(c);
	}
	
	public void removeCompra(Compra c) {
		compras.remove(c);
	}
	
	public Empresa(String n) {
		setNombre(n);
	}

	public double montoUnaCompra(Compra c) {
		return c.valor();
	}
	
	public double montoTotalCompras() {
		double t=0;
		for(Compra c:compras) {
			t+=c.valor();
		}
		return t;
	}
	
	//-----------------------------------------------------------------------------
	
	// Ventas
	
	private List <Venta> ventas = new ArrayList<Venta>();
	
	public void addVenta (Venta v) {
		ventas.add(v);
	}
	
	public void removeVenta (Venta v) {
		ventas.remove(v);
	}
	
	public int cantidadVentas() {
		return ventas.size();
	}
	
	public double totalVenta(Venta v) {
		return v.totalVenta();
	}
	
	public double totalVentas() {
		double total = 0;
		for (Venta v: ventas) {
			total+=v.totalVenta();
		}
		return total;
	}
	
}
