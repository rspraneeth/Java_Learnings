import java.util.Date;
import java.time.*;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date(); // java.util.Date;
        System.out.println(date+" Gives whole timestamp");

        java.sql.Date dt = new java.sql.Date(date.getTime());
        System.out.println(dt+" Takes date from passed Date timestamp");

        LocalDate dt1 = LocalDate.now(); // java.time.*;
        System.out.println(dt1+" Gives just date");
        System.out.println(dt1.getDayOfMonth()+" is day of month, "+dt1.getDayOfYear()+" is day of year.");

        LocalDate l = LocalDate.ofYearDay(2023, 325);
        System.out.println(l+" Gives what date of the year by passing year and day of year");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt+" Gives timestamp");

        LocalTime lt = LocalTime.now();
        System.out.println(lt.getHour()+" is hour,"+lt.getNano()+" is nano seconds.");



    }
}
