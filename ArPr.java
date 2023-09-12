
public class ArPr {

	public static void main(String[] args) {
		int n [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		for(int i = 0; i< n.length; i++) {
			int[] nn = n[i];
			for(int j = 0; j < nn.length; j++){
				System.out.print(nn[j] + " ");
			}
			System.out.println( );
		}

	}

}
