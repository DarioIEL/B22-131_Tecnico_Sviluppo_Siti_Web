package lezione05_Classi;

public class TesterGeometria {
	public static void main(String[] args) {
		
		//Creo un nuovo Punto dichiarando un oggetto di tipo Punto
		
		Punto puntoA = new Punto(4, 3);
		//Leggo le proprietà di questo puntoA anche perché non ho nessun modificatore davanti alle dichiarazioni di x e y nella classe Punto
		System.out.println("Il punto A si trova nelle coordinate: x=" + puntoA.x + " y=" + puntoA.y);
		System.out.println(puntoA.descrivi());
		
		Punto puntoB = new Punto(5,9);
		System.out.println("Il punto B si trova nelle coordinate: x=" + puntoB.x + " y=" + puntoB.y);
		System.out.println(puntoB.descrivi());
		
		Punto puntoC = new Punto(12, 33);
		System.out.println(puntoC.descrivi());
		
		//Posso definire un oggetto anche attraverso il suo costruttore di default (a firma vuota)
		
		Punto puntoD = new Punto();
		puntoD.x = 6;
		puntoD.y = 8;
		System.out.println(puntoD.descrivi());
		
		Punto punto3D1 = new Punto(3, 5, 9);
		System.out.println(punto3D1.descrivi());
		System.out.println(punto3D1); //Questo in automatico richiama il toString()
		
		
	}
}
