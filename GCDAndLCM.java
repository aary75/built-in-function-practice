//Creating the GCDAndLCM class to find GCD and LCM of two numbers
import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Enter first number: ");
         int firstNumber = scanner.nextInt(); // enter first number

         System.out.print("Enter second number: ");
         int secondNumber = scanner.nextInt(); // enter second number

         int[] factorsFirstNumber = factors(firstNumber); // factors of first number

         int[] factorsSecondNumber = factors(secondNumber); // factors of second number

          int gcd = findGCD(factorsFirstNumber, factorsSecondNumber); // finding gcd

         int lcm = (firstNumber * secondNumber) / gcd; // finding lcm

         System.out.print("The gcd and lcm of " + firstNumber + " and " + secondNumber + " is " + gcd + " and " + lcm +" respectively");
}

// Function to find all factors of numbers
public static int[] factors(int number){
     
     int[] factors = new int[number];
     int index = 0;
     for(int i = 1;i<= number;i++){
          if(number%i == 0) factors[index++] = i;
     }

     // Making a copy of factors array
    int[] copy = new int[index];
    for(int i = 0;i<index;i++) copy[i] = factors[i];

 return copy;
}

// Function to call gcd of two numbers
public static int findGCD(int[] first,int[] second){
      
      int answer = 0;

      for(int i = first.length - 1; i >= 0;i--){
          for(int j = second.length - 1; j >=0; j--){
              if(first[i] == second[j]) {
                   answer = first[i];
                
             }
            if(answer != 0) break;
           }
      }

     return answer;
}
}

// Input:
// Enter first number: 56
// Enter second number: 98

// Output:
// The gcd and lcm of 56 and 98 is 14 and 392 respectively
