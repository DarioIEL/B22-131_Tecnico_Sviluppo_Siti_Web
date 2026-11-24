package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class TriangoloEquilatero extends TriangoloABS {

	private double lato;
	
	public TriangoloEquilatero(String colore, double lato, String tipo) {
		super(colore, tipo);
		this.lato = lato;
	}

	@Override
	public double calcolaPerimetro() {
		double perimetro = lato * 3;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
