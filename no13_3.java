//���� �Է¹޾� ���ѼҼ� e�� ���ϴ� ���α׷�
import java.util.Scanner;

public class no13_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n�� �Է�: ");
        int n = scanner.nextInt(); //������ n �б�

        double e = Math.pow(1+(double)1/n, n); // �Ǽ��� e ���

        System.out.println("n= " + n + " e= " + e);
    }
}