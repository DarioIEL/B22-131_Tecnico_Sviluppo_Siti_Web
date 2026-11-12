package lezione06_Incapsulamento;

public class Admin {
	
	//Utilizzando il modificatore protected io raggiungo le proprietà solo all'interno di questo package. All'esterno uso i metodi getters and setters
	
	protected String username;
	protected String tipologia;
	
	public Admin(String username, String tipologia) {
		this.username = username;
		this.tipologia = tipologia;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	
	
	
}
