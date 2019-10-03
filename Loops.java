import java.util.Scanner;
public class Loops {
    
    public static void main(String[] args) {
        int userNum;
        double i = 1;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter a number for some magic: ");
        userNum = scnr.nextInt();
        
        for(i = 1; i <= userNum; ++i) {
            System.out.println(i);
        }
        while(i <= userNum) {
            System.out.println(Math.pow(2, i));
            ++i;
        }
    }
    
}