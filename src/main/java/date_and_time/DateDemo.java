package date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        //Formatting a date in string
        String dateStr = "20/03/2016";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateStr, f);
        String dateStrFormated = f.format(localDate);

        System.out.println("Initial string: " + dateStr);
        System.out.println("Initial string in LocalDate format: " + localDate);
        System.out.println("Initial string formatted: " + dateStrFormated);
        System.out.println();

        //Parsing the date in string
        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy");
        Date d = null;
        try {
            d = sdf.parse(dateStr);
        }catch (ParseException e) {
            e.printStackTrace();
        }

        //From LocalDate to Unix Millis Timestamp
        Instant instant = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        long milliseconds_1 = instant.toEpochMilli();
        System.out.println("Unix Millis Timestamp derived from LocalDate format: " + milliseconds_1);
        System.out.println();

        //From Unix Millis Timestamp to LocalDate format
        LocalDate date = Instant
                .ofEpochMilli(1641600000)
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        System.out.println("Date derived from Unix Millis Timestamp: " + f.format(date));
    }
}
