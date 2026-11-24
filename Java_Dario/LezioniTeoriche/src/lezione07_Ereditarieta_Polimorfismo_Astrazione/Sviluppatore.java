package lezione07_Ereditarieta_Polimorfismo_Astrazione;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sviluppatore extends Dipendente {

	private String businessUnit;
	private List<String> linguaggiUtilizzati;
	
	public Sviluppatore(String nome, double stipendioBase, String bU, String...linguaggi) {
		super(nome, stipendioBase);
		linguaggiUtilizzati = new ArrayList<>(Arrays.asList(linguaggi));
		this.businessUnit = bU;
	}
	
	public void aggiungiLinguaggio(String linguaggio) {
		if(linguaggio != null && !linguaggio.isBlank() && !this.linguaggiUtilizzati.contains(linguaggio)) {	
			this.linguaggiUtilizzati.add(linguaggio);
		}
	}
	
	

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public List<String> getLinguaggiUtilizzati() {
		return linguaggiUtilizzati;
	}

	public void setLinguaggiUtilizzati(List<String> linguaggiUtilizzati) {
		this.linguaggiUtilizzati = linguaggiUtilizzati;
	}

	@Override
	public String toString() {
		return "Sviluppatore [businessUnit=" + businessUnit + ", linguaggiUtilizzati=" + linguaggiUtilizzati
				+ ", calcolaStipendio()=" + calcolaStipendio() +" toString()="
				+ super.toString() + "]";
	}


	public void sostieniColloquio() {
		System.out.println("Buongiorno, mi chiamo " + getNome() + " ecc ecc");
	}

	
	
	
}
