import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("Sayı Giriniz : ");
		int k = scan.nextInt();
		
		int total = 0;
		
		int counter = 0;
		
		for(int i = 1; i <= k; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				total += i;
				counter++;
			}
			}
			
		
		
		System.out.println((total*1.0)/counter);
		
		
		scan.close();
		

	}

}
