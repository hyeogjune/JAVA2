package condition;

public class IfIf_Test {

	public static void main(String[] args) {
		//10의자리 1이면 내국인 2이면 외국인 , 1의자리가 1이면 남자 2이면 여자 3이면 미성년자, ctr+shift+f자동정렬
		int result = 22;
			
			if(result / 10 == 1) {
				System.out.print("내국인이며, ");
				if(result % 10 == 1) {
					System.out.println("남자이다.");
				}
				else if(result % 10 == 2) {
					System.out.println("여자이다.");
				}
				else if(result % 10 == 3) {
					System.out.println("미성년자이다");
				}
			}
			
			else if(result / 10 == 2) {
				System.out.print("외국인이며, ");
				if(result % 10 == 1) {
					System.out.println("남자이다.");
				}
				else if(result % 10 == 2) {
					System.out.println("여자이다.");
				}
				else if(result % 10 == 3) {
					System.out.println("미성년자이다");
				}
			}
			
			else {
				System.out.println("나도모른다");
			}
			
		
	}
}