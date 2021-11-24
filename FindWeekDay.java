import java.time.LocalDate;

public class FindWeekDay {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 10, 18);
        System.out.println(date.getDayOfWeek().toString());
    }
}
