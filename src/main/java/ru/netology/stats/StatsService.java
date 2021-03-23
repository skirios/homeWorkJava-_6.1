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
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum / 12;


    }

    public long buyMax(long[] purchases) {
        long maxValue = purchases[0];
        long maxBuyMonthNumber = 0;
        for (long i = 0; i < purchases.length; i++) {
            if (maxValue <= purchases[(int) i]) {
                maxValue = purchases[(int) i];
                maxBuyMonthNumber = i + 1;
            }
        }
        return maxBuyMonthNumber;
    }

     public long buyMin(long[] purchases) {
        long minValue = purchases[0];
        long minBuyMonthNumber = 0;
        for (long i = 0; i < purchases.length; i++) {
            if (minValue >= purchases[(int) i]) {
                minValue = purchases[(int) i];
                minBuyMonthNumber = i + 1;
            }
        }
        return minBuyMonthNumber;

    }

    public long belowAverageSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / 12;
        long monthsWithBelowAverageSales = 0;
        for (long purchase : purchases) {
            if (purchase < average) monthsWithBelowAverageSales++;
        }
        return monthsWithBelowAverageSales;

    }

    public long numberOfMonthsWithHighSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / 12;
        long numberOfMonths = 0;
        for (long purchase : purchases) {
            if (purchase < average) numberOfMonths++;
        }
        return numberOfMonths;

    }
}

