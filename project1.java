import java.lang.Math;
import java.util.Scanner;
public class Project1 {
   
    
    
   public static void main(String [] args)  {
       
        
        Scanner scnr = new Scanner(System.in);
       
        double x = 0;
        int numNums = 0;
        int i = 0;
        double result = 0;
      	double rad;
      	
      	
        
        String calcMode;
        String operation;
        String operationWord = "";
      	String userAns;
        
        boolean yesOrNo = true;
      while (yesOrNo = true){
				System.out.println("Enter the calculator mode: Standard/Scientific");
        calcMode = scnr.nextLine();
        if(calcMode.equalsIgnoreCase("Standard")) {
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division: ");
            operation = scnr.nextLine();
            if(operation.equals("+")){
                operationWord = "add";
                System.out.print("How many numbers do you want to " + operationWord + " :");
        
        				numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        					
       					for (i=0; i< numNums ; ++i){
            			x = scnr.nextDouble();
            			result += x;
                
                
            }
             System.out.println(result);
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
                
        }
            else if(operation.equals("-")){
                operationWord = "subtract";
                System.out.print("How many numbers do you want to " + operationWord + " :");
                numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        
       					for (i=0; i<numNums ; ++i){
            			x = scnr.nextDouble();
            			result -= x;
            }
        		System.out.println(result);
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
        
            
        }
            else if(operation.equals("*")){
                operationWord = "multiply";
                System.out.print("How many numbers do you want to " + operationWord + " :");
                numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        				result = scnr.nextDouble();
       					for (i=1; i< numNums ; ++i){
            			x = scnr.nextDouble();
            			result *= x;
            }
        		System.out.println(result);                
            System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
            }
            else if(operation.equals("/")){
                operationWord = ("divide");
                System.out.print("How many numbers do you want to " + operationWord + " :");
                numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        				result=scnr.nextDouble();
       					for (i=1; i< numNums ; ++i){
            			x = scnr.nextDouble();
            			result /= x;
            }
               System.out.println(result);
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
        		                
            } else {
               System.out.println("Invalid operation entered");
            }
            
            
            
            
            
            
            
            
         
            
    }
         
         else if(calcMode.equalsIgnoreCase("Scientific")){
              System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x: ");
            operation = scnr.nextLine();
            if(operation.equals("+")){
                operationWord = "add";
                System.out.print("How many numbers do you want to " + operationWord + " :");
        
        				numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        
       					for (i=0; i!= numNums ; ++i){
            			x = scnr.nextDouble();
            			result += x;
                
                
            }
             System.out.println(result);
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
                
        }
            else if(operation.equals("-")){
                operationWord = "subtract";
                System.out.print("How many numbers do you want to " + operationWord + " :");
                numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        
       					for (i=0; i!= numNums ; ++i){
            			x = scnr.nextDouble();
            			result -= x;
            }
        		System.out.println(result);
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
        
            
        }
            else if(operation.equals("*")){
                operationWord = "multiply";
                System.out.print("How many numbers do you want to " + operationWord + " :");
                numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        				result = scnr.nextDouble();
       					for (i=1; i< numNums ; ++i){
            			x = scnr.nextDouble();
            			result *= x;
            }
        		System.out.println(result);  
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
            }
            else if(operation.equals("/")){
                operationWord = ("divide");
                System.out.print("How many numbers do you want to " + operationWord + " :");
                numNums = scnr.nextInt();
       					System.out.println("Enter numbers: ");
        				result = scnr.nextDouble();
       					for (i=1; i< numNums ; ++i){
            			x = scnr.nextDouble();
            			result /= x;
            }
               System.out.println(result);
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
               
        		    
         }
            else if(operation.equalsIgnoreCase("sin")){
               operationWord = "sin";
               System.out.println("Enter number in radians to find the " + operationWord +" :" );
               x = scnr.nextDouble();
               rad = Math.toRadians(x);
               System.out.println("result : " + Math.sin(rad));
               
               }
            else if(operation.equalsIgnoreCase("cos")){
               operationWord = "cos";
               System.out.println("Enter number in radians to find the " + operationWord +" :" );
               x = scnr.nextDouble();
               rad = Math.toRadians(x);
               System.out.println("result : " + Math.cos(rad));
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
            
      }
            else if(operation.equalsIgnoreCase("tan")){
               operationWord = "tan";
               System.out.println("Enter number in radians to find the " + operationWord +" :" );
               x = scnr.nextDouble();
               rad = Math.toRadians(x);
               System.out.println("result : " + Math.tan(rad));
               System.out.println("Start over? Y/N");
         userAns = scnr.next();
         if(userAns.equalsIgnoreCase("Y")){
            yesOrNo = true;
            continue;
         }
               
               else if (userAns.equalsIgnoreCase("N")){
            yesOrNo = false;
            System.out.println("Goodbye");
         }
         
               
            } else {
               System.out.println("Invalid operation entered");
            }
   
      
   }
        
         
    
        
   }
   }
	}
   
