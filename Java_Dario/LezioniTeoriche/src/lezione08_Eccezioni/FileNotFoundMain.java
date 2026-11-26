package lezione08_Eccezioni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundMain {

	public static void main(String[] args) {
		
		//Vediamo delle eccezioni di tipo checked
		
		try {
			FileReader fr = new FileReader("./mioText.txt");
			BufferedReader br = new BufferedReader(fr); //questo oggetto genera un'altra eccezione checked
			
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				System.out.println("Non posso leggere una riga inesistente");
			}

		
		} catch (FileNotFoundException e) {
			System.out.println("Il file non è stato trovato !!");
		} 
		
		stampa("Ciao a tutti");
		stampa(null);
		
		
	}
	
	//eccezione Unchecked
	public static void stampa(String testo) {
		if(testo != null) {			
		System.out.println("Questo è il testo: " + testo);
		}
	}
}
