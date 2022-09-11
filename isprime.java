import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı Giriniz : ");
		int n = scan.nextInt();
        if (isprime(n, 2))
            System.out.println(n+" sayısı ASALDIR !");
        else
            System.out.println(n+" sayısı ASAL değildir !");
	}
	
	static boolean isprime(int n, int i) {
		if(n <= 2) {
			if(n == 2)return true;
			else return false;
		}
		
		if(n % i == 0) return false;
        if(i * i > n) return true;
		
		
        return isprime(n, i + 1);
		
	}

}
