package controller;

import java.util.ArrayList;
import java.util.List;

import model.Nota;

public class BloccoNoteCtrl {
	
	//voglio un blocco note a capacità limitata
	public static final int CAPACITA_DEFAULT = 10;
	
	private String nome;
	private final int capacitaMassima;
	
	private final List<Nota> elencoNote = new ArrayList<>(); 
	
	public BloccoNoteCtrl(String nome, int capacitaMassima) {
		if(capacitaMassima <= 0) {
			throw new IllegalArgumentException("La capacità deve essere maggiore di zero");
		}
//		this.nome = nome;
		setNome(nome);
		this.capacitaMassima = capacitaMassima;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Il nome non può essere vuoto");
		}
		this.nome = nome.trim();
	}


	public int getCapacitaMassima() {
		return capacitaMassima;
	}

	
	//OPERAZIONI sulle NOTE
	
	//Questo metodo aggiunge note in coda alla lista
	public boolean addNota(String titolo, String descrizione) {
		if(elencoNote.size() >= capacitaMassima) {
			return false;
		}
		
		elencoNote.add(new Nota(titolo, descrizione));
		
		return true;
	}
	
	public boolean addNota(String titolo, String descrizione, int posizione) {
		if(posizione < 0 || posizione > elencoNote.size()) {
			throw new IllegalArgumentException("Posizione non valida. La nota deve essere in posizione tra 0 e " + elencoNote.size());
		}
		
		if(elencoNote.size() >= capacitaMassima) {
			return false;
		}
		
		elencoNote.add(posizione, new Nota(titolo, descrizione));
		return true;
	}
	
	public void stampaBloccoNote() {
		if(elencoNote.isEmpty()) {
			System.out.println("Il blocco note è vuoto");
			return;
		}
		
		for(int i = 0; i < elencoNote.size(); i++) {
			System.out.println("[ " + i + "] " + elencoNote.get(i).leggiNota());
		}
	}
	
	
	//Metodi da sviluppare
	/**
	 * Modifica nota (passo una posizione e modifico quella nota)
	 * Rimuovi Nota (passo posizione)
	 * Leggi Nota Singola (passo una posizione e legge quella nota)
	 * Svuota Blocco Note (pulisci)
	 */
}
