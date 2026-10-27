package giochi_premi;

public class Multipli {

	public static void calcola(){
		
		for(int i = 1; i <= 100; i++) {
			String res = i + "";
			if(i % 3 == 0 && (i % 5 == 0)) {
				res += " Zoom Boom";
			}else if(i % 3 == 0) {
				res += " Zoom";
			}else if(i % 5 == 0) {
				res += " Boom";
			}
			System.out.println(res);
		}
	}
}
