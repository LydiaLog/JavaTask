import java.util.Scanner;

public class SeqSearch {
   public static void main(String[] args) {
      int s[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // ���� �迭 ���� (�ʱ�ȭ)
      int value, index = -1; //�ʱ�ȭ
      Scanner scan = new Scanner(System.in);
      System.out.print("Ž���� ���� �Է��Ͻÿ�: ");
      value = scan.nextInt();

      for (int i = 0; i < s.length; i++) {
	if (s[i] == value)
	   index = i; //���� ������ ��, index�� i
	}

      if (index < s.length && index >= 0)
	System.out.println("" + value + "���� " + index + "��ġ�� �ֽ��ϴ�.");
   }
}