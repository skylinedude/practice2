import java.util.Random;
public class SimpleJava{
    public static void main(String[] args) {
         Random random = new Random();
        
        // Generate a random number between 1 and 10 (inclusive)
        int randomNumber = random.nextInt(10) + 1;
        
        // Print the random number
        System.out.println("Random Number: " + randomNumber);
        }
    }
