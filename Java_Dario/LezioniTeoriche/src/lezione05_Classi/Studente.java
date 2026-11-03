package lezione05_Classi;

import java.util.ArrayList;
import java.util.List;

public class Studente {

	public String nome;
	public String cognome;
	public String email;
	public int eta;
	public int matricola;
	public List<String> materie;
	
	public Studente(String nome, String cognome, String email, int eta) {
		//this.proprietà = parametro (Proprietà e parametro hanno la stessa denominazione)
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = eta;
		
		//le materie le associamo ad un ArrayList vuoto
		this.materie = new ArrayList<>();
		
		//La matricola la facciamo calcolare da un metodo static
		this.matricola = matricolatore();
	}
	
	private static int matricolatore() { //Questo è un metodo di classe, quindi non può essere utilizzate dalle istanze
		int matricola = (int) Math.ceil(Math.random() * 1000);
		return matricola;
	}
	
	//Metodo che aggiunge una materia alla volta
	public void aggiungiMateria(String materia) {
		this.materie.add(materia);
		System.out.println("Hai aggiunto la seguente materia: " + materia);
	}

	public void aggiungiMaterie(String... materie) {
		for(String mat: materie) {
			this.materie.add(mat); //In questo caso sono obbligato ad utilizzare il this.materie, questo perché il parametro di aggiungiMaterie ha un nome identico alla proprietà materie. Per non confondere il codice uso il this. davanti al nome della proprietà dell'oggetto
		}
	}
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", eta=" + eta + ", matricola="
				+ matricola + ", materie=" + materie + "]";
	}
	
	
	
	
}
