package lezione05_Classi;

import java.util.Scanner;

public class TesterPersona {

	public static void main(String[] args) {
		
		//Creo una nuova Persona (un nuovo oggetto di tipo Persona)
		
		Persona pers1 = new Persona(); //In questo caso sto utilizzando il costruttore di default, quello senza parametri e non è esplicitato nella classe Persona(),
		
		pers1.nome = "Laura";
		pers1.cognome = "Verdi";
		pers1.eta = 28;
		
		System.out.println(pers1.toString());
		
		Persona pers2 = new Persona("Paolo", "Rossi", 22);
		System.out.println(pers2);
		
		//Posso creare una persona grazie agli input utente
		Scanner scan = new Scanner(System.in);
//		System.out.println("Inserisci il nome");
//		String nomePers = scan.nextLine();
//		
//		System.out.println("Inserisci il cognome");
//		String cognomePers = scan.nextLine();
//		
//		System.out.println("Inserisci età");
//		int eta = scan.nextInt();
		
//		Persona pers3 = new Persona(nomePers, cognomePers, eta);	
//		System.out.println(pers3.toString());
		
		Persona pers3 = new Persona();
		System.out.println("Inserisci il nome");
		pers3.nome = scan.nextLine();
		
		System.out.println("Inserisci il cognome");
		pers3.cognome = scan.nextLine();
		
		System.out.println("Inserisci l'età");
		pers3.eta = scan.nextInt();
		
		System.out.println(pers3);
		System.out.println("Ciao, test di git");
				
				
	}
}
