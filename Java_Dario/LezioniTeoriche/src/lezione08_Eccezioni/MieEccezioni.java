package lezione08_Eccezioni;

//Costruisco un'eccezione personalizzata. In questo caso faccio l'override dei metodi di Throwable
public class MieEccezioni extends Throwable{

	@Override
	public String getMessage() {
		return "Attenzione il tuo testo non è valido";
	}
	
}
