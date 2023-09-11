//요일 문자열을 입력받아서 해당 정수를 출력하는 프로그램
import java.util.Scanner;

public class getnumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("요일을 입력하세요: ");
		String day = in.next(); // 문자열
	
		System.out.println(getDayNumber(day)); //string 받기

	}
	
	//요일의 숫자 가져오기
	public static int getDayNumber(String day) { //새로운 메소드 만들기
		int DayNumber; //정수형 변수
		switch (day) {
		case "Monday" : DayNumber = 1 ; break; // Monday일 때 1  
		case "Tuesday" : DayNumber = 2 ; break;// Tuesday일 때 2 
		case "wednesday" : DayNumber = 3 ; break;// wednesday일 때 3
		case "Tursday" : DayNumber = 4 ; break;// Tursday일 때 4  
		case "Friday" : DayNumber = 5 ; break;// Friday일 때 5  
		case "Saturday" : DayNumber = 6 ; break;// Saturday일 때 6  
		case "Sunday" : DayNumber = 7 ; break;// Sunday일 때 7  
		default : DayNumber = 0; break; // 아무것도 해당이 되지 않을 경우 0
		}
		return DayNumber;
	}

}
 