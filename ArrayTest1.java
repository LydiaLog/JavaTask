public class ArrayTest1 {
    public static void main(String[] args) {
	int[] s = new int[10]; // 10의 크기, 초기값은 0
	for (int i = 0; i < s.length; i++) { //s.length는 s의 길이를 되돌려 줌
	    s[i] = i; // s[i]의 값 자체가 i
	}
	for (int i = 0; i < s.length; i++) {	    
		System.out.print(s[i] + " ");
	}
    }
}