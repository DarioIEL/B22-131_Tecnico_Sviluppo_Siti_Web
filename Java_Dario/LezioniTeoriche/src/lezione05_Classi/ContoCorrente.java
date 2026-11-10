package lezione05_Classi;

public class ContoCorrente {
	
	private static int numConto = 2000; 
	private Persona proprietario;
	private double saldo;
	private String tipoConto;
	final static String banca = "Banca Ricchi e Poveri"; //questa è una costante condivisa da tutte le istanze della classe
	
	public ContoCorrente(Persona proprietario, double saldo, String tipoConto) {
		this.proprietario = proprietario;
		this.saldo = saldo;
		this.tipoConto = tipoConto;
		numConto++;
	}
	
	private void deposita(double importo) {
		saldo += importo;
	}
	
	private void preleva(double importo) {
		if(saldo < importo) {
			System.out.println("Non puoi prelevare. Fondi insufficienti");
		}else {
			this.saldo -= importo;
			System.out.println("Hai prelevato: " + importo + "\n Saldo attuale: " + getSaldo());
		}
	}

	private double getSaldo() {
		return saldo;
	}

	
	
	private String getInfoConto() {
		return "ContoCorrente " + banca + "\n[proprietario=" + proprietario.nome + " " + proprietario.cognome + "\nNumero Conto " + numConto + "\nsaldo=" + saldo + "\ntipoConto=" + tipoConto + "]";
	}

	
	

}
