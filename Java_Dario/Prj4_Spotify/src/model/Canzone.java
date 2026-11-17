package model;

public class Canzone {
	
	//Definisco lo stato della classe. Definisco le proprietà di classe
	private String titolo;
	private int durata;
	private String cantante;

	//Metodo costruttore
	public Canzone(String titolo, int durata, String cantante) {
		this.titolo = titolo;
		this.durata = durata;
		this.cantante = cantante;		
	}
	
	public Canzone(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	@Override
	public String toString() {
		if(cantante != null) {
			return "Canzone [titolo=" + titolo + ", durata=" + durata + ", cantante=" + cantante + "]";
		}
		return "Canzone [titolo=" + titolo + ", durata=" + durata + "]";
	}
	
	
}
