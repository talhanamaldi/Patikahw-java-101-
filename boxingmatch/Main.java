package boxingmatch;
import java.util.Random;
public class Main {
	
    public static void main(String[] args) {    	
    	
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 100, 100, 0);
        
        Random rand = new Random();
        int random = rand.nextInt(20);
        Ring r;
        if(random % 2 == 0) r = new Ring(alex,marc , 90 , 100);
        else r = new Ring(marc,alex , 90 , 100);
        r.run();
      }

}
