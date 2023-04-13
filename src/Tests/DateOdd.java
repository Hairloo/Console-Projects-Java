package Tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateOdd {
    public static void main(String[] args) throws ParseException {
        isDateOdd("JANUARY 1 2000");
    }
    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date newDate = format.parse(date);
        Date minDate = format.parse("JANUARY 1 " + (1900 + newDate.getYear()));
        return (newDate.getTime() - minDate.getTime()) / (1000 * 60 * 60 * 24) % 2 == 0;
    }
}
