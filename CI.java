//정확한 월을 입력하는 프로그램
import java.util.Scanner;

public class CI {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int month; //정수 
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = input.nextInt();
		} while (month < 1 || month > 12);// ||은 or
	System.out.println("사용자가 입력한 월은 " + month);
    }
}
