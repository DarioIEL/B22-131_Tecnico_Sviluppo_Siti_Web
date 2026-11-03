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
		
		
		
		//gioco con i segmenti
		Punto A = new Punto(3,5);
		Punto B = new Punto(1,8);
		
		Segmento segm1 = new Segmento(A, B);
		segm1.calcolaLunghezza();
		System.out.println("La lunghezza del segmento vale: " + segm1.lunghezza);
		
		Punto C = new Punto(7,2);
		Punto D = new Punto(3,9);
		Segmento segm2 = new Segmento(C,D);
		System.out.println(segm2);
		
		//Voglio conoscere la x del puntoD
		System.out.println("La x del punto D vale " + segm2.puntoB.x);
		
		
		Segmento segm3 = new Segmento(new Punto(5,4), new Punto(0,0));
		System.out.println(segm3);
		//Voglio risalire alla y del puntoB
		System.out.println("La y del punto B si trova in " + segm3.puntoB.y);
		
		Punto E = new Punto(5,6);
		Punto F = new Punto(5,6);
		System.out.println(E.equals(F)); //Approfondimento su PassByValue e Pass By Reference
	}
}