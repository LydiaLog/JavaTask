//����ڰ� �Է��� �� ���� ���ϴ� ���α׷� (switch�� �̿�)
import java.util.Scanner;

public class swit03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // �Է��� �ޱ� ���� scanner�Լ� ���
		
		System.out.print("ù ��° ����?: ");
		int x = input.nextInt(); // ������ ���� x �Է� �ޱ�
		
		System.out.print("�� ��° ����?: ");
		int y = input.nextInt(); // ������ ���� y �Է� �ޱ�
		
		int com;
		
	
		if (x < y) {
			com = 0; // x�� ���� �� com = 0
		}else {
			com = 1; // x�� Ŭ �� com = 1
		}
		
		
		switch(com) {
		case 0 :
			System.out.println(y + "��" + x + "���� " + (y-x) + " ���� �� �Դϴ�."); // com�� 0�� �� ���
		    break;
		case 1 :
			System.out.println(x + "�� " + y + "���� " + (x-y) + " ū �� �Դϴ�."); // com�� 1�� �� ���
			break;
		}
		
		}
	

	}

