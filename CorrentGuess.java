// Creating CorrectGuess class to find which guess is correct 
import java.util.Random;
import java.util.Scanner;

public class CorrentGuess {
     public static void main(String[] args) {
         // Game started
         game();
}

// Function to get feedback from the user
public static String feedback(){
       
      Scanner scanner = new Scanner(System.in);

      return scanner.nextLine().toLowerCase();
}

// Function to generate a random guess
public static int generateGuess(int min,int max){
      Random random = new Random();

      int guess = random.nextInt(max + 1);
      
      return guess;
}

// Function to play the number guessing game
public static void game(){

       int min = 1;
       int max = 100;
       String feedback = "";

       // Loo to keep guessing until the correct number is found
       do{
          int guess = generateGuess(min,max);

          System.out.println(guess);
          feedback = feedback();

          if(feedback.equals("high")){
                  max = guess - 1; // Adjust the max number
          }
          else if(feedback.equals("low")){
                 min = guess + 1; // Adjust the min number
          }
          else if(feedback.equals("correct")){
               System.out.print("Correct Guessed");
               break;
          }
          else System.out.print("Please give correct feedback");
       }while(!feedback.equals("correct"));
 }
}

// Output: 38
//        high
//        0
//        low
//        27
//        high
//        3
//        low
//        22
//        high
//        6
//        low
//        5
//        low
//        16
//        high
//        2
//       low
//       0
//      low
//       13
//       low
//       14
//       Correct
//       Correct Guessed
