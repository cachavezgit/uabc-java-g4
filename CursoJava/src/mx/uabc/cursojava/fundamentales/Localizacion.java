package mx.uabc.cursojava.fundamentales;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Localizacion {
    public static void main (String[] args){
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayName());

        Locale localeMX = new Locale("es", "MX");
        System.out.println(localeMX.getDisplayLanguage());
        System.out.println(localeMX.getDisplayCountry());
        System.out.println(localeMX.getDisplayName());

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Calendar calendar = Calendar.getInstance();

        DateFormat dfCorto = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, localeMX);
        DateFormat dfLargo = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, localeMX);

        DateFormat dfCortoDate = DateFormat.getDateInstance(DateFormat.SHORT, localeMX);
        DateFormat dfLargoDate = DateFormat.getDateInstance(DateFormat.LONG, localeMX);

        System.out.println(dfCorto.format(calendar.getTime()));
        System.out.println(dfLargo.format(calendar.getTime()));

        System.out.println(dfCortoDate.format(calendar.getTime()));
        System.out.println(dfLargoDate.format(calendar.getTime()));

        NumberFormat numberFormatLocale = NumberFormat.getInstance(locale);
        NumberFormat numberFormatLocaleMX = NumberFormat.getInstance(localeMX);

        Locale localeSP = new Locale("es", "SP");
        NumberFormat numberFormatLocaleSP= NumberFormat.getInstance(localeSP);

        System.out.println(numberFormatLocale.format(1235674.34));
        System.out.println(numberFormatLocaleMX.format(1235674.34));
        System.out.println(numberFormatLocaleSP.format(1235674.34));

        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(calendar.getTime()));


    }
}
