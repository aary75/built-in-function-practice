// Creating DateModifier class to modify the date
import java.time.LocalDate;

public class DateModifier {
    public static void main(String[] args) {

       LocalDate currentDate = LocalDate.now(); // getting current date 

      System.out.println("Current Date: " + currentDate);  // print current date

       LocalDate plus7Days = currentDate.plusDays(7); // add 7 days in current date

     LocalDate plus1month = plus7Days.plusMonths(1); // add 1 month in modified date

      LocalDate plus2Years = plus1month.plusYears(2); // add 2 years in modified date


      LocalDate minus2weeks = plus2Years.minusWeeks(3); // subtracts 3 weeks to finally modified date

     System.out.print("Modified Date: " + minus2weeks); // print the final date

}}

// Current Date: 2025-03-07
// Modified Date: 2027-03-31

