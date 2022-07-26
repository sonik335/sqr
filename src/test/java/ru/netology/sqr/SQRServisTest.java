package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServisTest {

    @Test

    public void test() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void test1() {

        SQRService service = new SQRService();

        int actual = service.calculate(90, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void test2() {

        SQRService service = new SQRService();

        int actual = service.calculate(300, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }
}
