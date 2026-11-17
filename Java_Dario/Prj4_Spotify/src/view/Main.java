package view;

import java.util.Iterator;

import controller.PlayListCtrl;
import model.Canzone;

public class Main {
	public static void main(String[] args) {

		PlayListCtrl playlistCtrlITA = new PlayListCtrl("Canzoni Italiane");
		playlistCtrlITA.caricaCanzoniAMano();
		
		System.out.println(playlistCtrlITA.stampaInfo());
		
		System.out.println("=== Carico in Playlist da File ===");
		PlayListCtrl playListCtrlFile = new PlayListCtrl("Canzoni Varie da File");
		playListCtrlFile.caricaCanzoniDaFile("./canzoni.csv");
		System.out.println(playListCtrlFile.stampaInfo());
		
		System.out.println("___ Cerco una canzone ___");
		playListCtrlFile.cerca("Love").forEach(c -> System.out.println(c));
	}
}
