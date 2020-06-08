package condition;

public class Game_369 {
	public static void main(String[] args) {
		/*±¸±¸´Ü
		int a = 0;
		
		for(int i = 1; i<=10; i++) {
			a = 2*i;
			System.out.println("2 * "+ i +" = " + a);
			*/
		
	
		System.out.println();
		for(int i = 1; i <= 40; i++) {
			
			if( (i%10)%3 == 0 && i%10 != 0) {
				System.out.print("Â¦"+" ");
			}
			else {
				System.out.print(i + " ");
			}
			if(i/30 == 1 && i%3 == 0 && i != 30) {
				System.out.print("Â¦" + " ");
			}
	
		}
		
		
	
	
	}
		
	}

