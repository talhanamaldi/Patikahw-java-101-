import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayıyı giriniz : ");
		System.out.println(isPolindrom(scan.nextInt()));

	}
	
	public static String isPolindrom(int x) {
		String s = String.valueOf(x);
		int counter = 0;
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) == s.charAt(s.length()-(i+1))) {
				counter++;
			}
		}
		if(counter == s.length()/2) return "Polindrom sayı";
		else return "Polindron sayı değil";
	}
}
