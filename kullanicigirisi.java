import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName, passWord,control, newPassword ;
		Scanner input= new Scanner(System.in);
		System.out.print(" Kullancı Adınız : ");
		userName=input.nextLine( );
		System.out.print(" Şifreniz : ");
		passWord=input.nextLine();

		if (userName.equals("patika") && passWord.equals("java123") ){
		    System.out.println("Giriş Yaptınız !");

		    }
		    else{
		        System.out.println("Hatali sifre girdiniz yeni sifre belirtmek isterseniz evet , istemezseniz hayır yazınız.");
		        control=input.nextLine();

		        if( control.equals("hayır")){
		            System.out.println("giris sonlandirildi");}
		        
		        else if (control.equals("evet")) {
		            System.out.println("yeni sifrenizi yazin");
		            newPassword=input.nextLine();
		        
		            if( newPassword.equals("java")|| newPassword.equals(passWord)){
		                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
		            }
		            else{
		                System.out.println("Şifre oluşturuldu.");

		            }
		            
		        }
		        else{
		            System.out.println("Lütfen geçerli bir seçim yazınız.");

		        }

		    }
		}
}
