// Creating MaxOfThree class to get maximum of three numbers
import java.util.Scanner;

public class MaxOfThree{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
 
       // Taking input
       int[] numbers = input();

       // Function to find maximum
       System.out.print("The maximum number is: " + maximum(numbers));

 }

// FUnction to generate inputs
 public static int[] input(){
      
      Scanner scanner = new Scanner(System.in);

      int[] numbers = new int[3];
       
      System.out.print("Enter first number: ");
      numbers[0] = scanner.nextInt();

      System.out.print("Enter second number: ");
      numbers[1] = scanner.nextInt();

      System.out.print("Enter third number: ");
      numbers[2] = scanner.nextInt();
   
    return numbers;
}

// Function to find maximum of three taken numbers
public static int maximum(int[] numbers){

        int first = numbers[0];
        int second = numbers[1];
        int third = numbers[2];

        if(first >= second && first >= third) return first;
        else if(second >= first && second >= third) return second;

        return third;
}
}

// Input:
// Enter first number: 34
// Enter second number: 65
// Enter third number: 78

// Output:
// The maximum number is: 78

