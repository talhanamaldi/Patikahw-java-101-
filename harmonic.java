public class Main {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for(int i:numbers){
            sum+=1/i;
        }
        
        double average= numbers.length*1.0/sum;

        System.out.println(average);

	}

}
