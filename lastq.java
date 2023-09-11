//사용자로부터 거리(m)와 소요시간을 시, 분, 초 3개 값에 대한 변수를 정의하고 초기화한 다음 속도를 3가지 단위로 출력하는 프로그램
public class lastq {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		
	       long distance;  //distance의 단위는 m
	       distance = 2500;
	       
	       long hour;
	       hour = 5;
	       
		   long sec;
		   sec = 10;
		   
		   long ms = distance/sec;
		   double kmh = distance*0.001/hour;
		   double kms = distance*0.001/sec;
		   
	       System.out.println("Your speed in  meters/second is " + ms + ".");
	       System.out.println("Your speed in  km/h  is " + kmh + ".");
	       System.out.println("Your speed in km/s is " + kms +".");
		   
	}

}
