public class Car {
       private String model;
       private String color;
       private int speed;
  
       private int id;
       private static int numbers = 0;			// 정적변수
 
       public Car(String m, String c, int s) {		// 생성자
             model = m;
             color = c;
             speed = s;
              // 자동차의 개수를 증가하고 id에 대입한다. 
             id = ++numbers;
       }

       public static int getNumberOfCars() {	// 정적 메소드
             return numbers; // OK!
       }
}
