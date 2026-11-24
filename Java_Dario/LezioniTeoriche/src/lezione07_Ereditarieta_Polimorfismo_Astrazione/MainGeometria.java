package lezione07_Ereditarieta_Polimorfismo_Astrazione;

public class MainGeometria {

	public static void main(String[] args) {
		
		Rettangolo rett1 = new Rettangolo("verde", 5, 8);
		System.out.println("Area Rettangolo: " + rett1.calcolaArea());
		System.out.println("Perimetro Rettangolo: " + rett1.calcolaPerimetro());
		System.out.println(rett1.descrivi()); //Questo descrivi() è il metodo concreto che esiste dentro FormaGeometrica
		
		Cerchio cerc1 = new Cerchio("Blu", 6.2);
		System.out.println(cerc1.descrivi());
		
		//FormaGeometrica fG1 = new FormaGeometrica(); //NON POSSO ISTANZIARE UNA CLASS ABSTRACT
		
		//UPCASTING: assegno un oggetto di una sottoclasse ad una variabile di tipo superclass
		FormaGeometrica fG1 = new Cerchio("Rosso", 4);
		System.out.println(fG1.descrivi());
		FormaGeometrica fG2 = new Rettangolo("Viola", 3, 7);
	//  tipo Statico (riferimento)  tipo dinamico(oggetto in memoria)
		System.out.println(fG2.descrivi());
		fG2.calcolaArea(); //versione del metodo del rettangolo
		
		//Ipotetica utilità - avere una collezione di forme geometriche diverse tra loro ma tutte di tipo FormaGeometrica
		FormaGeometrica forme[] = {
				new Cerchio("Rosso", 8),
				cerc1,
				rett1,
				fG1,
				new TriangoloEquilatero("Giallo", 4, "Equilatero")
		};
		
		
		for(int i = 0; i < forme.length; i++) {
			System.out.println(forme[i].descrivi());
		}
	}

}
