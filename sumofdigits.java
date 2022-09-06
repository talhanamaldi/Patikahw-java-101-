import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayıyı giriniz : ");
		int k = scan.nextInt();
		int a;
		int total = 0;
		while(k > 0) {
			a = k % 10;
			total += a;
			
			k /=10;
			
		}
		System.out.println("Basamakların toplamı = "+total);

	}

}
