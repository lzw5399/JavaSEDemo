package fun.codepie.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
  public static void main(String[] args) throws ParseException {
    // Date转String
    var dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    var time = dateFormat.format(new Date());

    System.out.println(time);

    // String转Date
    var dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    var str = "2019-05-20";
    var str2 = "2019-05-20 23:21:20";

    var date2 = dateFormat2.parse(str);
    var date3 = dateFormat2.parse(str2);

    System.out.println(date2);
    System.out.println(date3);
  }
}
