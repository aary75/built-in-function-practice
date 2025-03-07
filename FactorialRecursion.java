// Creating the FactorialRecursion class to find factorial 
import java.util.Scanner;

public class FactorialRecursion{
    public static void main(String[] args){

      System.out.print("Enter the number: ");
      int number = input(); // get input from user

      int answer = calculate(number); 

      System.out.print("Factorial of " + number + " is " + answer);
}

// Function to get input from user
public static int input() {
     Scanner scanner = new Scanner(System.in);

     return scanner.nextInt();
}

// Function to calculate factorial of number
public static int calculate(int number) {

    if(number == 1) return 1;

    return number * calculate(number - 1);
}
}


// Input:
// Enter the number: 5

// Output:
// Factorial of 5 is 120


