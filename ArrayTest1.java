public class ArrayTest1 {
    public static void main(String[] args) {
	int[] s = new int[10]; // 10�� ũ��, �ʱⰪ�� 0
	for (int i = 0; i < s.length; i++) { //s.length�� s�� ���̸� �ǵ��� ��
	    s[i] = i; // s[i]�� �� ��ü�� i
	}
	for (int i = 0; i < s.length; i++) {	    
		System.out.print(s[i] + " ");
	}
    }
}