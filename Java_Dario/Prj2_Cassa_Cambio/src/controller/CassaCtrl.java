package controller;

import model.Cambio;
import model.Cassa;

public class CassaCtrl {

	private Cassa cassa;

	public CassaCtrl(String nome, double fondoDollari) {
		this.cassa = new Cassa(nome, fondoDollari);
	}
	
	public boolean aggiungiDollari(double importo) {
		//Qui ci può stare tutta la logica che vogliamo
		return cassa.aggiungiDollari(importo);
	}
	
	
	public String eseguiCambio(double importoEuro) {
		if (importoEuro <= 0) {
			return "Errore: l'importo deve essere positivo";
		}
		
		if(!cassa.verificaDisponibilita(importoEuro)) {
			return "Errore: fondi non sufficienti per il cambio";
		}
		
		Cambio cambio = cassa.eseguiCambio(importoEuro);
		
		return "Cambio eseguito. Importo dollari: " + cambio.getImportoDollari() + "\nEuro versati: " + importoEuro;
	}
	
	
	public String infoCassa(String username, String password) {
		//Stiamo giocando, non si fa così nella realtà
		if(username.equals("Admin") && password.equals("1234")) {
			return this.cassa.toString();
		}
		return "Non sei autenticato per questa operazione";
	}
}
