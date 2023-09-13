package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {
    @Test
    public void testCalculate1() {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(20_000, 3_000, 25_000);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(200_000, 60_000, 100_000);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
}