import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz : ");
		int k = scan.nextInt();
		int total = 0;
		while(k % 2 == 0) {
			
			if(k % 4 == 0) {
				total += k;
			} 
			
			System.out.println("Sayı giriniz : ");
			k = scan.nextInt();
		}
		System.out.println(total);

	}

}
