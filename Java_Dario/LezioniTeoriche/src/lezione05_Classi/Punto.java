package lezione05_Classi;

//La classe definisce un tipo di dato complesso
public class Punto {

	//deinisco delle proprietà: STATO della CLASSE (insieme delle props)
	int x;
	int y;
	
	//definisco una terza coordinata
	int z;
	
	//Metodo costruttore, in questo caso dichiaro 2 metodi costruttori: uno a firma vuota ( metodo  di DEFAULT); uno a firma piena
	//OSS: il metodo di default si chiama così perché esiste anche senza dichiararlo -> Tutte le classi hanno un costruttore di default. Lo vado a specificare solo se, in presenza di un costruttore a firma piena, ho intenzione di utilizzarlo.
	public Punto() {}
	
	
	//Costruttore a firma piena
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//Come generare un costruttore: Alt + Shift + S -> Generate Constructor using Fields
	public Punto(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public String descrivi() {
		String descrizione = "";
		if( z != 0) {
			descrizione = "Punto coordinate: [x = " + x + " - y = " + y + " - z = "+ z +"]";
		}else {
			descrizione = "Punto coordinate: [x = " + x + " - y = " + y + "]";
		}
		return descrizione;
	}


	//Questo toString viene richiamato nel momento in cui richiamo l'oggetto in un Syso. Se non inserisco il toString() verrà stampato la reference alla memoria 
	@Override
	public String toString() {
		if(z!=0) {
			return "Punto [x=" + x + ", y=" + y + ", z=" + z + "]";
		}
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	

	
}
