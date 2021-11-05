package day04;

public class Passenger {
    private String name;
    private String ticket;
    private int pack;

    public Passenger(String name, String ticket, int pack) {
        this.name = name;
        this.ticket = ticket;
        this.pack = pack;
    }

    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public int getPack() {
        return pack;
    }
}
