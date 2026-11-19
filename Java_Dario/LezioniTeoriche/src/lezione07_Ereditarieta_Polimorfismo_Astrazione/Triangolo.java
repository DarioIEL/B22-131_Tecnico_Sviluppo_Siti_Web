package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class Triangolo extends FormaGeometrica {

	private double lato1, lato2, lato3;
	final String tipo;
	
	//Triangolo Scaleno
	public Triangolo(String colore, double lato1, double lato2, double lato3) {
		super(colore);
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.tipo = "Scaleno";
	}
	
	
	//Trinagolo Isoscele
	public Triangolo(String colore, double lato1, double lato2) {
		super(colore);
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.tipo = "Isoscele";
	}

	
	//Triangolo equilatero
	public Triangolo(String colore, double lato1) {
		super(colore);
		this.lato1 = lato1;
		this.tipo = "Equilatero";
	}


	@Override
	public double calcolaPerimetro() {
		double perimetro = 0.0;
		switch(tipo) {
		case "Scaleno":
			perimetro = lato1 + lato2 + lato3;
			break;
		case "Equilatero":
			perimetro =  lato1 * 3;
			break;
		case "Isoscele":
			perimetro = lato1 + (lato2 * 2);
			break;
		}
		return perimetro;
	}
	

	@Override
	public double calcolaArea() {
		//formula di erone
		return 0;
	}

}
