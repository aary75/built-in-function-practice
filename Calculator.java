// Creating the calculator class to perform basic functions of calculator
import java.util.Scanner;

public class Calculator{
      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in); // Scanner class to get user's input

         System.out.print("Enter first number: ");
         double firstNumber = scanner.nextDouble(); 

         System.out.print("Enter second number: ");
         double secondNumber = scanner.nextDouble();

         System.out.println();

         System.out.println("Addition of " + firstNumber + " and " + secondNumber + " is " + addition(firstNumber,secondNumber));

         System.out.println("Subtraction of " + firstNumber + " and " + secondNumber + " is " + subtraction(firstNumber,secondNumber));

         System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " is " + multiply(firstNumber,secondNumber));


         if(secondNumber == 0) {
            System.out.println("For division,second input is invlid,change it");
         }
         else{
           System.out.println("Division of " + firstNumber + " and " + secondNumber + " is " + division(firstNumber,secondNumber));
         }
 }

// Function call to these add both numbers
public static double addition(double first,double second) {
 
    return first + second;

}

// Function call to subtract these both numbers
public static String subtraction(double first, double second) {
     
     return String.format("%.2f",first - second); // String format to round off the answer upto 2 decimal points

}

// Function call to multiply these both numbers
public static String multiply(double first, double second){
    
    return String.format("%.2f",first * second);

}

// Function call to divide these both numbers
public static String division(double first, double second) {
 
    return String.format("%.2f",first / second);

}
}


// Input: Enter first number: 45.5
//        Enter second number: 89.6

// Output: Addition of 45.5 and 89.6 is 135.1 
//         Subtraction of 45.5 and 89.6 is -44.10
//         Multiplication of 45.5 and 89.6 is 4076.80
//         Division of 45.5 and 89.6 is 0.51
