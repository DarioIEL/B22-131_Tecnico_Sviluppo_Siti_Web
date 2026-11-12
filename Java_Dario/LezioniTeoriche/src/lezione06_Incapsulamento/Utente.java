package lezione06_Incapsulamento;

public class Utente {

	private String nome;
	private String cognome;
	private String email;
	private String passwordHash;
	private boolean confermaDati;
	private int eta;
	
	public Utente(String nome, String cognome, String email, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = eta;
	}


	//Creo i metodi Getters & Setters. Mi servono per poter leggere o scrivere all'esterno della classe le proprietà dell'oggetto
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isConfermaDati() {
		return confermaDati;
	}

	public void setConfermaDati(boolean confermaDati) {
		this.confermaDati = confermaDati;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		if(eta >= 18 && eta <= 120) {
			this.eta = eta;			
		}else {
			throw new IllegalArgumentException("Età non valida " + eta);		
		}
		
	}

	public void setPassword(String password) {
		if(password == null || password.length() < 8) {
			throw new IllegalArgumentException("La password non è valida");
		}
		this.passwordHash = calcolaHash(password);
	}
	
	
	public boolean verificaPassword(String tentativo) {
		return tentativo != null && calcolaHash(tentativo).equals(passwordHash);
	}
	
	
	private String calcolaHash(String testo) {
		return Integer.toHexString(testo.hashCode()); 
	}
	
}
