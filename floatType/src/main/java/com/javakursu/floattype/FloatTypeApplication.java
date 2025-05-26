package com.javakursu.floattype;

/**
 * @author Mehmet
 * @date 25.05.2025
 */
public class FloatTypeApplication {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        float floatValue1 = 157.78F;

        float maxValue = Float.MAX_VALUE;
        float minValue =  Float.MIN_VALUE;

        System.out.println("Minimum Float Değeri: " + minValue); // 1.4 X 10 (-45) = 1.4 x 1/10(45) = 0.000000014
        System.out.println("Maximum Float Değeri: " + maxValue);  // 3.4028235 x 10(38)

        float sumFloat = floatValue + floatValue1;
        System.out.println("Sum Float: " + sumFloat);



    }
}
