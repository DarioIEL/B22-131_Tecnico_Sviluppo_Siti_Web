package lezione08_Eccezioni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScriviLeggiWarehouse {
	
	//Inserisco il percorso del file in una costante
	private static final String FILE = "./warehouse.txt";
	
	
	public static void main(String[] args) {
		List<Prodotto> prodottiDaCaricare = new ArrayList<>();
		prodottiDaCaricare.add(new Prodotto("Penna Blu", 0.2, 500));
		prodottiDaCaricare.add(new Prodotto("Quaderno quadretti", 0.75, 1500));
		prodottiDaCaricare.add(new Prodotto("Matita HB", 0.1, 2000));
		prodottiDaCaricare.add(new Prodotto("Gomma", 0.3, 250));
		
		save(prodottiDaCaricare);
	}
	
	
	static void save(List<Prodotto> prodotti){

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, false))){
				bw.write("name;price;amount"); //Prima riga del csv
				bw.newLine();
				
				for(Prodotto prod: prodotti) {
					bw.write(prod.toCSV()); //chiamo il metodo che trasforma il prodotto in una stringa CSV
					bw.newLine();
					System.out.println("Sto caricando il seguente prodotto " + prod.getName());
				}
				System.out.println("File salvato in: " + FILE);
			} catch (IOException e) {
				System.out.println("Il file non è stato salvato: " + e.getMessage());
			} 
	}
	
	//Trasforma i prodotti in CSV e li aggiunge al file (ATT: nel FileWriter utilizzare il TRUE)
	static boolean addProducts(List<Prodotto> prodotti) {
		
		return true;
	}
	
	static List<Prodotto> readProducts() {
		
		return null;
	}
	
}
