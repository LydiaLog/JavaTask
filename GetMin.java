public class GetMin {
    public static void main(String[] args) {

        int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 }; // ������ ������ �迭�� �ʱ�ȭ
        int minimum;

        minimum = s[0]; //minimum�� ���� s[0]

        for (int i = 1; i < s.length; i++) {
	 if (s[i] < minimum)
	     minimum = s[i]; //���� ������ ��, minimum�� s[i]
        }

        System.out.print("�ּҰ��� " + minimum);
    }
}