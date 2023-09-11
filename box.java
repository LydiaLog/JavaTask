// 사용자로부터 가로(dh), 세로(dv), 높이(dd)의 길이를 입력하여 직육면체의 겉면적(2*(dh*dv+dv*dd+dd*dh))과 체적(dh*dv*dd)을 계산하여 출력하는 프로그램
import java.util.*;

public class box {

	public static void main(String[] args) {
		int dh, dv, dd; // 가로, 세로, 높이
		int rjx, cp; // 겉면적, 체적
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("직육면체의 가로의 길이를 입력하시오: ");
		dh = input.nextInt();
		System.out.print("직육면체의 세로의 길이를 입력하시오: ");
		dv = input.nextInt();
		System.out.print("직육면체의 높이의 길이를 입력하시오: ");
		dd = input.nextInt();
		
		rjx = 2*(dh*dv+dv*dd+dd*dh);
		cp = dh*dv*dd;
		
		System.out.println("가로 세로 및 높이의 길이가 각각 " + dh+ ", " +  dv+", "  + dd + "인 직육면체의 겉면적은 " + rjx + "이고 체적은 " + cp + "입니다.");
		

	}

}
