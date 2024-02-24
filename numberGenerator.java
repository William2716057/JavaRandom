import java.security.SecureRandom;

public class numberGenerator {
        public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(100); //between 0 and 100
	System.out.println("Random Number = " + randomNumber);
	}
}




