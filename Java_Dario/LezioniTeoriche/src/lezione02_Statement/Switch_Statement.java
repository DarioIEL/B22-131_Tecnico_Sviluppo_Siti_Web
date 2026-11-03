package lezione02_Statement;

public class Switch_Statement {
	public static void main(String[] args) {

		// Lo switch valuta il valore di una variabile distinguendo i vari casi (quali
		// valori può assumere una variabile)

		int giornoSettimana = 4;

		switch (giornoSettimana) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;
		default:
			System.out.println("Hai messo un numero non valido");
			break;
		}

		
		String nomeGiorno = "Lunedì";
		
		switch (nomeGiorno) {
		case "Lunedì":
			System.out.println("Oggi è il primo giorno della settimana");
			int n = 10;
			for(int i = 0; i < 100; i++) {
				if(i == 20) {
					System.out.println(i);
					System.out.println("Siamo al numero 20");
					}
				}
			break;
		case "Martedì":
			System.out.println("Siamo solo al secondo giorno");
			break;
				
			}
		
		//VideoGame
		String archetipo = "Paladino";
		switch (archetipo) {
		case "Paladino":
			System.out.println("Ministero della giustizia");
			break;
		case "Stregone":
			System.out.println("Ministero della cultura");
			break;
		case "Ladro":
			System.out.println("Ministero dei trasporti");
			break;
		default:
			System.out.println("Scelta non valida");
			break;
		}
		
		if(archetipo.equals("Paladino")) {
			System.out.println("");
		}else if(archetipo.equals("Stregone")) {
			System.out.println();
		}
		
		
		}
	}
