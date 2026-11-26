package lezione08_Eccezioni;

public class ArithmeticExceptionMain {
	public static void main(String[] args) {
		
		double x = 10;
		double y = 0;
		
		double r = 0.0;

		//In questo caso gestisco attraverso il blocco Try&Catch. Questi blocchi mi permettono di controllare l'eccezione che si genera all'esecuzione del codice, quindi evitano che si blocchi il codice
		
		try {
			//prova a svolgere il codice
			r = x/y;
			System.out.println(r);
		}catch (ArithmeticException e){
			//questo viene eseguito se viene genrata un'eccezione
			System.out.println(e.getMessage());
			System.out.println("Non puoi dividere per 0");
		}finally {
			//questo viene sempre eseguito
			System.out.println("Questa riga verrà sempre eseguita");
		}
		
			
		System.out.println("IL codice non si è bloccato");
		
		//Vediamo un'altra eccezione
		int[] numeriArr = new int[3];
		
		//try & catch con shortcut Alt + Shift + Z
		try {
			
			
			
			numeriArr[0] = 2;
			numeriArr[1] = 6;
			numeriArr[2] = 42;			
			numeriArr[3] = 10;  //fuori dall'array ed entra nel catch. Gli altri valori sono assegnati
			System.out.println(numeriArr[3]);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Stai sfondando l'array");
		}
		finally {
			System.out.println(numeriArr[0]);
		}
		
	}
}
