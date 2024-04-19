package CH1.Pertemuan6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGroup {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("current data : " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        System.out.println("current data : " + sdf.format(date));

    }
}
