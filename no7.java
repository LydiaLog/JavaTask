//중첩 반복문을 이용해 계단식으로 숫자를 출력하는 프로그램
public class no7 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) { // j는 i값에 따라 달라짐
				System.out.print(j); // j를 프린트해야 입력값에 따라 삼각형 숫자 결정
			}
			System.out.println();
		}

	}

}
