package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(allSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(allSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAverageMonthSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.minAverageMonthAllSales(allSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxAverageMonthSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.maxAverageMonthAllSales(allSales);
        Assertions.assertEquals(expected, actual);
    }
}
