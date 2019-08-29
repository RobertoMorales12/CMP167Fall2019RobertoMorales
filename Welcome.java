import java.util.Scanner;
public class Welcome {
	public static void main (String[] args) {
		String msg = "Welcome user!";
		System.out.println(msg);
		Scanner name1 = new Scanner(System.in);
		System.out.println("What is you name?");
		String name = name1.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		
	}

}
