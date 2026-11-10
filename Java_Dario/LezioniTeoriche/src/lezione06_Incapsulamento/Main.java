package lezione06_Incapsulamento;

public class Main {
	public static void main(String[] args) {
		
		Studente stud1 = new Studente(); //uso il costruttore di default
		//stud1.nome = "Dario"; //Non posso accedere ad una proprietà private in alcun modo
		stud1.setNome("Pippo", "1234", "Dario");
		stud1.setCognome("Mennillo");
		stud1.setEta(37);
		System.out.println(stud1.getNome());
		
		
		Studente stud2 = new Studente("Marco", "Rossi", 25);
		//System.out.println(stud2.nome); //Ancora non posso accedere alle proprietà
		System.out.println(stud2.getNome());
		System.out.println(stud2);
		
		Studente stud3 = new Studente("Laura", "Verdi", 32);
		System.out.println(stud3);
		
		Studente stud4 = new Studente("Pippo", "Bianchi", 30);
		
		
		Respo respo = new Respo("Stefania", "Vipiana");
		
		//==== NUOVO CORSO ====
		Corso corsoTSW = new Corso("Tecnico Sviluppatore Web", 600);		
		corsoTSW.setStudenti(stud1,stud2,stud3,stud4);
		corsoTSW.setResponsabileCorso(respo);
		System.out.println(corsoTSW);
		
	}
}
