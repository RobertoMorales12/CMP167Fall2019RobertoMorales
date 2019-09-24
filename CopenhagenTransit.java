import java.util.Scanner;

public class CopenhagenTransit{
  public static void main(String[]args) {
    Scanner scnr = new Scanner(System.in);
    
    double zoneNum;
    double fare;
    String cOra;
    
    System.out.println("Enter zone number :");
    zoneNum= scnr.nextInt();
    System.out.println("Enter adult or child :");
    cOra = scnr.nextLine();
    
    if (zoneNum <= 2.0 && cOra = "adult") {
      fare = 23.0;
    }
    else if(zoneNum <= 2.0 && cOra = "child") {
      fare = 11.5;
    }
    
    if (zoneNum == 3.0 && cOra = "adult") {
      fare = 34.5;
    }
    else if (zoneNum == 3.0 && cOra = "child") {
      fare = 23.0;
    }
    
    if (zoneNum == 4.0 && cOra = "adult") {
      fare = 46.0;
    }
    else if(zoneNum == 4.0 && cOra = "child") {
      fare = 23.0;
    }
    else {
      fare = -1.00;
    }
    
    
    System.out.println("The fare for " + cOra + " to zone number " + zoneNum + " is " + fare);
  }
}