package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class Dipendente {
	private String nome;
	private double stipendioBase;
	
	public Dipendente(String nome, double stipendioBase) {
		this.nome = nome;
		this.stipendioBase = stipendioBase;
	}
	
	public double calcolaStipendio() {
		return stipendioBase;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", stipendio =" + calcolaStipendio() + "]";
	}
	
	
}
