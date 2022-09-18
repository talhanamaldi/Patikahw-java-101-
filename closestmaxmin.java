import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı : ");
        int number = scan.nextInt();
        
        Arrays.sort(list);
        
        int min = number;
        int max = number;
        
        
        for(int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                break;
            } 	
        }
        
        for(int i = list.length-1; i > 0; i--) {
            if (list[i] < min) {
                min = list[i];
                break;
            } 	
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
        scan.close();

	}

}
