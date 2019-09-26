import java.util.Scanner;
import java.util.Random;
public class GuessGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Guessing Game 1");
		System.out.println("Would you like to play?");
		String answer = in.next();
		
		while(answer.equals("yes")) {
			
		}
		System.out.println("Enter number from 1-10: ");
		int userNumber = in.nextInt();
		int pcNumber = rand.nextInt(10) + 1;
		
		if(userNumber == pcNumber) {
			System.out.println("YOU WON!");
			
		} else {
			System.out.println("YOU LOST!");
			System.out.println("The PC chose " + pcNumber);
		}
		

	}

}
