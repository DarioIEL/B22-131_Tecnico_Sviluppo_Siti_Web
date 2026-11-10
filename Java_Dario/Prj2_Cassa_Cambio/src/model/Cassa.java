package model;

public class Cassa {

	private String nome;
	private double saldoEuro, fondoDollari;
	private static final double TASSO_CAMBIO = 1.15;
	
	public Cassa(String nome, double fondoDollari) {
		this.nome = nome;
		this.fondoDollari = fondoDollari;
	}

	public double getFondoDollari() {
		return fondoDollari;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldoEuro() {
		return saldoEuro;
	}
	
	public boolean aggiungiDollari(double importo) {
		if(importo > 0) {
			this.fondoDollari += importo;
			return true;
		}
		return false;
	}
	
	public boolean verificaDisponibilita(double importoEuro) {
		double dollariPerCambio = importoEuro * TASSO_CAMBIO;
		if(this.fondoDollari < dollariPerCambio) {
			return false;
		}
		return true;
	}
	
	public Cambio eseguiCambio(double importoEuro) {
		double dollariDaCambiare = importoEuro * TASSO_CAMBIO - (0.025 * importoEuro);
		
		if(verificaDisponibilita(importoEuro)) {
			this.fondoDollari -= dollariDaCambiare;
			this.saldoEuro += importoEuro;
			return new Cambio(importoEuro, dollariDaCambiare, TASSO_CAMBIO);
		}
		
		return null;
	}

	
	@Override
	public String toString() {
		return "Cassa [nome=" + nome + ", saldoEuro=" + saldoEuro + ", fondoDollari=" + fondoDollari + "]";
	}
	
	
}
