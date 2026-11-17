package controller;

import model.Canzone;
import model.Playlist;

public class PlayListCtrl {
	
	private Playlist playlist;

	//senza limiti di posti
	public PlayListCtrl(String nome) {
		this.playlist = new Playlist(nome);
	}
	
	//con limiti posti
	public PlayListCtrl(String nome, int posizione) {
		this.playlist = new Playlist(nome, posizione);
	}
	
	
	public void caricaCanzoniAMano() {
		Canzone raccolta[] = {
			new Canzone("Maledetta Primavera", 200, "Loretta Goggi"),
			new Canzone("Di chi ti ricordi per sorridere", 250, "Fabri Fibra"),
			new Canzone("Il cielo è sempre più blu", 350, "Rino Gaetano"),
			new Canzone("Dolcevita", 300)
		};
		
		for(Canzone canzone: raccolta) {
			if(!playlist.addSong(canzone)) {
				System.out.println("Playlist piena, non ho inserito queste canzoni " + canzone.getTitolo());
			}
		}
	
	}

	public StringBuilder stampaInfo() {
		StringBuilder infoGlobale = new StringBuilder();
		infoGlobale.append(this.playlist.infoPlaylist());
		for(Canzone c: this.playlist.getCanzoni()) {
			infoGlobale.append("\n" + c.getTitolo());
		}
		return infoGlobale;		
	}
	
	
}
