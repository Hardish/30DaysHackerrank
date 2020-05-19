package Day14Scope.CalenderPractice;

/*
packages:
build in package:
User defined packages:

Scope: life time and accessibility of the variable define.
class level
method level
public vs private
loop level
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,1); //1 is for tomorrow, 0 for today
        System.out.println(calendar.getTime());

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(calendar.getTime());
        System.out.println(formatted);
    }
}
