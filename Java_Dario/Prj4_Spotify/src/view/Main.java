package view;

import controller.PlayListCtrl;
import model.Canzone;

public class Main {
	public static void main(String[] args) {

		PlayListCtrl playlistCtrlITA = new PlayListCtrl("Canzoni Italiane");
		playlistCtrlITA.caricaCanzoniAMano();
		
		System.out.println(playlistCtrlITA.stampaInfo());
		
	}
}
