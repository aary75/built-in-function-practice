import java.time.ZonedDateTime;  // ZonedDateTime to get curent date and time
import java.time.ZoneId;   // ZodeId to get the date and time of specific location

public class ZonedDate {
    public static void main(String[] args) {

        // Get current date and time in a GMT 
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));  
        System.out.println("Current time in GMT(Greenwich Mean Time): " + gmt);

        // Get current date and time in a IST
       ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
       System.out.println("Current time in IST(Indian Standard Time): " + ist);

       // Get current date and time in PST
       ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
       System.out.println("Current time in PST(Pacific Standard Time): " + pst);
    }
}


// Current time in GMT(Greenwich Mean Time): 2025-03-07T13:35:42.560752800Z[GMT]
// Current time in IST(Indian Standard Time): 2025-03-07T19:05:42.585075900+05:30[Asia/Kolkata]
// Current time in PST(Pacific Standard Time): 2025-03-07T05:35:42.587079-08:00[America/Los_Angeles]
