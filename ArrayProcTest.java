public class ArrayProcTest {
	final static int STUDENTS = 5; // final�� SSTUDENTS ���� 5�� ���� static�� ���� �޼ҵ�
  
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc(); 	// ��ü ����
		obj.getValues(scores); 		// scores�� �μ��� �ϴ� getValues ��ü ��� ȣ��
		System.out.println("����� = " + obj.getAverage(scores));
	}
}