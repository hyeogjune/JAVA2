package condition;

public class Dice_random {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		//0���� 1������ ������ *6, +1���ְ�, ���������� ������ȯ�ϸ� �ֻ��� ������
		System.out.println(num);
		
		double dou = Math.random();
		System.out.println(dou);
	}
}
