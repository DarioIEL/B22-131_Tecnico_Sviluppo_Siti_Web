package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class MainAzienda {
	public static void main(String[] args) {
		
		//Posso istanziare i seguenti oggetti
		Manager manag1 = new Manager("Paola Rossi", 1500, 2000);
		System.out.println(manag1.calcolaStipendio());
		System.out.println(manag1);
		
		Sviluppatore svil1 = new Sviluppatore("Pier Pieri", 1500);
		System.out.println(svil1.calcolaStipendio());
		System.out.println(svil1);
		
		//UPCASTING
		Dipendente manag2 = new Manager("Anna Gialli", 1500, 3000);
		System.out.println(manag2);
		
		Dipendente svil2 = new Sviluppatore("Mario Verdi", 1500);
		System.out.println(svil2);
		
		//VISTO CHE DIPENDENTE è UNA CLASSE CONCRETA POSSO ANCHE ISTANZIARE UN OGGETTO DI TIPO DIPENDENTE
		Dipendente dip1 = new Dipendente("Laura Neri", 1500);
		System.out.println(dip1);
	}
}
