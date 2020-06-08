package condition;

public class If_test {

		public static void main(String[] args) {
			
			float x = 10.0f; int y = 20;
			
			if(x%2 == 0) {
				System.out.println("x는 짝수다.");
			}
			else {
				System.out.println("x는 홀수다.");
			}
			
			if(x == 10) {
				System.out.println(x + "는 10이다");
			}
			else if(x == 11) {
				System.out.println(x + "는 11이다");
			}
			else if(x == 12) {
				System.out.println(x + "는 12이다");
			}
			else {
				System.out.println(x + "는 나도 모른다");
			}

			
		}
	
}
