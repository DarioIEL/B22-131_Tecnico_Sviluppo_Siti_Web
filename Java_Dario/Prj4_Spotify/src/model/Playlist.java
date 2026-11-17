package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {

	private String nome;
	private List<Canzone> canzoni;
	private String genere;
	
	//Costruttore solo nome --> infiniti posti
	public Playlist(String nome) {
		this.nome = nome;
		this.canzoni = new ArrayList<>();
	}
	
	//Costruttore nome e posizioni --> posti limitati
	public Playlist(String nome, int posizioni) {
		this.nome = nome;
		this.canzoni = new ArrayList<>(posizioni);
	}
	
	
	
	
}
