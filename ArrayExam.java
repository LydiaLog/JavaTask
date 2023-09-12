public class ArrayExam {
    public int sum(int[] param) {
        int[] array = param;
        int sum = 0;
  
        for (int i = 0; i < array.length; i++){
            sum = sum +array[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int[]TestCase = new int[4];
        String str = "";
        int rightResult = 0;
        for(int i=0; i<4; i++){
            TestCase[i] = (int)(Math.random()*100);
            rightResult += TestCase[i];
            str+=(TestCase[i]+",");
        }
        str=str.substring(0,str.length()-1);

        ArrayExam exam = new ArrayExam();
        int Answer = exam.sum(TestCase);

        if (Answer==rightResult) {
            System.out.println("정답입니다. [제출]을 누르세요.");
        }
        else{
            System.out.println( str+"를 더한 sum의 값이 틀립니다.");
        }
    }
}