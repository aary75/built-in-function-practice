// Creating the class TemperatureConverter to convert temperature from farhenheit to celcius and vice-versa
import java.util.Scanner;

public class TemperatureConverter {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Scanner class to get user's input

        System.out.print("First temperature in Farhenheit: ");
        double temFarhenheit = scanner.nextDouble();  // getting temperature in farhenheit

        System.out.print("Second temperature in Celcius: ");
       double temCelcius = scanner.nextDouble(); // getting temperature in celcius

        double farhToCelcius = farhenheitToCelcius(temFarhenheit); 

        double celcToFarhenheit = celciusToFarhenheit(temCelcius);

       // Printing the temperature from farhenheit to celcius
       System.out.println(temFarhenheit + "F temperature in celcius is " + Math.round(farhToCelcius));
 
      // Printing the temperature from celcius to farhenheit
      System.out.print(temCelcius +"C temperature in farhenheit is " + celcToFarhenheit);

}


// Function to change temperature from farhenheit to celcius
public static double farhenheitToCelcius(double temFarhenheit) {
         
        double tem = (temFarhenheit - 32) * (5.0 / 9);

        return tem;
}

// Function to change temperature from celcius to farhenheit
public static double celciusToFarhenheit(double temCelcius) {
 
      double celc = ((9.0 / 5) * temCelcius) + 32;

      return celc;
}
}

// Input: First temperature in Farhenheit: 96
//       Second temperature in Celcius: 25

// Output: 96.0F temperature in celcius is 36
//         25.0C temperature in farhenheit is 77.0

