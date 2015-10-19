/**
 * Created by roy on 06.10.15.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test5 {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy");

        Calendar cal = Calendar.getInstance();

        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1000);
        System.out.println( dateFormat.format(cal.getTime()));
    }
}