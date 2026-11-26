package lezione08_Eccezioni;

import java.io.FileNotFoundException;

public class GestioneThrowException {
	
	public static void calcolaDivisione(int num1, int num2) {
		double risultato = 0.0;
		
		if(num2 == 0) {
			throw new ArithmeticException(); //Questa va gestita con un TRy&Catch quando richiamerò il metodo
		//Con il throw lascio che sia il metodo che usa calcolaDivisione a doverlo gestire attraverso un Try & Catch
		}else {
			risultato = num1 / num2;
			System.out.println(risultato);
		}
		
	}
	
	//In Questo caso vengono gestite le eccezioni direttamente sul metodo, sarò poi obbligato a implementare i vari catch
	public static void stampaTesto(String testo) throws Exception, MieEccezioni {
		
		if(testo == null) {
			throw new Exception(); //Quando uso un'eccezione diversa da ArithmeticException devo utilizzare il throws sul metodo
		}else if(testo == "Scemo") {
			throw new MieEccezioni();
		}
		else {
			System.out.println("Il tuo testo: " + testo);
		}
	}
	
	
	public static void main(String[] args) {

//		calcolaDivisione(10, 0);
		try {
			calcolaDivisione(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Non puoi dividere per 0");
		}
		
		
		
		//Richiamo stampa testo
		try {
			stampaTesto(null);
			
		} catch (Exception e) {
			
			System.out.println("Il testo è null. Non hai inserito nulla");
			
		} catch (MieEccezioni e) {
			
			System.out.println(e.getMessage());
		}
	}
}
