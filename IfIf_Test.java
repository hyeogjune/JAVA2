package condition;

public class IfIf_Test {

	public static void main(String[] args) {
		//10���ڸ� 1�̸� ������ 2�̸� �ܱ��� , 1���ڸ��� 1�̸� ���� 2�̸� ���� 3�̸� �̼�����, ctr+shift+f�ڵ�����
		int result = 22;
			
			if(result / 10 == 1) {
				System.out.print("�������̸�, ");
				if(result % 10 == 1) {
					System.out.println("�����̴�.");
				}
				else if(result % 10 == 2) {
					System.out.println("�����̴�.");
				}
				else if(result % 10 == 3) {
					System.out.println("�̼������̴�");
				}
			}
			
			else if(result / 10 == 2) {
				System.out.print("�ܱ����̸�, ");
				if(result % 10 == 1) {
					System.out.println("�����̴�.");
				}
				else if(result % 10 == 2) {
					System.out.println("�����̴�.");
				}
				else if(result % 10 == 3) {
					System.out.println("�̼������̴�");
				}
			}
			
			else {
				System.out.println("�����𸥴�");
			}
			
		
	}
}