

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
Director director = new Director("james","Cameron");
Date dob = new Date(16,8,1954);
director.setDoB(dob);
director.setNumberofMovie(23);
        System.out.println(director);
        System.out.println("name is"+director.getName());
        System.out.println("surname"+director.getSurname());
        System.out.println("dob is"+director.getDoB().date());
        System.out.println("number of directed movies is"+ director.getNumberofMovie());
        Date dob1 = new Date(24,7,1954);
        director.setDoB(dob1);
        director.setNumberofMovie(21);

        Movie movie_= new Movie("Avatar","Fantasy",director);
        movie_.setNumber_of_awards(2);
        System.out.println(movie_);
        System.out.println("title is"+movie_.getTitle());
        System.out.println("director name"+movie_.getDirector().getName()+movie_.getDirector().getSurname());
        System.out.println("surname"+movie_.getDirector().getSurname());

            Scanner input = new Scanner(System.in);

while (true) {

    System.out.println("Enter the day ");
    int day = input.nextInt();
if(day>32 || day<=0){
    System.out.println("wrong day");
    continue;
}

    System.out.println("Enter the month ");
    int month = input.nextInt();
    if (month<0 || month>=13){
        System.out.println("wrong month");
        continue;
    }


    System.out.println("Enter the year ");
    int year = input.nextInt();
    if(year<1900 || year>=2079){
        System.out.println("wrong year");
        continue;
    }


    Date dob2 = new Date(day, month, year);

}















}


    }
