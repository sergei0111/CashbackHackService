package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void test_1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = 100;
        int expected = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void test_2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = 999;
        int expected = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void test_3() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = 0;
        int expected = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void test_4() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = 1000;
        int expected = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void test_5() {
        CashbackHackService service = new CashbackHackService();

        int amount =1001;

        int actual = 999;
        int expected = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }
}