public class Director  {
    private String name;
    private String surname;
    private Date DoB;
    private int numDirectedMovie;

    public Director(String Name,String Surname) {
        name = Name;
        surname=Surname;

    }
    public int getNumberofMovie(){
        return numDirectedMovie;
    }

    public void setNumberofMovie(int NumDirectedMovie) {
        numDirectedMovie = NumDirectedMovie;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public Date getDoB(){
        return DoB;
        }
    public void setDoB(Date date){
        DoB = date;
    }
}
