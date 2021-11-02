package day01.age;

import java.util.ArrayList;
import java.util.List;

public class MovieAge {
    private String movieTitle;
    private int movieYear;
    private List<ActorAge> actorAgeList = new ArrayList<ActorAge>();

        public MovieAge(String movieTitle, int movieYear) {
        this.movieTitle = movieTitle;
        this.movieYear = movieYear;
    }

    public void addActor(ActorAge actorAge) {
        actorAgeList.add(actorAge);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (ActorAge twenties : actorAgeList) {
            if ((movieYear - (2021-twenties.getActorAge()) >= 20) && (movieYear - (2021-twenties.getActorAge()) <30)) {
                count ++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        MovieAge movieAge = new MovieAge("passz",1986);
        ActorAge actorAge2 = new ActorAge("xy",55);
        ActorAge actorAge1 = new ActorAge("ij",56);
        ActorAge actorAge3 = new ActorAge("uj",16);


        movieAge.addActor(actorAge1);
        movieAge.addActor(actorAge2);
        movieAge.addActor(actorAge3);

        System.out.println(movieAge.actorsInTheirTwenties());


    }
}
