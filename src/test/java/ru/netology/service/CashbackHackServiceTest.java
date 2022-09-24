package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void test1(){

        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(expected,actual);
    }

    @Test
    public void test2(){

        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(expected,actual);
    }

    @Test
    public void test3(){

        int expected = 800;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        assertEquals(expected,actual);
    }

    @Test
    public void test4(){

        int expected =0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        assertEquals(expected,actual);
    }

    @Test
    public void test5(){

        int expected = 800;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        assertEquals(expected,actual);
    }
}
