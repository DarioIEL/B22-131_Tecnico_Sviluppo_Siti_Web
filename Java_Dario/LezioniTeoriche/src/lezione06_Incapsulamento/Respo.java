package lezione06_Incapsulamento;

import java.util.List;

public class Respo {
	private String nome;
	private String cognome;
	private int numCorsiAssegnati;
	private List<Corso> corsiAssegnati;
	private Corso corso;
	
	public Respo(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public void setCorsi(Corso... corsi) {
		for(Corso c: corsi) {
			this.corsiAssegnati.add(c);
			this.numCorsiAssegnati++;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Corso> getCorsiAssegnati() {
		return corsiAssegnati;
	}

	@Override
	public String toString() {
		return "Respo [nome=" + nome + ", cognome=" + cognome + ", corsiAssegnati=" + corsiAssegnati + "]";
	}
	
	
	
}
