package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}