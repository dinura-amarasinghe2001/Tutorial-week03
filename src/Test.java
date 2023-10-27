

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IdentifyVariables a = new IdentifyVariables();
        IdentifyVariables b =new IdentifyVariables();
        a.y = 5;b.y = 6;a.x = 1;b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyVariables.x = " + IdentifyVariables.x);
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






}















}



