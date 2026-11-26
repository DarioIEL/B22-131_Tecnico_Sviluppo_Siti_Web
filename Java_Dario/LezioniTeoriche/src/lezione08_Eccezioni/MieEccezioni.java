package lezione08_Eccezioni;

import java.io.PrintWriter;

//Costruisco un'eccezione personalizzata. In questo caso faccio l'override dei metodi di Throwable
public class MieEccezioni extends Throwable{

	@Override
	public String getMessage() {
		return "Attenzione il tuo testo non è valido";
	}

	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}
	
	
	
}
