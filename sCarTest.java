public class sCarTest {
       public static void main(String args[]) {
             sCar c1 = new sCar("S600", "white", 80); 	// 첫 번째 생성자 호출 
             sCar c2 = new sCar("E500", "blue", 20); 	// 두 번째 생성자 호출 
             int n = sCar.numbers;	// 정적 변수 호출
             System.out.println("지금까지 생성된 자동차 수 = " + n);
       }
}