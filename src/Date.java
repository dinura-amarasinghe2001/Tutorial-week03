public class Date {
    private int Day;
   private   int Month;
    private int Year;



    public Date(int day, int month , int year) {
        Day = day;
        if (day > 32 || day <= 0) {
            System.out.println("wrong day");

        }

        Month = month;

        if (month < 0 || month >= 13) {
            System.out.println("wrong month");

        }


        Year = year;
        if (year < 1900 || year >= 2079) {
            System.out.println("wrong year");

        }

    }
    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }



    public String date() {
        return "Date ["+Day+" Month"+Month+" Year"+Year+"]";
    }
}
