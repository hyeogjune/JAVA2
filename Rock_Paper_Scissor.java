package condition;

public class Rock_Paper_Scissor {

	public static void main(String[] args) {
		
		
		int server = (int) (Math.random()*3); //0���� 2���� �� ����
		int client = (int) (Math.random()*3);
		
		System.out.println("0�� ����, 1�� ����, 2�� �� �̴�.");
		System.out.println("��ǻ�� : " + server);
		System.out.println("�� : " + client);
		
		if(server == 0) {
			if(client == 1) {
				System.out.println("���� �̰��");
			}
			else if(client == 2){
				System.out.println("��ǻ�Ͱ� �̰��.");
			}
			else {
				System.out.println("���º�");
			}
		}
		
		else if(server == 1) {
			if(client  == 0) {
				System.out.println("��ǻ�Ͱ� �̰��");
			}
			else if(client == 2) {
				System.out.println("���� �̰��");
			}
			else {
				System.out.println("���º�");
			}
		}
		
		else {
			if(client  == 0) {
				System.out.println("���� �̰��");
			}
			else if(client == 1) {
				System.out.println("��ǻ�Ͱ� �̰��");
			}
			else {
				System.out.println("���º�");
			}
		}
		
		
		
	}
	
}
