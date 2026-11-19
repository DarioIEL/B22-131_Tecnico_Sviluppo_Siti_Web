package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class Cerchio extends FormaGeometrica {

	private double raggio;
	
	public Cerchio(String colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = 2 * Math.PI * raggio;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		double area = Math.PI * Math.pow(raggio, 2);
		return area;
	}

}
