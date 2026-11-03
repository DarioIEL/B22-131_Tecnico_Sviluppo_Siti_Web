package lezione05_Classi;
//Crea un corso di studi

import java.util.ArrayList;
import java.util.List;

public class Aula {

	int numAula;
	int numPostazioni;
	List<Studente> studenti;
	String nomeCorso;
	int studentiIscritti;
	
	public Aula(int numAula, int numPostazioni, String nomeCorso) {
		this.numAula = numAula;
		this.numPostazioni = numPostazioni;
		this.nomeCorso = nomeCorso;
		this.studenti = new ArrayList<>();
	}
	
	
	public void aggiungiStudenti(Studente... studenti) {
		for(Studente stud: studenti) {
			studentiIscritti++;
			this.studenti.add(stud);
		}
	}


	@Override
	public String toString() {
		return "Aula [numAula=" + numAula + ", numPostazioni=" + numPostazioni + ", nomeCorso=" + nomeCorso + ", studenti Iscritti = "+ studentiIscritti + "]";
	}
	
	public String elencoStudentiCompleto() {
		String elenco = "";
		
		for (Studente studente : this.studenti) {
			elenco += studente.nome + " " + studente.cognome + " -  mat: " + studente.matricola + "\n";
		}
		
		return elenco;
	}
	
	
}
