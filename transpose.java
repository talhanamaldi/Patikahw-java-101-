public class Main {

	public static void main(String[] args) {
		int A[][] = {{1,2,3},{4,5,6}};
		
		int At[][] = new int[A[0].length][A.length];
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[0].length; j++) {
				At[j][i] = A[i][j];
			}
		}
		
		for(int i = 0; i < At.length; i++) {
			for(int j = 0; j < At[0].length; j++) {
				System.out.print(At[i][j]+" ");
			}
			System.out.println();
		}
	}

}
