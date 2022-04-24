import java.util.*;
import java.time.*;
import java.util.Scanner;

public class MyDate {
    public int day;
    public int month;
    public int year;

    // cau a
    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

    // No parameter
    public MyDate() {
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    // 3 parameters of day, month, year
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // 1 String parameter
    public MyDate(String stringDate) {
        String[] stringSplit = stringDate.trim().split("\\s+");
        this.month = Integer.parseInt(stringSplit[0]);
        this.day = Integer.parseInt(stringSplit[1]);
        this.year = Integer.parseInt(stringSplit[2]);
    }

    // cau b
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // cau c
    static void accept() {
        System.out.println("enter a date (String) from keyboard:");
        MyDate myDate = new MyDate();
        Scanner myObj = new Scanner(System.in);
        String stringDate = myObj.nextLine();
        String[] stringSplit = stringDate.trim().split("\\s+");
        myDate.setDay(Integer.parseInt(stringSplit[1]));
        myDate.setMonth(Integer.parseInt(stringSplit[0]));
        myDate.setYear(Integer.parseInt(stringSplit[2]));
        // System.out.println(myDate.getDay());
        // System.out.println(myDate.getMonth());
        // System.out.println(myDate.getYear());
    }

    // cau d
    static void print() {
        LocalDate currentdate = LocalDate.now();
        System.out.println("Current date: " + currentdate);
    }
}

class DataTest {
    public static void main(String args[]) {

        // MyDate obj = new MyDate();
        // System.out.println("Day:"+obj.day);
        // System.out.println("Month:"+obj.month);
        // System.out.println("Year:"+obj.year);

        // MyDate obj1 = new MyDate(04,03,2001);
        // System.out.println("Day:"+obj1.day);
        // System.out.println("Month:"+obj1.month);
        // System.out.println("Year:"+obj1.year);

        //MyDate obj2 = new MyDate("03 04 2001");
        // System.out.println("Day:"+obj2.day);
        // System.out.println("Month:"+obj2.month);
        // System.out.println("Year:"+obj2.year);

        MyDate.accept();
        MyDate.print();
    }
}
