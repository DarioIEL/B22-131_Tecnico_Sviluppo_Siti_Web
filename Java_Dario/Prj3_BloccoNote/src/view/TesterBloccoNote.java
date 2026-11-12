package view;

import java.util.Scanner;

import controller.BloccoNoteCtrl;

public class TesterBloccoNote {
	
		static Scanner scan;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Inserisci il nome del tuo blocco:");
		String nome = scan.nextLine();
		System.out.println("Inserisci la capacità massima del blocco:");
		int capacita = scan.nextInt();
		
		BloccoNoteCtrl blocco = new BloccoNoteCtrl(nome, capacita);
		
		System.out.println("Benvenuto nel blocco note: " + blocco.getNome());
		
		
//		String titoloNota = "Prima Nota del giorno";
//		String descrizioneNota = "Svolgere i seguenti argomenti a lezione: ....";
//		try {
//			blocco.addNota(titoloNota, descrizioneNota);
//			System.out.println("Nota aggiunta con successo");
//		}catch(IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//		blocco.stampaBloccoNote();

		//Costruire il menu
		boolean condUscita = false;
		
		while(!condUscita) {
			scan.nextLine();
			
			System.out.println("a. Aggiungi nota");
			System.out.println("b. Aggiungi nota in una posizione");
			System.out.println("x. Esci");
			
			String scelta = scan.nextLine();
			
			try {	
				switch(scelta) {
					case "a":
						String titolo = chiedi(scan, "Inserisci il titolo");
						String descrizione = chiedi(scan, "Inserisci descrizione");
						blocco.addNota(titolo, descrizione);
					break;
					case "x":
						System.out.println("Arrivederci !!!");
						condUscita = true;
					break;
					default:
						System.out.println("Non ho capito la scelta");
					
				}
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	private static String chiedi(Scanner sc, String messaggio) {
		System.out.println(messaggio);
		return sc.nextLine();
	}
}
