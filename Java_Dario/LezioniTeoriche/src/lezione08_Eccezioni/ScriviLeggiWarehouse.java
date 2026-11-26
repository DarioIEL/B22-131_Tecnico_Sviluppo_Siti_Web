package lezione08_Eccezioni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScriviLeggiWarehouse {
	
	//Inserisco il percorso del file in una costante
	private static final String FILE = "./warehouse.txt";
	
	
	public static void main(String[] args) {
//		List<Prodotto> prodottiDaCaricare = new ArrayList<>();
//		prodottiDaCaricare.add(new Prodotto("Penna Blu", 0.2, 500));
//		prodottiDaCaricare.add(new Prodotto("Quaderno quadretti", 0.75, 1500));
//		prodottiDaCaricare.add(new Prodotto("Matita HB", 0.1, 2000));
//		prodottiDaCaricare.add(new Prodotto("Gomma", 0.3, 250));
//		
//		save(prodottiDaCaricare);
//		
//		prodottiDaCaricare.add(new Prodotto("Prova", 0, 0));
//		save(prodottiDaCaricare);
		
		//Adesso leggo i prodotti
		readProducts().forEach(p -> System.out.println(p));
	}
	
	
	//Questo metodo salva per laprima volta il file
	static void save(List<Prodotto> prodotti){
			//L'utilizzo del false mi permette di salvare il file da zero sovrascrivendo
			//Se uso true verrà aggiunta la riga sotto a quelle esistenti
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
	
	//Trasforma i prodotti in CSV e li aggiunge al file (ATT: nel FileWriter utilizzare il TRUE che aggiunge in coda)
	static boolean addProducts(List<Prodotto> prodotti) {
		File mioFile = new File(FILE);
		
		if(!mioFile.exists()) {
			System.out.println("Non puoi aggiungere un prodotto ad un file inesistente !!");
			return false;
		}
		
		return true;
	}
	
	static List<Prodotto> readProducts() {
		List<Prodotto> prodotti = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			
			br.readLine();
			
			String riga;
			
			while((riga = br.readLine()) != null) {
				
				if(riga.isBlank()) continue;
				
//				String[] campi = riga.split(";");
//				String name = campi[0];
//				double price = Double.parseDouble(campi[1]);
//				int amount = Integer.parseInt(campi[2]);
//				prodotti.add(new Prodotto(name, price, amount));
				
				try {
					prodotti.add(Prodotto.fromCSV(riga));
				}catch (IllegalArgumentException e) {
					System.out.println(e.getMessage() + " - Riga Scartata");
				}
				
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prodotti;
	}
	
}
