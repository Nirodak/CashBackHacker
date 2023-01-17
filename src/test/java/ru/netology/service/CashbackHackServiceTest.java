package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    private int getActual(int amount) {
        return service.remain(amount);
    }

    @Test
    public void amountUnder1000() {

        int amount = 2500;
        int expected = 500;

        assertEquals(expected, getActual(amount));

    }

    @Test
    public void amountLess1000() {

        int amount = 150;
        int expected = 850;

        assertEquals(expected, getActual(amount));
    }

    @Test
    public void amount1000() {
        int amount = 1000;
        int expected = 0;

        assertEquals(expected, getActual(amount));
    }

}