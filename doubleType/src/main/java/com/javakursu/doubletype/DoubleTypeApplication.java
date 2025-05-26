package com.javakursu.doubletype;

/**
 * @author Mehmet
 * @date 26.05.2025
 */
public class DoubleTypeApplication {
    public static void main(String[] args) {
        double doubleValue = 3.14d;
        double doubleValue1 = 157.78;

        double maxValue = Double.MAX_VALUE;
        double minValue = Double.MIN_VALUE;

        System.out.println("Maximum Double Değeri: " + maxValue);
        System.out.println("Minimum Double Değeri: " + minValue);

        double fark = doubleValue1 - doubleValue;
        System.out.println("Fark: " + fark);

    }
}
