//사용자가 입력한 두 수를 비교하는 프로그램 (if문 이용)
import java.util.Scanner;

public class dlvd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  // 입력을 받기 위해 scanner함수 사용
		
		System.out.print("첫 번째 정수?: ");
		int x = input.nextInt(); // 정수형 변수 x 입력 받기
		
		System.out.print("두 번째 정수?: ");
		int y = input.nextInt(); // 정수형 변수 y 입력 받기
		
		if (x < y) {
			System.out.println(x + "는 " + y + "보다 " + (y-x) + " 작은 수 입니다.");

	}else{
		System.out.println(y + "는 " + x + "보다 " + (x-y) + " 큰 수 입니다.");
	}


	}

}
