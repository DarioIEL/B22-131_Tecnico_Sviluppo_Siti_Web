package lezione02_Statement;

import java.util.Scanner;

public class Scanner_esempio {
	public static void main(String[] args) {
		// Scanner è un oggetto che permette di acquisire gli input utente

		// Acquisire String
		Scanner scan = new Scanner(System.in);

		String mioNome = "";

		while (mioNome.equals("")) {
			System.out.println("Scrivi il tuo nome");
			mioNome = scan.nextLine();
			
			if (mioNome.trim().equals("")) {
				System.out.println("Non hai inserito niente");

			} else {
				System.out.println("Ciao " + mioNome);
			}
		}
		
		//Acquisisco un numero. Posso usare lo scanner per tipi diversi
		
		int eta = 0;
		
		while(eta == 0) {
			System.out.println("Inserisci adesso la tua età");
			eta = scan.nextInt();
			
			if(eta >= 18) {
				System.out.println("Bene, sei maggiorenne");
			}else if(eta < 18 && eta > 0) {
				System.out.println("Mi spiace, sei minorenne");
			}else {
				System.out.println("Non hai inserito nulla");
			}
		}
		
		
		scan.nextLine(); //pulisco lo scanner

		System.out.println("Inserisci un numero");
		
		try {
			double num = scan.nextDouble();
			System.out.println("Hai inserito " + num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Hai inserito qualcosa che non è un numero");
		}
		
		
		scan.close(); //chiudo lo scanner
		
	
		
		
	}

}
