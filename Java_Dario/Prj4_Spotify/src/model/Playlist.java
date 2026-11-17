package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {

	private String nome;
	private List<Canzone> canzoni;
	private String genere;
	private int maxPosizioni = 0;
	
	//Costruttore solo nome --> infiniti posti
	public Playlist(String nome) {
		this.nome = nome;
		this.canzoni = new ArrayList<>();
	}
	
	//Costruttore nome e posizioni --> posti limitati
	public Playlist(String nome, int posizioni) {
		this.nome = nome;
		this.canzoni = new ArrayList<>(posizioni); 
		this.maxPosizioni = posizioni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Canzone> getCanzoni() {
		return canzoni;
	}

	public void setCanzoni(List<Canzone> canzoni) {
		this.canzoni = canzoni;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
	//aggiungi una canzone
	public boolean addSong(Canzone canzone) {
		if(canzone == null) {
			return false;
		}
		if(isPiena()) {
			return false;
		}
		return canzoni.add(canzone);

	}
	
	public boolean isPiena() {
		return maxPosizioni > 0 && canzoni.size() >= maxPosizioni;
	}
	
	public Double durataTotale() {
		Double totale = 0.0;
		for(Canzone c: canzoni) {
			totale +=  (double) c.getDurata() / 60;
		}
		return totale;
	}
	
	public List<Canzone> cercaPerTitolo(String parola){
		List<Canzone> risultati = new ArrayList<>();
		for(Canzone c: canzoni) {
			if(c.getTitolo().toLowerCase().contains(parola.toLowerCase())) {
				risultati.add(c);
			}
		}
		return risultati;
	}
	
	public String infoPlaylist() {
		String durataCorretta = String.format("%.2f", durataTotale());
		
		return "Info Playlist: " + nome + " - Canzoni contenute : " + canzoni.size() + " - durata totale: " + durataCorretta +  " min";
	}

}
