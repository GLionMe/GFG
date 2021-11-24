import java.util.Calendar;

public class CalenderClass {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(2017, 04, 17, 10, 10);
        System.out.println(Calendar.DAY_OF_WEEK);
    }
}
