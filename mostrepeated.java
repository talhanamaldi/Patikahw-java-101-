public class Main {

	public static void main(String[] args) {
		int[] list = {4,7,4,4,2,9,10,2,1,33,9,1};
		
		int number = 0;
		int counter;
		for(int i = 0; i < list.length; i++) {
			counter = 0;
			if(list[i] % 2 == 0) {
				number = list[i];
				for(int j = 0; j < list.length; j++) {
					if(number == list[j]) counter++;
				}
				if(counter > 1) System.out.print(list[i]+" ");
			}
		}
	}

}
