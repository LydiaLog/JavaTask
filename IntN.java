import java.util.Scanner;

public class IntN {
	public static void main(String[] args) {
		int n = 0;
	    int value, index = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �� ������ �Է��Ͻðڽ��ϱ�?: ");
		n = scan.nextInt();
		
		
		int[] num = new int[n];
		 
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(n + "���� ������ ���ʷ� �Է��Ͻÿ�: ");
			num[i] = scan.nextInt();
		}
		
		System.out.print("�� ��° ������ ����Ͻðڽ��ϱ�?: ");
		value = scan.nextInt();
		
		
		System.out.println("" + value + "��° �Է��� ������ " + num[value-1] + "�Դϴ�.");
		
		
		
	}

}
