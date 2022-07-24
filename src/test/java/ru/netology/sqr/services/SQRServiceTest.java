package ru.netology.sqr.services;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void calcSqr() {
        SQRService service = new SQRService();
        int myCalcSqr = service.calcSqr(200,300);
        System.out.println(myCalcSqr);




    }
}
