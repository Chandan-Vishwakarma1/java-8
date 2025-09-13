package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieConsumer {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        populate(movies);

        Consumer<Movie> m1 = m -> {
            System.out.println("Movie Name:" + m.name);
            System.out.println("Movie Hero:" + m.hero);
            System.out.println("Movie Heroine:" + m.heroine);
            System.out.println();
        };

        for(Movie m:movies){
            m1.accept(m);
        }
    }


    public static void populate(ArrayList<Movie> l)
    {
        l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        l.add(new Movie("Rayees", "Sharukh", "Sunny"));
        l.add(new Movie("Dangal", "Ameer", "Ritu"));
        l.add(new Movie("Sultan", "Salman", "Anushka"));
        }
}
