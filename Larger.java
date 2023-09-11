//3개 정수를 차례로 입력받아서 가장 큰 수를 출력하는 프로그램i
import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
	
	int x, y, z, max; //정수형 변수
		
		Scanner input = new Scanner(System.in); // 입력을 받기 위해 scanner함수 사용
		System.out.print("첫 번째 정수: "); //"첫 번째 정수: "출력
		x = input.nextInt(); // x입력받기
		
		System.out.print("두 번째 정수: ");//"두 번째 정수: "출력
		y = input.nextInt(); // y입력받기
		
		System.out.print("세 번째 정수: ");//"세 번째 정수: "출력
		z = input.nextInt(); // z입력받기
		
		if (x >= y && x >= z ) {
			max = x; //x가 제일 클 경우
		}else if (y >= x && y >= z ) {
			max = y; // y가 제일 클 경우
		}else {
			max = z; // 모두 다 아닌 경우(z가 제일 큼)
		}
	    System.out.println("큰 수는 " + max); // 결과 출력

	}

}
