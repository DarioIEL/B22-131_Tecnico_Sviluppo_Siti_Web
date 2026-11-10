package lezione05_Classi;

public class TesterCorsi {

	public static void main(String[] args) {
		Studente stud1 = new Studente("Pippo", "Rossi", "pippo.rossi@mail.com", 25);
		stud1.aggiungiMateria("Java");
		stud1.aggiungiMaterie("Javascript", "HTML", "CSS", "Db");
		System.out.println(stud1);
		
		Studente stud2 = new Studente("Anna", "Verdi", "annaVerdi@mail.com", 20);
		Studente stud3 = new Studente("Paola", "Rossi", "paolarossi@mail.com", 30);
		Studente stud4 = new Studente("Luca", "Gialli", "lucagialli@mail.com", 25);
		
		//Aggiungo gli studenti all'aula
		Aula aula1 = new Aula(1, 10, "Tecnico Sviluppatore Software");
		aula1.aggiungiStudenti(stud1, stud2, stud3, stud4);
		System.out.println(aula1);
		System.out.println(aula1.elencoStudentiCompleto());
	
		
	}
}
