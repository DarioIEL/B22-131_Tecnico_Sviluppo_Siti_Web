package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

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
	
	//Carico le canzoni dal file presente in progetto. Uso lo scanner
	public void caricaCanzoniDaFile(String percorso) {
		File mioFileCanzoni = new File(percorso);
		
		try {
			Scanner scan = new Scanner(mioFileCanzoni);
			while(scan.hasNextLine()) {
				String riga = scan.nextLine();
				String[] separate = riga.split(","); //il metodo split taglia ogni volta che incontro un pattern. In questo caso taglia ogni volta che incontra la ,
				
				String cantante = separate[0];
				String titolo = separate[1];
				int durata = Integer.parseInt(separate[2].trim());
				
				Canzone canzone = new Canzone(titolo, durata, cantante);
				
				this.playlist.addSong(canzone);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public List<Canzone> cerca(String parola){
		return playlist.cercaPerTitolo(parola);
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
