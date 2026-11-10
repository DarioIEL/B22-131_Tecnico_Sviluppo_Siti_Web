package lezione05_Classi;

public class TesterConto {
	public static void main(String[] args) {
		
		Persona cliente1 = new Persona("Laura", "Verdi", 25);
		ContoCorrente cc1 = new ContoCorrente(cliente1 , 5566.2, "Conto Giovani");
		
//		cc1.deposita(1000);
//		cc1.preleva(5000);
//		System.out.println(cc1.getInfoConto());
//		System.out.println(cliente1);
//		cliente1.verificaLegalità();
//		System.out.println(cc1.numConto);

		System.out.println("=====================");
		
		ContoCorrente cc2 = new ContoCorrente(new Persona("Marco", "Rossi", 35 ), 10000 , "Conto Invesimenti");
		
//		System.out.println(cc2);
//		System.out.println(cc2.proprietario);
//		cc2.proprietario.verificaLegalità();
		System.out.println(cc2);
	}
}
