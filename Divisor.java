//양의 정수를 입력받고 그 수의 약수를 모두 출력하는 프로그램
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int n = scan.nextInt();
		
		System.out.println(n + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= n; ++i) { // i값 증가 후 사용 즉, 증가된 i값 (조건식은 입력받은 n에 따라 달라짐)
			System.out.println("i ="+i);
			if (n % i == 0) // n을 i로 나눌 때 나머지값이 0이면
				System.out.print(" " + i);
		}
			

	}

}
