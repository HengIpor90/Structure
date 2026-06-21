package random_number;

import java.util.Random;

public class RandomNumber {
    public void generateRandomNumber() {
        Random random = new Random();
        // double n1 = random.nextDouble(1,109);
        boolean isHead = random.nextBoolean();
        // System.out.println(n1);
        if(isHead){
            System.out.println("Heades");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
