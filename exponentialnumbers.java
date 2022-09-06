import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayıyı giriniz : ");
		int n = scan.nextInt();
		
		System.out.println("Üstü giriniz : ");
		int k = scan.nextInt();
		
		int answer = n;
		
		for(int i = 1; i < k; i++) {
			answer *=n;
		}
		System.out.println(answer);
	}

}
