//while ���� �̿��� ������ ��� ���α׷�
import java.util.*; 

public class LoopExample2 {
   public static void main(String[] args) {
	   int n; 
	   int i = 1; // ���� i�� 1�� �ʱ�ȭ
	   System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");
	   Scanner scan = new Scanner(System.in); //scanner �Լ� 
	   n = scan.nextInt(); //n�Է¹ޱ�
	   while (i <= 9) {
		   System.out.println(n + "*"+ i + "=" + n * i);
		   i++; //i�� ��� �� ���� ��, ������ i��
	   }
		

	}

}
