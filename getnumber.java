//���� ���ڿ��� �Է¹޾Ƽ� �ش� ������ ����ϴ� ���α׷�
import java.util.Scanner;

public class getnumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String day = in.next(); // ���ڿ�
	
		System.out.println(getDayNumber(day)); //string �ޱ�

	}
	
	//������ ���� ��������
	public static int getDayNumber(String day) { //���ο� �޼ҵ� �����
		int DayNumber; //������ ����
		switch (day) {
		case "Monday" : DayNumber = 1 ; break; // Monday�� �� 1  
		case "Tuesday" : DayNumber = 2 ; break;// Tuesday�� �� 2 
		case "wednesday" : DayNumber = 3 ; break;// wednesday�� �� 3
		case "Tursday" : DayNumber = 4 ; break;// Tursday�� �� 4  
		case "Friday" : DayNumber = 5 ; break;// Friday�� �� 5  
		case "Saturday" : DayNumber = 6 ; break;// Saturday�� �� 6  
		case "Sunday" : DayNumber = 7 ; break;// Sunday�� �� 7  
		default : DayNumber = 0; break; // �ƹ��͵� �ش��� ���� ���� ��� 0
		}
		return DayNumber;
	}

}
 