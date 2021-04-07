package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;

    }

    public long averageBuy(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum / 12;
    }



    public long buyMax(long[] purchases) {
        long maxValue = purchases[0];
        long maxBuyMonthNumber = 0;
        for ( int i = 0; i < purchases.length; i++) {
            if (maxValue <= purchases[i]) {
                maxValue = purchases[i];
                maxBuyMonthNumber = i + 1;
            }
        }
        return maxBuyMonthNumber;
    }

     public long buyMin(long[] purchases) {
        long minValue = purchases[0];
        long minBuyMonthNumber = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (minValue >= purchases[i]) {
                minValue = purchases[i];
                minBuyMonthNumber = i + 1;
            }
        }
        return minBuyMonthNumber;

    }

    public long belowAverageSales(long[] purchases) {
        long average = averageBuy(purchases);
        long monthsWithBelowAverageSales = 0;
        for (long purchase : purchases) {
            if (purchase < average) monthsWithBelowAverageSales++;
        }
        return monthsWithBelowAverageSales;

    }

    public long numberOfMonthsWithHighSales(long[] purchases) {
        long average = averageBuy(purchases);
        long numberOfMonths = 0;
        for (long purchase : purchases) {
            if (purchase < average) numberOfMonths++;
        }
        return numberOfMonths;

    }
}

