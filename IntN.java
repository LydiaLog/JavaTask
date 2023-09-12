import java.util.Scanner;

public class IntN {
	public static void main(String[] args) {
		int n = 0;
	    int value, index = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 개 정수를 입력하시겠습니까?: ");
		n = scan.nextInt();
		
		
		int[] num = new int[n];
		 
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(n + "개의 정수를 차례로 입력하시오: ");
			num[i] = scan.nextInt();
		}
		
		System.out.print("몇 번째 정수를 출력하시겠습니까?: ");
		value = scan.nextInt();
		
		
		System.out.println("" + value + "번째 입력한 정수는 " + num[value-1] + "입니다.");
		
		
		
	}

}
