//첫 번째 입력한 정수가 두 번째 입력한 수보다 작거나 같으면 true 그렇지 않으면 false를 출력하는 프로그램
import java.util.Scanner; //Scanner 클래스 포함

public class Add2_2 {
	//메인 메스드에서부터 실행이 시작된다.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x; // 첫 번째 숫자 저장
		int y; // 두 번째 숫자 저장
		
		System.out.print("첫 번째 숫자를 입력하시오: "); //입력 안내 출력
		x = input.nextInt();//사용자로부터 첫 번째 숫자를 읽는다.
		
		System.out.print("두 번째 숫자를 입력하시오: "); //입력 안내 출력
		y = input.nextInt();//사용자로부터 두 번째 숫자를 읽는다.
		
		if(x <= y) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}

}