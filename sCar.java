public class sCar {
       private String model;
       private String color;
       private int speed;
  
        // �ڵ����� �ø��� ��ȣ
       private int id;
       public static int numbers = 0; 	// ��������
 
       public sCar(String m, String c, int s) {	// ������
             model = m;
             color = c;
             speed = s;
              // �ڵ����� ������ �����ϰ� id�� �����Ѵ�. 
             id = ++numbers;
       }
}