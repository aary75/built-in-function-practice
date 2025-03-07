// Creating the FibonacciSeries class to calculate the fibonacci series
import java.util.Scanner;

public class FibonacciSeries {
     public static void main(String[] args){
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter first number of sequence: ");
       int firstNumber = scanner.nextInt(); // get first number of series

       System.out.print("Enter second number of sequence: ");
       int secondNumber = scanner.nextInt(); // get second number of series
        
        System.out.print("Enter range of series: ");
       int range = scanner.nextInt(); // get range of series

       calculateFibonacci(firstNumber, secondNumber, range); // calculates fibonacci

}

// Function to calcualte fibonacci series
public static void calculateFibonacci(int firstNumber, int secondNumber, int range){
     System.out.print("Fibonacci Series: ");
     System.out.print(firstNumber + " " + secondNumber + " ");

     // Loop to add more elements in series
     for(int i = 0; i<range; i++) {

        int sum = firstNumber + secondNumber;
        
        System.out.print(sum + " ");

        firstNumber = secondNumber;
        secondNumber = sum;
     }
}
}

// Input:
// Enter first number of sequence: 0
// Enter second number of sequence: 1
// Enter range of series: 4

// Output:
// Fibonacci Series: 0 1 1 2 3 5
