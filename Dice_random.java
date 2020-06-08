package condition;

public class Dice_random {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		//0부터 1사이의 랜덤값 *6, +1해주고, 정수형으로 강제변환하면 주사위 랜덤값
		System.out.println(num);
		
		double dou = Math.random();
		System.out.println(dou);
	}
}
