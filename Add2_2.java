//ù ��° �Է��� ������ �� ��° �Է��� ������ �۰ų� ������ true �׷��� ������ false�� ����ϴ� ���α׷�
import java.util.Scanner; //Scanner Ŭ���� ����

public class Add2_2 {
	//���� �޽��忡������ ������ ���۵ȴ�.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x; // ù ��° ���� ����
		int y; // �� ��° ���� ����
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�: "); //�Է� �ȳ� ���
		x = input.nextInt();//����ڷκ��� ù ��° ���ڸ� �д´�.
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�: "); //�Է� �ȳ� ���
		y = input.nextInt();//����ڷκ��� �� ��° ���ڸ� �д´�.
		
		if(x <= y) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}

}