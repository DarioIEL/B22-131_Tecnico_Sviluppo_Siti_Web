package lezione03_Metodi;

import java.util.Random;
import java.util.Scanner;

public class Intro {

	//keyword STATIC: con questa keyword segnalo che il metodo appartiene alla classe e NON all'istanza (oggetto). Cioè, devo avere la possibilità di richiamare il metodo dalla classe stessa o da altri metodi
	
	//con void come tipo di restituzione non mi aspetto nulla in uscita ma solo esecuzione di codice
	public static void salutaUser() {
		String nomeUser = "Dario"; //variabile locale. Scope definito al metodo
		System.out.println("Ciao " + nomeUser);
	}

	//Metodo void ma con parametri in ingresso
	public static void salutaRespo(String nomeRespo) {
		System.out.println("Ciao Respo Corso " + nomeRespo);
	}
	
	  //Se mi metto all'esterno dei metodi e istanzio una variabile static sto creando una variabile con scope globale: visibilità in tutti i metodi della classe stessa e posso usarla direttamente nei metodi. DEVE ESSERE STATIC 
	 static String mioNome = "Dario";
	
	public static void main(String[] args) {
		//Richiamo per nome il metodo salutaUser()
		salutaUser();
		salutaRespo("Stefania Vipiana");
		salutaRespo("Valentina Favole");
		salutaStudente();
		System.out.println("ciao " + mioNome);
		
		int risultato = calcolaSomma(9, 10);
		System.out.println("IL risultato è " + risultato);
		
		Scanner mioScanner = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int num1 = mioScanner.nextInt();
		System.out.println("Inserisci un numero");
		int num2 = mioScanner.nextInt();
		System.out.println(calcolaSomma(num1,num2));
		faiCose();
	}
	
	public static void salutaStudente() {
		Scanner mioScan = new Scanner(System.in);
		System.out.println("Chi è lo studente che vuoi salutare ?");
		String nomeUser = mioScan.nextLine();
		System.out.println("Ciao Studente " + nomeUser);
		System.out.println("Il corso è tenuto dal docente " + mioNome);
	}
	
	public static int calcolaSomma(int num1, int num2) {
		int somma = num1 + num2;		
		return somma;
	}
	
	static double generaRandom() {
		//In questo caso utilizzo l'oggetto Random()
		Random rand = new Random();
		double numRand = rand.nextDouble(5.0, 14.0);
		return numRand;
	}
	
	 public static void faiCose() {
		 System.out.println("Ho richiamato un metodo da un altro metodo");
		System.out.println(generaRandom());
	}
}
