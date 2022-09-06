import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci sayı");
		int a = scan.nextInt();
		System.out.println("ikinci sayı");
		int b = scan.nextInt();
		System.out.println("üçüncü sayı");
		int c = scan.nextInt();
		
		if((a < b) && (a < c)) {
			if(b < c) System.out.println(a+"<"+b+"<"+c);
			else System.out.println(a+"<"+c+"<"+b);
		}
		
		if((b < a) && (b < c)) {
			if(a < c) System.out.println(b+"<"+a+"<"+c);
			else System.out.println(b+"<"+c+"<"+a);
		}
		
		if((c < b) && (c < a)) {
			if(b < a) System.out.println(c+"<"+b+"<"+a);
			else System.out.println(c+"<"+a+"<"+b);
		}
		
		
	}

}
