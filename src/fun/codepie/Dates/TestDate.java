package fun.codepie.Dates;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
  public static void main(String[] args) {
    var currentTimeMillis = System.currentTimeMillis();
    System.out.println(currentTimeMillis);

    var date = new Date();
    var mill = date.getTime();
    System.out.println(mill);

    var ca = Calendar.getInstance();
    var month = ca.get(Calendar.MONTH);
    var monday = ca.get(Calendar.MONDAY);
  }
}
