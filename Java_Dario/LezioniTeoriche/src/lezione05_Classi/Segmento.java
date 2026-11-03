package lezione05_Classi;

public class Segmento {

	Punto puntoA;
	Punto puntoB;
	double lunghezza;
	
	public Segmento(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.lunghezza = calcolaLunghezza(); //Aggiungendo questa riga mentre lo creo gli faccio calcolare la lunghezza
	}
	
	public double calcolaLunghezza() {
		 this.lunghezza = Math.sqrt(Math.pow((puntoB.x - puntoA.x), 2) + Math.pow((puntoB.y - puntoA.y), 2));
		
		return this.lunghezza;
	}

	@Override
	public String toString() {
		//ATT: quando richiamo puntoA e puntoB sto richiamando i toString() dei due punti
		return "Segmento [puntoA=" + puntoA + ", puntoB=" + puntoB + ", lunghezza=" + lunghezza + "]";
	}
	
	
	
	
}
