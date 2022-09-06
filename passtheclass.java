import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int math, phy, tur, chem, mus;
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Matematik Notu");
        math = scan.nextInt();
        System.out.println("Fizik Notu");
        phy = scan.nextInt();
        System.out.println("Turkce Notu");
        tur = scan.nextInt();
        System.out.println("Kimya Notu");
        chem = scan.nextInt();
        System.out.println("Muzik Notu");
        mus = scan.nextInt();
        
        int total = 0;
        int divider = 0;
        if(math >= 0 && math <= 100) {
        	total += math;
        	divider++;
        }
        if(phy >= 0 && phy <= 100) {
        	total += phy;
        	divider++;
        }
        if(tur >= 0 && tur <= 100) {
        	total += tur;
        	divider++;
        }
        if(chem >= 0 && chem <= 100) {
        	total += chem;
        	divider++;
        }
        if(mus >= 0 && mus <= 100) {
        	total += mus;
        	divider++;
        }
        
        double avarage = (total)*1.0/divider;
        
        if(avarage > 55) System.out.println("Sınıfı geçtiniz");
        else System.out.println("Sınıfta kaldınız");
        
        
        
        
        
        
	}

}
