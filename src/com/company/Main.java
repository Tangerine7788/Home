package com.company;

public class Main {

    public static void main(String[] args) {
        double[] doubleNum = {-9.5, -8.5, -7.5, -6.5, -5.5, -4.5, -3.5, -2.5, -1.5, 0, 1, 2, 3, 4, 5};
        double sum = 0;
        double counter = 0;
        for (double mm : doubleNum) {
            if (mm <= 0) {
                continue;
            }
            sum += mm;
            counter++;
        }
        System.out.println("сумма положительных чисел:" + sum);
        System.out.println(sum/counter);
    }
}












