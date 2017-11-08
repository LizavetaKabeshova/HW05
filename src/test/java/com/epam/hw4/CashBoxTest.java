package com.epam.hw4;

import org.junit.Assert;
import org.junit.Test;

public class CashBoxTest {

    Cashbox cashbox = new Cashbox();

    @Test
    public void testGetResultWin() {
        Assert.assertEquals(cashbox.getResult(2,100,2),1100);
    }

    @Test
    public void testGetResultLose() {
        Assert.assertEquals(cashbox.getResult(1,100,2),900);
    }

    @Test
    public void testTopDownBalance() {
        Assert.assertEquals(cashbox.topDownBalance(100),900);
    }

    @Test
    public void testTopUpBalance() {
        Assert.assertEquals(cashbox.topUpBalance(100),1100);
    }
}
