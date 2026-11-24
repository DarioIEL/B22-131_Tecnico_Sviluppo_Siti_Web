package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class MainAzienda {
	public static void main(String[] args) {
		
		//Posso istanziare i seguenti oggetti
		Manager manag1 = new Manager("Paola Rossi", 1500, 2000);
		System.out.println(manag1.calcolaStipendio());
		System.out.println(manag1);
		
		Sviluppatore svil1 = new Sviluppatore("Pier Pieri", 1500, "Sviluppo", "Java", "Angular", "MySQL");
		System.out.println(svil1.calcolaStipendio());
		System.out.println(svil1);
		svil1.sostieniColloquio();
		
		//UPCASTING è automatico
		Dipendente manag2 = new Manager("Anna Gialli", 1500, 3000);
		System.out.println(manag2);
		
		Dipendente svil2 = new Sviluppatore("Mario Verdi", 1500, "Testing", "JUNIT", "Cucumber");
		System.out.println(svil2);
//		svil2.sostieniColloquio(); NON POSSO RICHIAMARE UN METODO di SVILUPPATORE perché svil2 è di tipo DIPENDENTE
		
		//VISTO CHE DIPENDENTE è UNA CLASSE CONCRETA POSSO ANCHE ISTANZIARE UN OGGETTO DI TIPO DIPENDENTE
		Dipendente dip1 = new Dipendente("Laura Neri", 1500);
		System.out.println(dip1);
		
		//DOWNCASTING non è mai automatico
		Sviluppatore svil3;
		if(dip1 instanceof Sviluppatore) {
			svil3 = (Sviluppatore) dip1;
			svil3.aggiungiLinguaggio(null); //appartiene classe Sviluppatore
			svil3.calcolaStipendio(); //appartiene classe Dipendente
		}
	}
}
