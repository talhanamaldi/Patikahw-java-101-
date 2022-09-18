import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutu n : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Dizinin elemanlarını giriniz :");
		for(int i = 0; i < n; i++) {
			System.out.println((i+1)+". Elemanı : ");
			arr[i] = scan.nextInt();
		}
		
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sıralama : ");
        
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
		
	}

}
