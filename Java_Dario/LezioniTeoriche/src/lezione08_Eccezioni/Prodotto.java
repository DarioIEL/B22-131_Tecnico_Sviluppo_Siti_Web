package lezione08_Eccezioni;

public class Prodotto {

	private String name;
	private double price;
	private int amount;
	
	public Prodotto(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	

	public String getName() {return name;}

	public double getPrice() {return price;}

	public int getAmount() {return amount;}

	//Trasforma il prodottto in una riga CSV
	public String toCSV() {
		return name + ";" + price + ";" + amount;
	}

	
	//METODO FACTORY STATIC -> return Oggetto
	//In questo caso ho bisogno di una fabbrica di oggetti al posto del costruttore.
	//mi deve restituire un Prodotto che ancora non esiste.
	//Mi serve un metodo fromCSV che legge la singola riga del file e lo trasforma in un Prodotto
	public static Prodotto fromCSV(String riga) {
		
		String[] campi = riga.split(";");
		
		if(campi.length != 3) {
			throw new IllegalArgumentException("Attesi 3 campi. Trovati: " + campi.length);
		}
		
		String name = campi[0];
		double price = Double.parseDouble(campi[1]);
		int amount = Integer.parseInt(campi[2]);
		
		return new Prodotto(name, price, amount);
	}
	
	
	@Override
	public String toString() {
		return "Prodotto [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}
	
	
}
