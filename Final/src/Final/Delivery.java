package Final;

public class Delivery extends Cupon {

	@Override
	public double cargo(double monto) {
		return monto+50;
	}

}

