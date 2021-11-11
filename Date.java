import java.util.Scanner;

public class Date {
    private int day, month, year;

    Date() {
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    void ShowInformation() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day : ");
        date.setDay(scanner.nextInt());
        System.out.println("Month : ");
        date.setMonth(scanner.nextInt());
        System.out.println("Year : ");
        date.setYear(scanner.nextInt());
        scanner.close();
        date.ShowInformation();
    }
}
