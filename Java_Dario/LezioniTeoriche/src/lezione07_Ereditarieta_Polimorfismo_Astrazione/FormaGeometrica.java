package lezione07_Ereditarieta_Polimorfismo_Astrazione;

//La classe abstract è un modello comune

//REGOLE per classe abstract:
//- non può istanziare oggetti di tipo FormaGeometrica
//- può contenere un costruttore
//- può contenere campi e metodi atratti e non, quindi sia concreti sia astratti
//- se una classe contiene anche solo 1 metodo abtract l'intera class va dichiarata abstract
//- tendenzialmente dichiaro le proprietà come "protected" (visibili dalle sottoclassi e nel package)

public abstract class FormaGeometrica {

	public FormaGeometrica() {
		super();
	}

	
}
