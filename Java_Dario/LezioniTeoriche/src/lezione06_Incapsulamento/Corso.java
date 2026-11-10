package lezione06_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Corso {

	private static int id = 0;
	private String nomeCorso;
	private int durataCorso;
	private List<Studente> studenti;
	private Respo responsabileCorso;
	
	public Corso(String nomeCorso, int durataCorso) {
		this.nomeCorso = nomeCorso;
		this.durataCorso = durataCorso;
		this.studenti = new ArrayList<>();
		id = (int)Math.floor(Math.random() * 1000);
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getDurataCorso() {
		return durataCorso;
	}

	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(Studente... studenti) {
		for (Studente s : studenti) {
			this.studenti.add(s);
		}
	}

	public Respo getResponsabileCorso() {
		return responsabileCorso;
	}

	public void setResponsabileCorso(Respo responsabileCorso) {
		this.responsabileCorso = responsabileCorso;
		responsabileCorso.setCorsi(this); //questo this fa riferimento all'istanza della classe corso creata		
	}

	@Override
	public String toString() {
	    return "Corso [nomeCorso=" + nomeCorso + ", durataCorso=" + durataCorso + ", studenti=" + studenti+ ", responsabileCorso=" + responsabileCorso + "]";
	}
	
	
	
	
}
