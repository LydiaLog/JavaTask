//����ڰ� �Է��� �� ���� ���ϴ� ���α׷� (if�� �̿�)
import java.util.Scanner;

public class dlvd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  // �Է��� �ޱ� ���� scanner�Լ� ���
		
		System.out.print("ù ��° ����?: ");
		int x = input.nextInt(); // ������ ���� x �Է� �ޱ�
		
		System.out.print("�� ��° ����?: ");
		int y = input.nextInt(); // ������ ���� y �Է� �ޱ�
		
		if (x < y) {
			System.out.println(x + "�� " + y + "���� " + (y-x) + " ���� �� �Դϴ�.");

	}else{
		System.out.println(y + "�� " + x + "���� " + (x-y) + " ū �� �Դϴ�.");
	}


	}

}
