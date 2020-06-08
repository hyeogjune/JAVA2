package condition;

public class Rock_Paper_Scissor {

	public static void main(String[] args) {
		
		
		int server = (int) (Math.random()*3); //0에서 2까지 값 랜덤
		int client = (int) (Math.random()*3);
		
		System.out.println("0은 가위, 1은 바위, 2는 보 이다.");
		System.out.println("컴퓨터 : " + server);
		System.out.println("나 : " + client);
		
		if(server == 0) {
			if(client == 1) {
				System.out.println("내가 이겼다");
			}
			else if(client == 2){
				System.out.println("컴퓨터가 이겼다.");
			}
			else {
				System.out.println("무승부");
			}
		}
		
		else if(server == 1) {
			if(client  == 0) {
				System.out.println("컴퓨터가 이겼다");
			}
			else if(client == 2) {
				System.out.println("내가 이겼다");
			}
			else {
				System.out.println("무승부");
			}
		}
		
		else {
			if(client  == 0) {
				System.out.println("내가 이겼다");
			}
			else if(client == 1) {
				System.out.println("컴퓨터가 이겼다");
			}
			else {
				System.out.println("무승부");
			}
		}
		
		
		
	}
	
}
