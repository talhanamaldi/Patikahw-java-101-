import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int distance, age, type;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafeyi km türünden giriniz :");
		distance = scan.nextInt();
		System.out.println("Yaşınızı giriniz :");
		age = scan.nextInt();
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
		type = scan.nextInt();
		
		if(distance < 0 || age < 0 || type<=0 || type >2) {
			System.out.println("Hatalı Veri Girdiniz ! ");
			System.exit(0);
		}
		 
		double normalamount = distance*0.1;
		
		double agediscount = 0;
		
		if(age < 12) agediscount = normalamount * 0.5;
		else if(age > 12 && age < 24) agediscount = normalamount * 0.1;
		else if(age > 65) agediscount = normalamount * 0.3;
		
		double discountamount = normalamount - agediscount;
		
		double roundtripdiscount = 0;
		
		double total = 0;
		
		if(type == 2) {
			roundtripdiscount = discountamount*0.2;
			total = (discountamount - roundtripdiscount)*2;
		}else {
			total = discountamount;
		}
		System.out.println("Toplam Tutar = "+total);

	}

}
