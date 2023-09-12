public class sCar {
       private String model;
       private String color;
       private int speed;
  
        // 자동차의 시리얼 번호
       private int id;
       public static int numbers = 0; 	// 정적변수
 
       public sCar(String m, String c, int s) {	// 생성자
             model = m;
             color = c;
             speed = s;
              // 자동차의 개수를 증가하고 id에 대입한다. 
             id = ++numbers;
       }
}