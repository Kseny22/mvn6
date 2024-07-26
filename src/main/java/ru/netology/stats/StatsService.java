package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;

    }

    public int calcMonthMaximumSales(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int calcMonthMinimumSales(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int calcMonthBellowAverage(long[] sales) {
        int conter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                conter++;

            }

        }
        return conter;
    }

    public int calcMonthAboveAverage(long[] sales) {
        int conter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                conter++;

            }

        }
        return conter;
    }

}

