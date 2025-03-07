// Creating the PrimeNumbers to check a number is prime or not
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the number: ");
      int number = scanner.nextInt(); // get input from user

      boolean result = result(number);  // Call function to check

      // Printing the result
      if(result) System.out.print(number + " is a prime number");
      else System.out.print(number + " is not a prime number");
}

// Function to check number is prime or not
public static boolean result(int number){

    for(int i = 2; i< number;i++){
        if(number % i == 0) return false;
    }

 return true;
}
}


// Input:
// Enter the number: 3

// Output:
// 3 is a prime number
