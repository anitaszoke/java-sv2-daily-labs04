package day03;

import java.util.Arrays;
import java.util.List;

public class Stock2 {
    List<Double> s;

    public Stock2(List<Double> s) {
        this.s = s;
    }

    public double maxProfit() {
        for (int i = 0; i < s.size(); i++) {
            double lower = s.get(0);
            while (i < s.size()) {
                if (lower > s.get(i))
                    lower = s.get(i);
                i++;
            }
            double bigger = lower;
            int j = s.indexOf(lower);
            while (j < (s.size()) && j > j - 1) {
                if (bigger < s.get(j))
                    bigger = s.get(j);
                j++;
                continue;
            }
            return bigger - lower;
        }

        return 0;
    }

    public double maxProfit2() {
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
        Stock2 s = new Stock2(Arrays.asList(1.23, 4.35, 0.23, 4.0, 8.4));
        System.out.println(s.maxProfit());  //8.17
        System.out.println(s.maxProfit2());  //8.17
        Stock2 stock2 = new Stock2(Arrays.asList(12.0, 2.0, 8.0, 4.0));
        System.out.println(stock2.maxProfit()); //6.0
        System.out.println(stock2.maxProfit2()); //6.0
    }
}
