// Creating DateFormat class to print date in different formats

// DateTimeFormatter is a class from the java.time.format package that allows you to format and parse date-time objects (such as LocalDate, LocalDateTime, ZonedDateTime, etc.)
// into strings or parse strings into date-time objects using custom patterns.


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
     public static void main(String[] args) {

         LocalDate date = LocalDate.now(); // get local date

        // First Pattern
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

         String firstFormat = date.format(format1);

         System.out.println("First Format of Date: " + firstFormat);

        // Second Pattern
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

         String secondFormat = date.format(format2);
    
         System.out.println("Second Format of Date: " + secondFormat);

         // Third Pattern
         DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        String thirdFormat = date.format(format3);

         System.out.println("Third Format of Date: " + thirdFormat);

}}

// Output: First Format of Date: 07/03/2025
//        Second Format of Date: 2025-03-07
//        Third Format of Date: Fri, Mar 07, 2025
