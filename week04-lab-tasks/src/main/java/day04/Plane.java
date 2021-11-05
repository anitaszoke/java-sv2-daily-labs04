package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxkap;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxkap) {
        this.maxkap = maxkap;
    }

    public int getMaxkap() {
        return maxkap;
    }

    public boolean addPassenger(Passenger passenger) {
            if (passengers.size() < maxkap) {
                passengers.add(passenger);
                return true;
            } else {
                return false;
            }
        }

    public int numberOfPackages() {
        int count = 0;
        for (int i = 0; i < passengers.size(); i++) {
           count = count + passengers.get(i).getPack();
        }
        return count;
    }

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Kiss Hedvig","ab25",2);
        Passenger passenger2 = new Passenger("Szabó Ludvig","bc25",1);
        Passenger passenger3 = new Passenger("Tóth Henrik","ac25",3);

        Plane plane = new Plane(3);
        plane.getMaxkap();
        System.out.println(plane.addPassenger(passenger));
        System.out.println(plane.addPassenger(passenger2));
        System.out.println(plane.addPassenger(passenger3));
        System.out.println(plane.numberOfPackages());


    }
}
