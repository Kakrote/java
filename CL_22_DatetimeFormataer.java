import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CL_22_DatetimeFormataer {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("defult formate of the datetime is ");
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy||E||h:m a");// giving the new formate to the date and time
        String date=dt.format(df);
        System.out.println("after the new formate ");
        System.out.println(date);
    }
}
