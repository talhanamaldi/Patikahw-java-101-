import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("N Sayısı : ");
		int n = scan.nextInt();;
		pattern(n);
	}
	
	static void pattern(int n) {
		System.out.print(n + " ");
		if(n <= 0) return;
		pattern(n-5);
		System.out.print(n+" ");

		
	}
	

}
