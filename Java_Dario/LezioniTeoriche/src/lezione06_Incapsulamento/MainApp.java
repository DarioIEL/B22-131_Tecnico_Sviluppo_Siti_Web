package lezione06_Incapsulamento;

public class MainApp {

	public static void main(String[] args) {
		
		//Creo un utente
		
		Utente utente1 = new Utente("Pippo", "Rossi", "pippo.rossi@email.com", 25);
		
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
		
		
	}
}
