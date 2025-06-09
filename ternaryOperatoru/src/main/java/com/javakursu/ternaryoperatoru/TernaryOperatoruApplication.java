package com.javakursu.ternaryoperatoru;

/**
 * @author Mehmet
 * @date 10.06.2025
 */
public class TernaryOperatoruApplication {
    public static void main(String[] args) {
        int x = 11, y = 5, z = 0, z1 = 0;

        z = x > y ? x : y;
        z1 = x < y ? x : y;


//        if (x > y) {
//            z = x;
//        } else {
//            z = y;
//        }
//
//        if (x < y) {
//            z1 = x;
//        } else {
//            z1 = y;
//        }

        System.out.println("z : " + z);
        System.out.println("z1 : " + z1);

    }
}
