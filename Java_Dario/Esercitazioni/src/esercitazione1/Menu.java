package esercitazione1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner mioScan = new Scanner(System.in);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");

		char scelta;

		do {
			System.out.println("\n ===================");
			System.out.println("Ciao digita un carattere tastiera scegliendo dal menù");
			System.out.println("1. Gioca ai dadi");
			System.out.println("2. Estrai numero random tra 1 e 100");
			System.out.println("3. Gioco del Lotto");
			System.out.println("4. Mostra Data");
			System.out.println("x. ESCI");
			System.out.println("===================");

			scelta = mioScan.nextLine().charAt(0);
			System.out.println("Hai scelto " + scelta);

			switch (scelta) {
			case '1':
				System.out.println("Benvenuto nel gioco dei dadi");
				System.out.println("Adesso lancerò 2 dadi");
				int d1, d2;
				d1 = (int) Math.ceil(Math.random() * 6);
				d2 = (int) Math.ceil(Math.random() * 6);

				System.out.println("Dado Blu: " + d1 + " - Dado Rosso: " + d2);
				if (d1 == d2) {
					System.out.println("Hai vinto!!");
				} else {
					System.out.println("Hai perso");
				}
				break;
			case '2':
				System.out.println("Stai estraendo un numero random...");
				int numRand = (int) Math.ceil(Math.random() * 100);
				System.out.println("Il numero estratto è " + numRand);
				break;
			case '3':
				System.out.println("Stai giocando al lotto. Io estraggo per te 6 numeri"); // Estrarre 6 numeri su un
												
				// set di 90
				int[] numeriEstratti = new int[90];

				int contatore = 0;
				int numEstrazioni = 0;

				while (contatore < numeriEstratti.length) {
					numEstrazioni++;
					// estraggo un numero random
					int numeroEstratto = (int) Math.ceil(Math.random() * 90);

					boolean isPresente = false;

					for (int i = 0; i < contatore; i++) {
						if (numeriEstratti[i] == numeroEstratto) {
							isPresente = true;
							break;
						}
					}

					if (!isPresente) {
						numeriEstratti[contatore] = numeroEstratto;
						contatore++;
					}
				}

				System.out.println("I numeri estratti sono: ...." +  Arrays.toString(numeriEstratti));
				System.out.println("Ho impiegato " + numEstrazioni + " estrazioni");
//				for (int num : numeriEstratti) {
//					System.out.print(num + " - ");
//				}
				break;
			case '4':
				System.out.println("Ora Esatta: " + LocalDateTime.now().format(formato));
				break;
			default:
				System.out.println("Non ho capito la scelta digita di nuovo...");

			}

		} while (scelta != 'x');

		System.out.println("Arrivederci !!");

	}
}
