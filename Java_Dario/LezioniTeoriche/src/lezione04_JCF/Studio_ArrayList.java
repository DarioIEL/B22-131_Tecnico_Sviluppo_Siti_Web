package lezione04_JCF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Studio_ArrayList {
	public static void main(String[] args) {
		
		//Siamo nella JCF = Java Collections Framework
		
		//Gli ArrayList sono degli array ridimensionabili: non hanno una dimensione fissa. Gerarchicamente sono parte delle List che a loro volta sono parte degli oggetti Iterable

		//Iterable -> List -> ArrayList
		
		//1° Modo Scorretto di dichiarare un ArrayList
		ArrayList<String> parole = new ArrayList<>();
		
		//2° MODO (consigliato)
		List<String> nomi = new ArrayList<>();
		
		//aggiungo elementi. Posso farlo con un metodo
		nomi.add("Anna");
		nomi.add("Laura");
		nomi.add("Marco");
		nomi.add("Dario");
		
		
		System.out.println("Nell'arrayList ci sono " + nomi.size() + " elementi");
		
		System.out.println(nomi); //non stampa il puntatore come negli array
		System.out.println(nomi.reversed());
		System.out.println(nomi.isEmpty());
		
		//Valgono gli indici ma applicati al metodo get
		System.out.println(nomi.get(1));
		System.out.println(nomi.get(nomi.size() - 1 ));
		
		//Metodo set per modificare un valore
		nomi.set(1, "Lauretta Bianchi");
		System.out.println(nomi);
		
		//Fanno parte della famiglia degli Iterable quindi uso tranquillamente for e foreach
		for(int i = 0; i < nomi.size(); i++) {
			System.out.println("Ciao " + nomi.get(i));
		}
		
		//foreach
		for (String nome : nomi) {
			System.out.println("Ciao " + nome);
		}
		
		//Att: questo foreach è tipico degli Iterable. Viene ereditato da tutte le sottofamiglie di Iterable
		nomi.forEach(nome -> System.out.println(nome));
		
		//Trasformare un arrayList in un array
		String[] nomiPersone = new String[nomi.size()];
		for(int i = 0; i < nomi.size(); i++) {
			nomiPersone[i] = nomi.get(i);
		}
		
		System.out.println(nomiPersone);
		//Se volessi stampare in un colpo solo l'array
		System.out.println(Arrays.toString(nomiPersone));
		
		//ArrayList di numeri ?  Non posso utilizzare tra l'operatore diamond <> un tipo primitivo. Quindi uso le classi wrapper dei primitivi: la versione oggetto dei primitivi
		/**
		 * int -> Integer
		 * double -> Double
		 * boolean -> Boolean
		 * float -> Float
		 * byte -> Byte
		 */
		
		List<Integer> numeri = new ArrayList<>();
		numeri.add(4);
		numeri.add(23);
		numeri.add(1);
		numeri.add(9);
		
		//Voglio aggiungere più valori contemporaneamente e non più uno alla volta con add
		
		List<String> frutta = new ArrayList<>();
		frutta.addAll(Arrays.asList("Mela", "Pesca", "Ciliegia", "Kiwi"));
		
		//Metodo Collections.addAll() per aggiungere più elementi
		Collections.addAll(frutta, "Banana", "Mango", "Papaya");
		System.out.println(frutta);
		
		List<String> colori = new ArrayList<>();
		colori.add("Rosso");
		colori.add("Giallo");
		colori.add("Blu");
		
		//Creo una lista immutabile. Non posso aggiungere o rimuovere elementi
		List<String> cittàImmutabili = List.of("Torino", "Milano", "Roma", "Napoli");
//		cittàImmutabili.add("Palermo");
//		cittàImmutabili.remove(0);

		//Posso sempre trasformarlo in una lista modificabile
		List<String> cittàModificabili = new ArrayList<>(cittàImmutabili);
		cittàModificabili.add("Palermo");
		System.out.println(cittàModificabili);
	
		//Cosa posso passare tra le () di un arrayList
		//1. niente -> crea una lista vuota
		//2. numero -> crea una lista con una capacità iniziale prestabilita
		//3. collezione -> passo una collezione preesistente
		
		List<String> regioni = new ArrayList<>(List.of("Piemonte", "Lombardia", "Campania", "Lazio", "Sicilia"));
		List<String> stati = new ArrayList<>(Arrays.asList("Italia", "Francia", "India", "Argentina", "Colombia", "Giappone"));
		
		//posso fondere le due collection
		regioni.addAll(stati);
		System.out.println(regioni);
		
	}
}
