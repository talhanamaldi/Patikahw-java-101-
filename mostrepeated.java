public class Main {

	public static void main(String[] args) {
		int[] list = {4,7,4,4,2,9,10,2,1,33,9,1};

		int counter;
		for(int i = 0; i < list.length; i++) {
			counter = 0;
			if(list[i] % 2 == 0) {
				for(int j = 0; j < list.length; j++) {
					if(list[i] == list[j]) counter++;
				}
				if(counter > 1) System.out.print(list[i]+" ");
			}
		}
	}

}
