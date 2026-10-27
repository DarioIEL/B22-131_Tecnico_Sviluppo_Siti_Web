package giochi_premi;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		
		Scanner mioScan = new Scanner(System.in);
		
		char scelta;
		
		do {
			
			System.out.println("==== MENU ====");
			System.out.println("1. Lancia Dadi");
			System.out.println("2. Calcola Multipli");
			System.out.println("3. Calcolca Volumi");
			System.out.println("X. ESCI");
			System.out.println("==============");
			System.out.println("Scegli una voce del menu");
			scelta = mioScan.nextLine().charAt(0);
			
			switch(scelta) {
			case '1':
				GiocoDadi.menuDadi();;
				break;
			case '2':
				Multipli.calcola();

				break;
			case '3':
//				CalcolaVolumi.calcola()
				break;
			case '4':
				//Triangoli
				break;
			default:
				System.out.println("Non hai selezionato nulla");
				
			}
			
		}while( scelta != 'X');
			
		System.out.println("Ciao, alla prossima");
		
	}
}
