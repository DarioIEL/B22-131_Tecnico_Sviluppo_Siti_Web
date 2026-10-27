package lezione03_Metodi;

public class Metodi_degli_altri {
 //In questa classe recupero i metodi della classe Intro. 
//Questo potrà avvenire perché i metodi di Intro oltre ad essere public (visibili in tutto il progetto, nello stesso package posso anche non avere public e funziona uguale) sono anche static (quindi li posso richiamare da metodi di altre classi)
	
	public static void main(String[] args) {
	//  NomeClasse.metodo()
		Intro.salutaRespo("Egle Risola");
		double numRand = Intro.generaRandom();
		System.out.println(numRand);
		
		Overload_metodi.salutaRespo("Anna", "Rossi");
	}
}
