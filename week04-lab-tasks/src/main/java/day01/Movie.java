package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieTitle;
    private int movieYear;
    private List<Actor> actorList = new ArrayList<>();

    public Movie(String movieTitle, int movieYear) {
        this.movieTitle = movieTitle;
        this.movieYear = movieYear;
    }

    public void addActor(Actor actor) {
        actorList.add(actor);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (Actor twenties : actorList) {
            if (((movieYear - twenties.getActorYear()) >= 20) && (movieYear - twenties.getActorYear() < 30)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("passz", 1986);
        Actor actor2 = new Actor("xy", 1955);
        Actor actor1 = new Actor("ij", 1970);
        Actor actor3 = new Actor("uj", 1966);


        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);

        System.out.println(movie.actorsInTheirTwenties());


    }
}