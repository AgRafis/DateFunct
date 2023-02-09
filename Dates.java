import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
    public static void main(String[] args) {
//Создайте список, в котором хранится 3 даты: 1 марта 2023 года, 2 сентября 2024 года, 6 апреля 2020 года.
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        ArrayList<String> list = new ArrayList<>();
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.DAY_OF_MONTH, 1);
        calendar1.set(Calendar.MONTH, Calendar.MARCH);
        calendar1.set(Calendar.YEAR, 2023);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.DAY_OF_MONTH, 2);
        calendar2.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar2.set(Calendar.YEAR, 2024);

        Calendar calendar3 = new GregorianCalendar();
        calendar3.set(Calendar.DAY_OF_MONTH, 6);
        calendar3.set(Calendar.MONTH, Calendar.APRIL);
        calendar3.set(Calendar.YEAR, 2020);

        list.add(dateFormat.format(calendar1.getTime()) + " года");
        list.add(dateFormat.format(calendar2.getTime()) + " года");
        list.add(dateFormat.format(calendar3.getTime()) + " года");

        System.out.println("3 даты: " + list);

        //Выводим текущую дату
        Date date4 = new Date();
        System.out.println("Текущая дата: " + date4);
    }
}
