package lezione07_Ereditarieta_Polimorfismo_Astrazione;

//In Java è possibile estendere una classe Astratta
public abstract class TriangoloABS extends FormaGeometrica{

	public TriangoloABS(String colore) {
		super(colore);
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
