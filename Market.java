import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
				String answer;
				double budget;
				
				System.out.println("Welcome to Yani's supermarket");
				System.out.print("Would you like to see the inventory? ");
				answer = in.next();
				
				if (answer.equalsIgnoreCase("yes")) {
					System.out.printf(" 1.%s %n 2.%s %n "
							+ "3.%s", "Pringles", "Prosseco", "Mozzarella Sticks");
					System.out.println(" Would you like to buy something? 1 2 3 0");
					int choice = in.nextInt();
					switch(choice) {
					case 1:
						System.out.println("You selected Pringles");
						break;
					case 2:
						System.out.println("You selected Prosecco");
						break;
					case 3:
						System.out.println("Mozzarella Sticks");
						break;
					default:
						System.out.println("Okay, come back soon");
						break;
					}
				
				}else {
					System.out.println("OK, come back soon");
				}
	}

}
