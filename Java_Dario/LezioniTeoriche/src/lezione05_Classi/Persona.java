package lezione05_Classi;

public class Persona {
		
	String nome;
	String cognome;
	Integer eta;
	
	//Il metodo costruttore di default esiste sempre ed è implicito


	//Con questo costruttore sotto, nel momento in cui creo l'oggetto gli passo anche i valori delle proprietà.
	public Persona(String nome, String cognome, Integer eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	//Se sono in presenza di un costruttore a firma piena e voglio utilizzare un costruttore di default allora lo devo per forza esplicitare
	public Persona() {}
	
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

	public void verificaLegalità() {
		System.out.println("Sì, puoi aprire il conto");
	}
	
		
}
