package ANDROID;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// To convert time format from 12 hrs to 24 hrs format.
public class TimeConversion {
    public  String timeConversion(String s) {
        DateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat("HH:mm:ss");

        Date date = null;
        String myDate = "";

        try{
            date = inFormat.parse(s);
        }catch (ParseException e){
            e.printStackTrace();
        }
        if(date!=null){
            myDate = outFormat.format(date);
        }
        return myDate;

    }

    public static void main(String[] args) {
        String s = "12:01:00AM";
        TimeConversion tm = new TimeConversion();
        System.out.println(tm.timeConversion(s));
    }
}
