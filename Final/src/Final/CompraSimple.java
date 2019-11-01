package Final;

public class CompraSimple extends Compra{

	private Articulo articulo;

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	public double valor() {
		return articulo.precioArticulos();
	}
	
	
}
