package condition;

public class If_test {

		public static void main(String[] args) {
			
			float x = 10.0f; int y = 20;
			
			if(x%2 == 0) {
				System.out.println("x�� ¦����.");
			}
			else {
				System.out.println("x�� Ȧ����.");
			}
			
			if(x == 10) {
				System.out.println(x + "�� 10�̴�");
			}
			else if(x == 11) {
				System.out.println(x + "�� 11�̴�");
			}
			else if(x == 12) {
				System.out.println(x + "�� 12�̴�");
			}
			else {
				System.out.println(x + "�� ���� �𸥴�");
			}

			
		}
	
}
