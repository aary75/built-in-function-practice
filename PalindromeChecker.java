import java.util.Scanner;

public class PalindromeChecker {

    // Function to get the input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        return scanner.nextLine();
    }

    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove any spaces and convert to lowercase for consistent comparison
        str = str.toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }
        
        return true; // It's a palindrome if all characters match
    }

    // Function to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Get the user input
        String input = getInput();

        // Check if the string is a palindrome
        boolean result = isPalindrome(input);

        // Display the result
        displayResult(result);
    }
}

// Input:
// Enter a string : Madam

// Output:
// The string is a palindrome.

