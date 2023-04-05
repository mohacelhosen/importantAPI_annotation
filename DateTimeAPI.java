import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("Day of week: "+date.getDayOfWeek());
        System.out.println("Day of Month: "+date.getDayOfMonth());
        System.out.println("Day of Year: "+date.getDayOfYear());

        ZoneId dhakaZone = ZoneId.of("Asia/Dhaka");
        LocalDateTime time = LocalDateTime.now(dhakaZone);
        System.out.println(time);
        

        String timeStr = "16:30:45";
        LocalTime lt = LocalTime.parse(timeStr);
        System.out.println(lt);


         // Get the current date and time
         LocalDateTime now = LocalDateTime.now();
         System.out.println("Current date and time: " + now);
 
         // Create a LocalDateTime object with specified values
         LocalDateTime dateTime = LocalDateTime.of(2023, 4, 5, 10, 30);
         System.out.println("Specified date and time: " + dateTime);
 
         // Modify LocalDateTime object by setting year, month, day, hour, and minute values
         LocalDateTime modifiedDateTime = dateTime.withYear(2024)
                                                   .withMonth(8)
                                                   .withDayOfMonth(20)
                                                   .withHour(14)
                                                   .withMinute(45);
         System.out.println("Modified date and time: " + modifiedDateTime);
 
         // Add days to LocalDateTime object
         LocalDateTime datePlusDays = modifiedDateTime.plusDays(10);
         System.out.println("Date after adding 10 days: " + datePlusDays);
 
         // Subtract hours from LocalDateTime object
         LocalDateTime dateMinusHours = modifiedDateTime.minusHours(3);
         System.out.println("Date after subtracting 3 hours: " + dateMinusHours);
 
         // Format LocalDateTime object using a custom formatter
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
         String formattedDateTime = modifiedDateTime.format(formatter);
         System.out.println("Formatted date and time: " + formattedDateTime);

    }
}