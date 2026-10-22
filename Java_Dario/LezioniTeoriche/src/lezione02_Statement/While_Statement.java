package lezione02_Statement;

import java.util.Scanner;

public class While_Statement {
	public static void main(String[] args) {

		//Con il while siamo nella famiglia dei cicli indefiniti.
		
		/**
		 * while (condizione){
		 * 		..eseguito finché la condizione è true
		 * }
		 */
		
		//Traduco un ciclo for utilizzando il while
		int i = 0;
		while(i <= 10) {
			System.out.println("ciao " + i);
			i++;
		}
		
		//Esempio con un scanner
		Scanner scan = new Scanner(System.in);
		
		int tentativi = 1;
		
		System.out.println("Inserisci la tua password");
		
		String pass = scan.nextLine();
		
		while(!pass.equals("1234")) { //finché la tua pass è diversa da 1234 continua a chiedermela
			tentativi++;
			System.out.println("Mi spiace, password errata...Riprova");
			pass = scan.nextLine();
		}
		
		System.out.println("Benvenuto nella piattaforma. Hai impiegato " + tentativi + " tentativi per accedere");
		
		
		//DO WHILE Conq uesto statement prima eseguiamo qualcosa POI lo controlliamo. Almeno una volta in tutto il codice viene eseguito ciò che si trova nel do
		int n = 0;
		
		do {
			int res = n * 7;
			System.out.println(n + " * 7 = " + res  );
			n++;
		}while(n <= 0);
		
		
	}
}
