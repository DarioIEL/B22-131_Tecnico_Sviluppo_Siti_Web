package lezione07_Ereditarieta_Polimorfismo_Astrazione;

//Uso la keyword extends per ereditare da Dipendente
public class Manager extends Dipendente{

	private double bonus;
	
	//Sono obbligato ad implementare il metodo costruttore facendo riferimento al costruttore della superclasse
	public Manager(String nome, double stipendioBase, double bonus) {
		super(nome, stipendioBase);
		this.bonus = bonus;
	}

	//Riscrivo il metodo della superclasse. NON SONO OBBLIGATO
	@Override
	public double calcolaStipendio() {
		return super.calcolaStipendio() + bonus;
	}

	@Override
	public String toString() {
		return "Ruolo: Manager [nome: "+ getNome() + " stipendio =" + calcolaStipendio() + "]";
	}
	
	
}
