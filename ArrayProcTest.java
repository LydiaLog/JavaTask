public class ArrayProcTest {
	final static int STUDENTS = 5; // final로 SSTUDENTS 값을 5로 지정 static은 정적 메소드
  
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc(); 	// 객체 생성
		obj.getValues(scores); 		// scores를 인수로 하는 getValues 객체 멤버 호출
		System.out.println("평균은 = " + obj.getAverage(scores));
	}
}