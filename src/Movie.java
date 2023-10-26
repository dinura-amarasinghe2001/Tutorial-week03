public class Movie {
    private String title;
    private String category;
    private int number_of_awards;
    private Director director;

    public Movie(String Title, String Category, Director director){
        title=Title;
        category=Category;
        this.director= director;

    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return  category;
    }
    public Director getDirector(){
        return director;
    }

    public int getNumber_of_awards() {
        return number_of_awards;
    }

    public void setNumber_of_awards(int Number_of_awards) {
        number_of_awards = Number_of_awards;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", number_of_awards=" + number_of_awards +
                ", director=" + director +
                '}';
    }
}
