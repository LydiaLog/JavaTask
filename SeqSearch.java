import java.util.Scanner;

public class SeqSearch {
   public static void main(String[] args) {
      int s[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // 정수 배열 생성 (초기화)
      int value, index = -1; //초기화
      Scanner scan = new Scanner(System.in);
      System.out.print("탐색할 값을 입력하시오: ");
      value = scan.nextInt();

      for (int i = 0; i < s.length; i++) {
	if (s[i] == value)
	   index = i; //위의 조건이 때, index는 i
	}

      if (index < s.length && index >= 0)
	System.out.println("" + value + "값은 " + index + "위치에 있습니다.");
   }
}