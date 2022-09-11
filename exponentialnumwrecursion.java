import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban : ");
		int base = scan.nextInt();
		System.out.print("Üs : ");
		int power = scan.nextInt();
		
		System.out.println(exponential(base, power));

	}
	
	public static int exponential(int n, int m) {
		if(m == 0) return 1;
		if(m == 1) return n;
		else return n*exponential(n, m-1);
	}
	

}
