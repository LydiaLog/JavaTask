// ����ڷκ��� ����(dh), ����(dv), ����(dd)�� ���̸� �Է��Ͽ� ������ü�� �Ѹ���(2*(dh*dv+dv*dd+dd*dh))�� ü��(dh*dv*dd)�� ����Ͽ� ����ϴ� ���α׷�
import java.util.*;

public class box {

	public static void main(String[] args) {
		int dh, dv, dd; // ����, ����, ����
		int rjx, cp; // �Ѹ���, ü��
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ü�� ������ ���̸� �Է��Ͻÿ�: ");
		dh = input.nextInt();
		System.out.print("������ü�� ������ ���̸� �Է��Ͻÿ�: ");
		dv = input.nextInt();
		System.out.print("������ü�� ������ ���̸� �Է��Ͻÿ�: ");
		dd = input.nextInt();
		
		rjx = 2*(dh*dv+dv*dd+dd*dh);
		cp = dh*dv*dd;
		
		System.out.println("���� ���� �� ������ ���̰� ���� " + dh+ ", " +  dv+", "  + dd + "�� ������ü�� �Ѹ����� " + rjx + "�̰� ü���� " + cp + "�Դϴ�.");
		

	}

}
