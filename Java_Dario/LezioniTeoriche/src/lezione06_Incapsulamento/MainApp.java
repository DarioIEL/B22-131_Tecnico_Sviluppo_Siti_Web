package lezione06_Incapsulamento;

import java.util.Scanner;

import javax.swing.plaf.ComponentInputMapUIResource;

public class MainApp {

	public static void main(String[] args) {
		
		//Creo un utente
		
		Utente utente1 = new Utente("Pippo", "Rossi", "pippo.rossi@email.com", 25, "12345678");
		
//		System.out.println(utente1.nome); Non posso leggere il nome dell'utente
//		utente1.nome = "Anna"; Non posso scrivere la prop
		
		System.out.println(utente1.getNome()); //qui leggo
		utente1.setNome("Anna"); //qui scrivo, modifico il nome utente
		
		System.out.println(utente1.getNome());
		
		try {
			utente1.setEta(140);
		}catch (IllegalArgumentException e){
			System.out.println("Errore: " + e.getMessage());
		}
	
		Admin admin1 = new Admin("Pippo90", "Super Admin");
		admin1.tipologia = "Admin Base";
		
		///Nuovo Utente u2
		Scanner scan = new Scanner(System.in);
		System.out.println("Ciao Utente, inserisci la tua pass:");
		String pass = scan.nextLine();
		
		Utente u2 = new Utente("Bono", "Vox", "bonovox@mail.com", 65, pass);
		
		System.out.println(u2);

		System.out.println("---- Verifica Password ----");
		String[] tentativi = {"segreta12", "Segreta123", "segreta123", ""};
		
		for(String t: tentativi) {
			boolean ok = u2.verificaPassword(t);
			System.out.println("Tentativo \"" + t + "\" -> " + (ok ? "ACCESSO CONSENTITO": "ACCESSO NEGATO") );
			
		}
	
		
		///Nuovo Utente con Login Simulato
		System.out.println("--- Login con 3 tentativi ---");
		String inputUtente[] = {"password1", "pipporossi12", "segreta1234"};
		final int MAX_Tentativi = 3;
		boolean autenticato = false;
		
		for(int i = 0; i < MAX_Tentativi && !autenticato; i++) {
			autenticato = u2.verificaPassword(inputUtente[i]);
			if(autenticato) {
				System.out.println("Login avvenuto al tentativo " + (i + 1));
			}else {
				System.out.println("Password ERRATA (" + (MAX_Tentativi - i -1) + " tentativi restanti");
			}
		}
		
		if(!autenticato) {
			u2.disattiva();
			System.out.println("Account disattivato per troppi tentativi: Attivo ? " + u2.isAttivo());
		}
		
	}
}
