//����ڷκ��� �Ÿ�(m)�� �ҿ�ð��� ��, ��, �� 3�� ���� ���� ������ �����ϰ� �ʱ�ȭ�� ���� �ӵ��� 3���� ������ ����ϴ� ���α׷�
public class lastq {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		
	       long distance;  //distance�� ������ m
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
