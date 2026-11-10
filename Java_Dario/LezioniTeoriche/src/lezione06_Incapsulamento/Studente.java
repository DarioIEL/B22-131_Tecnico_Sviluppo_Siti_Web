package lezione06_Incapsulamento;

public class Studente {

	private String nome;
	private String cognome;
	private int eta;
	private static int matricola;
	private boolean presenza;

	
	public Studente() {}


	public Studente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.presenza = true;
		Studente.matricola++;
	}


	//con i metodi Getters&Setters posso "manipolare" le informazioni del mio oggetto
	//I getters restituiscono valori
	//I setters impostano valori
	
	public String getNome() {
		return nome;
	}


	public void setNome(String username, String password, String nome) {
		if(username.equals("Pippo") && password.equals("1234")) {
			this.nome = nome;			
		}else {
			System.out.println("Accesso non consentito");
		}
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", matricola= "+ matricola +"]";
	}

}
