import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayı : ");
		int n1 = scan.nextInt();
		System.out.println("İkinci sayı : ");
		int n2 = scan.nextInt();
		int ebob = 0;
		
		int counter = 1;
		while(counter <= Math.max(n1, n2)) {
			if(n1 % counter == 0) {
			if(n2 % counter == 0) ebob = counter;
			}
			counter++;
		}
		int ekok = (n1*n2)/ebob;
		System.out.println("Sayıların ebobu = "+ebob+"\nSayıların ekoku = "+ekok);	
	}
}
