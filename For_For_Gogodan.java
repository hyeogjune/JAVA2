package condition;

public class For_For_Gogodan {

	public static void main(String[] args) {
		
	for(int i=1; i<10; i++) {
		for(int j=2; j<10; j++) {
			
			if(j-1 == i) {
				System.out.print("         ");
			}
			else {
			System.out.print(j + " * " + i + " = " + i*j + " ");
			}
		}
		System.out.println("");
	}	
	


	}
}	
