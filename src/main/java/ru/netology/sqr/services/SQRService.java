package ru.netology.sqr.services;


public class SQRService {
    public int calcSqr(int minBoarder, int maxBoarder) {

        int result = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i*i >= minBoarder) {
                if  (i*i <= maxBoarder) {
                    result++;
                }
            }
        }
        return result;
    }
}
