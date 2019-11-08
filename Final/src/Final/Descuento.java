package Final;

public class Descuento extends Cupon {

	@Override
	public double cargo(double monto) {
		return 	monto*0.90;
	}

}
