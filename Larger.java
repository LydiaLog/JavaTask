//3�� ������ ���ʷ� �Է¹޾Ƽ� ���� ū ���� ����ϴ� ���α׷�i
import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
	
	int x, y, z, max; //������ ����
		
		Scanner input = new Scanner(System.in); // �Է��� �ޱ� ���� scanner�Լ� ���
		System.out.print("ù ��° ����: "); //"ù ��° ����: "���
		x = input.nextInt(); // x�Է¹ޱ�
		
		System.out.print("�� ��° ����: ");//"�� ��° ����: "���
		y = input.nextInt(); // y�Է¹ޱ�
		
		System.out.print("�� ��° ����: ");//"�� ��° ����: "���
		z = input.nextInt(); // z�Է¹ޱ�
		
		if (x >= y && x >= z ) {
			max = x; //x�� ���� Ŭ ���
		}else if (y >= x && y >= z ) {
			max = y; // y�� ���� Ŭ ���
		}else {
			max = z; // ��� �� �ƴ� ���(z�� ���� ŭ)
		}
	    System.out.println("ū ���� " + max); // ��� ���

	}

}
