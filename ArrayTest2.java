import java.util.Scanner;
 
public class ArrayTest2 {

   public static void main(String[] args) {
      final int STUDENTS = 5; //실행이 끝날때까지 STUDENTS의 값을 5로 유지
      int total = 0;
      Scanner scan = new Scanner(System.in);
 
      int[] scores = new int[STUDENTS]; //배열 선언


      for (int i = 0; i < scores.length; i++) {
          System.out.print("성적을 입력하시오:");
           scores[i] = scan.nextInt();
      }

      for (int i = 0; i < scores.length; i++)
           total += scores[i];
           System.out.println("평균 성적은" + total / STUDENTS + "입니다");
   }
}