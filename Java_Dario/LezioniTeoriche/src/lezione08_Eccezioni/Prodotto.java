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

	
	
}
