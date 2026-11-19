package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class Rettangolo extends FormaGeometrica{
	
	private double base;
	private double altezza;
	
	public Rettangolo(String colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	//Obbligato a implementare un metodo astratto
	@Override
	public double calcolaPerimetro() {
		double perimetro = (base + altezza) * 2;
		return perimetro;
	}

	@Override
	public double calcolaArea() {
		double area = (base * altezza);
		return area;
	}
	
	
}
