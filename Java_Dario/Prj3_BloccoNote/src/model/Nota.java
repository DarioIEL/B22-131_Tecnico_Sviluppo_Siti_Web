package model;

import java.util.Date;

public class Nota {
	
	public static final int MAX_LUNGHEZZA_TITOLO = 30;
	
	private String titolo;
	private String descrizione;
	private final Date dataCreazione;
	
	public Nota(String titolo, String descrizione) {
		setTitolo(titolo);
		setDescrizione(descrizione);
		this.dataCreazione = new Date();
	}

	// GETTERS
	public String getTitolo() {
		return titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}

	
	public Date getDataCreazione() {
		return  new Date(dataCreazione.getTime());
	}

	//SETTERS
	
	public void setTitolo(String titolo) {
		if(titolo == null || titolo.isBlank()) {
			throw new IllegalArgumentException("Il titolo non può essere vuoto");
		}
		if(titolo.length() > MAX_LUNGHEZZA_TITOLO) {
			throw new IllegalArgumentException("Il titolo non può superare i " + MAX_LUNGHEZZA_TITOLO + " caratteri");
		}
		
		this.titolo = titolo.trim(); //Il trim() taglia gli spazi vuoti all'inizio e alla fine di una stringa
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = (descrizione == null) ? "": descrizione.trim();
	}
	
	
	public String leggiNota() {
		return this.titolo + " - " + this.descrizione + " - " + this.dataCreazione;
	}
	
}
