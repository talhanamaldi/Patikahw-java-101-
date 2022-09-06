import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayıyı giriniz : ");
		int k = scan.nextInt();
		
		double total = 1;
		
		for(int i = 2; i <= k; i++) {
			total += 1.0/i;
		}
		System.out.println(total);

	}

}
