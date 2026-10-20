package helloWorld;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Andiamo in Pausa !!");
		System.out.println("Siamo tornati dalla pausa");
		System.out.println("Questa è la nostra prima lezione di Java!");

		// Commento: serve a tenere traccia di quello che succede nel codice, serve a
		// creare documentazione utile al codice

		/**
		 * Commento multiriga
		 */

		// istanzio e assegno un valore ad una variabile
		String mioNome = "Anna";
		String mioCognome = "Rossi";
		int miaEta = 37;

		System.out.println("Ciao, mi chiamo " + mioNome + " " + mioCognome + " e ho " + miaEta + " anni !");
		
		//Riassegno le variabili: cambio il valore alle variabili
		mioNome = "Paolo";
		mioCognome = "Verdi";
		miaEta = 25;
		
		// Faccio una concatenazione tra stringhe
		System.out.println("Ciao, mi chiamo " + mioNome + " " + mioCognome + " e ho " + miaEta + " anni !");
		
		Scanner mioScan = new Scanner(System.in);
		
		System.out.println("Digita adesso il tuo username");
		
		String username = mioScan.next();
		
		System.out.println("Ciao " + username + " benvenuta/o nella mia App!");
		
		System.out.println("Scrivi adesso la tua età: ");
		
		int etaUser = mioScan.nextInt();
		
		System.out.println("Bene, hai " + etaUser + " anni");
		
	}

}
