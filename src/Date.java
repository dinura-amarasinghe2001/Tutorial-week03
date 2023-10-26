public class Date {
    private int Day;
   private   int Month;
    private int Year;

    public Date(int day,int month , int year){
        Day = day;
        Month = month;
        Year = year;
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
