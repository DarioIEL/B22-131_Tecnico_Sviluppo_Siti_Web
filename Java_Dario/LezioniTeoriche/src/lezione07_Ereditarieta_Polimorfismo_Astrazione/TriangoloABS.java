package lezione07_Ereditarieta_Polimorfismo_Astrazione;

//In Java è possibile estendere una classe Astratta
public abstract class TriangoloABS extends FormaGeometrica{

	protected String tipo;
	
	public TriangoloABS(String colore, String tipo) {
		super(colore);
		this.tipo = tipo;
	}

	
	public double calcolaAreaConErone(double lato) {
		
		return 0.0;
	}
	//POSSO fare l'override dei metodi astratti ma in questo caso NON sono obbligato come nella classe concreta che estende la classe astratta.
	
//	@Override
//	public double calcolaPerimetro() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double calcolaArea() {
//		
//		return 0;
//	}


}
