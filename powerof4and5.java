import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i < n; i*=4) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 1; i < n; i*=5) {
			System.out.print(i+" ");
		}

	}

}
