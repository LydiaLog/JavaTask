//사용자가 입력한 두 수를 비교하는 프로그램 (switch문 이용)
import java.util.Scanner;

public class swit03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // 입력을 받기 위해 scanner함수 사용
		
		System.out.print("첫 번째 정수?: ");
		int x = input.nextInt(); // 정수형 변수 x 입력 받기
		
		System.out.print("두 번째 정수?: ");
		int y = input.nextInt(); // 정수형 변수 y 입력 받기
		
		int com;
		
	
		if (x < y) {
			com = 0; // x가 작을 때 com = 0
		}else {
			com = 1; // x가 클 때 com = 1
		}
		
		
		switch(com) {
		case 0 :
			System.out.println(y + "는" + x + "보다 " + (y-x) + " 작은 수 입니다."); // com이 0일 때 출력
		    break;
		case 1 :
			System.out.println(x + "는 " + y + "보다 " + (x-y) + " 큰 수 입니다."); // com이 1일 때 출력
			break;
		}
		
		}
	

	}

