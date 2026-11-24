package lezione07_Ereditarieta_Polimorfismo_Astrazione;

//La classe abstract è un modello comune

//REGOLE per classe abstract:
//- non può istanziare oggetti di tipo FormaGeometrica
//- può contenere un costruttore
//- può contenere campi e metodi astratti e non, quindi sia concreti sia astratti
//- se una classe contiene anche solo 1 metodo abtract l'intera class va dichiarata abstract
//- tendenzialmente dichiaro le proprietà come "protected" (visibili dalle sottoclassi e nel package)

public abstract class FormaGeometrica {
	
	//con pretected rendo visibile la prop nel package e in TUTTE le SOTTOCLASSI che ereditano anche in altri package
	protected String colore;
	
	//posso avere un costruttore ma non posso usarlo con new
	public FormaGeometrica(String colore) {
		this.colore = colore;
	}
	
	//Visto che ho una classe astratta posso dichiarare dei metodi astratti
	//I metodi astratti non hanno implementazione e OBBLIGANO la subclass a implementarlo (CONTRATTO). A sua volta una subclass astratta che implementa una classe astratta può rimandare l'implementazione alle classi figlie.
	public abstract double calcolaPerimetro();
	public abstract double calcolaArea();
	
	//POSSO, all'interno di una classe astratta, sviluppare un metodo concreto. Questo metodo può invocare un metodo astratto. A RUNTIME VERRà ESEGUITA L'IMPLEMENTAZIONE DELLA SOTTOCLASSE REALE (POLIMORFISMO)
	public String descrivi() {
		String descrizione = "Sono una forma geometrica di tipo "+ getClass().getSimpleName() + " e colore: " + colore 
				+ "\n - area: " + calcolaArea() 
				+ "\n - perimetro: " + calcolaPerimetro();
		
		return descrizione;
	};

	
}
