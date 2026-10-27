package giochi_premi;

import java.util.Random;
import java.util.Scanner;

public class GiocoDadi {

	public static void lanciaDadi(int numFacce) {
		
		int d1 = (int) Math.ceil(Math.random() * numFacce);

		Random rand = new Random();
		int d2 = rand.nextInt(1, numFacce);
		
		
		System.out.println("dado blu: " + d1 + " - dado rosso: " + d2);
		if(d1 == d2) {
			System.out.println("Hai vinto");
		}else {
			System.out.println("Hai perso");
		}
	}
	
	public static void menuDadi() {
		char scelta;
		Scanner mioScan = new Scanner(System.in);
		
		do {
			System.out.println("----- GIOCO DADI -----");
			System.out.println("1. Lancio semplice");
			System.out.println("2. Lancio con scelta valore");
			System.out.println("3. Esci");
			System.out.println("----------------------");
			
			scelta = mioScan.nextLine().charAt(0);
			
			switch(scelta) {
			case '1':
				lanciaDadi(6);
			break;
			case '2':
				Scanner scanDadi = new Scanner(System.in);
				System.out.println("Scegli le facce dei dadi");				
				int facce = scanDadi.nextInt();
				
				lanciaDadiConValore(facce);
			break;
			case '3':
				System.out.println("Stai ritornando al menu principale");
			break;
			default:
				System.out.println("Non capisco la tua scelta");
				
			}
			
		}while(scelta != '3');
		
		
	}

	public static void lanciaDadiConValore(int facce) {
		
		
		if(facce > 6 && facce < 32 ) {
			lanciaDadi(facce);
		}else {
			System.out.println("Mi spiace, hai inserito un numero non valido");
		}
		
		
	}
}
