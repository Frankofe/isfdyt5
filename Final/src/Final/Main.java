package Final;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompraSimple cp=new CompraSimple();
		Proveedor p=new Proveedor("Sergio",12345678,"San Martin 656");
		cp.setProveedor(p);
		Articulo a=new Articulo(100,100,"Leche");
		
		System.out.println(cp.getProveedor().getNombre());
		System.out.println(a.getCantidad() + a.getNombre() + a.getPrecio());
		}

}
