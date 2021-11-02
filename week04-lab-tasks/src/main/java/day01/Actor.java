package day01;

public class Actor {
    private String actorName;
    private int actorYear;

    public Actor(String actorName, int actorAge) {
        this.actorName = actorName;
        this.actorYear = actorAge;
    }

    public String getActorName() {
        return actorName;
    }

    public int getActorYear() {
        return actorYear;
    }
}

