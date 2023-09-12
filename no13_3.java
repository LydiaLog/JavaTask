//값을 입력받아 무한소수 e를 구하는 프로그램
import java.util.Scanner;

public class no13_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n을 입력: ");
        int n = scanner.nextInt(); //정수형 n 읽기

        double e = Math.pow(1+(double)1/n, n); // 실수형 e 계산

        System.out.println("n= " + n + " e= " + e);
    }
}