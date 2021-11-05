package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    List<Double> s;

    public Stock(List<Double> s) {
        this.s = s;
    }

    public double maxProfit() {
        double max = 0;
        for (int i = 0; i < s.size() - 1; i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if (s.get(j) - s.get(i) > max) {
                    max = s.get(j) - s.get(i);
                }
            }
        }
        return (max);
    }

    public static void main(String[] args) {
        Stock s = new Stock(Arrays.asList(1.23, 4.35, 0.23, 4.0, 8.4));
        System.out.println(s.maxProfit());  //8.17

        Stock stock = new Stock(Arrays.asList(12.0, 2.0, 8.0, 4.0));
        System.out.println(stock.maxProfit()); //6.0

    }
}