package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void findMaxRandom() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxIncrease() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        long expected = 11;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxDecrease() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        long expected = 11;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

}