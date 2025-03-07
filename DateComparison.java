// Create DateComparison class to compare different classes
import java.time.LocalDate;
import java.util.Scanner;


public class DateComparison {
     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in); // scanner class to get user's input

          System.out.println("Enter first date: ");  // get first date
          int firstYear = scanner.nextInt();   // year
          int firstMonth = scanner.nextInt();  // month
          int firstDay = scanner.nextInt();   // day

          LocalDate date1 = LocalDate.of(firstYear, firstMonth, firstDay); // convert all these in a date

          System.out.println("Enter second date: "); // get second date
          int secondYear = scanner.nextInt();  // year
          int secondMonth = scanner.nextInt();  // month
          int secondDay = scanner.nextInt();  // day

          LocalDate date2 = LocalDate.of(secondYear, secondMonth, secondDay); // convert all these in a date

          // isBefore function
          // The isBefore() method in Java is used to compare two date-time objects and determine if one is before the other.
          System.out.println("IsBefore function");
          if(date1.isBefore(date2)){
             System.out.println(date1 + " is before " + date2);
          }
          else{
             System.out.println(date1 + " is not before " + date2);
          }
          System.out.println();

          // isAfer function
          // The isAfter() method in Java is used to compare two date-time objects and check if one is after the other. 
          System.out.println("IsAfter function");
          if(date1.isAfter(date2)){
             System.out.println(date1 + " is after " + date2);
          }
          else{
             System.out.println(date1 + " is not after " + date2);
          }
          System.out.println();

          // isEqual function
          // The isEqual() method in Java is used to compare two date-time objects to check if they represent the same point in time. 
          System.out.println("IsEqual function");
          if(date1.isEqual(date2)){
             System.out.println(date1 + " is equal " + date2);
          }
          else{
             System.out.println(date1 + " is not equal " + date2);
          }

}}

// Input: Enter first date:
//      2025 7 3
//       Enter second date:
//       2025 2
//       15

// Output: IsBefore function
//        2025-07-03 is not before 2025-02-15

//        IsAfter function
//        2025-07-03 is after 2025-02-15

//        IsEqual function
//        2025-07-03 is not equal 2025-02-15

