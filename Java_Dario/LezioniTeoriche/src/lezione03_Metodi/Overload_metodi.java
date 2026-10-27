package lezione03_Metodi;

public class Overload_metodi {

	//Posso sovraccaricare i metodi, espandendo la firma
	
	public static void salutaRespo() {
		String nomeRespo = "Stefania Vipiana";
		System.out.println("Ciao " + nomeRespo);
	}

	public static void salutaRespo(String nome) {
		System.out.println("Ciao " + nome);
	}
	
	public static void salutaRespo(String nome, String cognome) {
		System.out.println("Ciao " + nome  + " " + cognome);
	}

//	public static void salutaRespo(String corso) {} Questo non posso farlo perché già esiste un metodo che accetta una sola stringa in ingresso
	
	public static void salutaRespo(String nome, int numCorsi) {
		System.out.println("Ciao " + nome + ". Ti sono stati assegnati " + numCorsi + " corsi");
	}
	
	public static void main(String[] args) {
		salutaRespo();
		salutaRespo("Benedetta");
		salutaRespo("Egle", "Risola");
		salutaRespo("Dario", 12);
	}
}
