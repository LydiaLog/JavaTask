public class BoxTest {
	public static void main(String args[]) {
		Box obj1 = new Box(10, 20, 50);		// obj1 ��ü, ��
		Box obj2 = new Box(10, 30, 30);		// obj2 ��ü, ��
  
		Box largest = obj1.whosLargest(obj1, obj2);	// largest�� obj1�� ���� ��ü ����
		System.out.println("(" + largest.width + "," + largest.length + ","
				+ largest.height + ")");
	}
}