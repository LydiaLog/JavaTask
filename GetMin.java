public class GetMin {
    public static void main(String[] args) {

        int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 }; // 정수를 포함한 배열의 초기화
        int minimum;

        minimum = s[0]; //minimum의 값은 s[0]

        for (int i = 1; i < s.length; i++) {
	 if (s[i] < minimum)
	     minimum = s[i]; //위의 조건일 때, minimum은 s[i]
        }

        System.out.print("최소값은 " + minimum);
    }
}