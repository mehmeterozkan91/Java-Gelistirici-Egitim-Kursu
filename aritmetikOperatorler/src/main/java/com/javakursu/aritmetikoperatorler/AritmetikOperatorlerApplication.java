package com.javakursu.aritmetikoperatorler;

/**
 * @author Mehmet
 * @date 5.06.2025
 */
public class AritmetikOperatorlerApplication {
    public static void main(String[] args) {
        //Çarpma
        int number1 = 5;
        int number2 = 4;
        int result1 = number1 * number2;
        System.out.println("number1 * number2 = " + result1);  // number1 * number2 = 20

        //Bölme
        int number3 = 8;
        int number4 = 4;
        int result2 = number3 / number4;
        System.out.println("number3 / number4 = " + result2); // number3 / number4 = 2

        //Mod Alma
        int number5 = 8;
        int number6 = 4;
        int result3 = number5 % number6;
        System.out.println("number5 % number6 = " + result3);  // Mod alma sonucunda kalanı gösterir.


        long sayi1 = 500;
        long sayi2 = 7;
        System.out.println("Çarpma: " + (sayi1 * sayi2) );
        System.out.println("Bölme: " + ((float) sayi1 / sayi2) );
        System.out.println("Mod: " + (sayi1 % sayi2) );

        float sayi3 = 7.89f;
        float sayi4 = 0.5f;
        System.out.println("Çarpma = " + (sayi3 * sayi4));

        double sayi5 = 7.89;
        int sayi6 = 2;
        System.out.println("Bölme = " + (sayi5 / sayi6));



        //Toplama
        int number7 = 8;
        int number8 = 7;
        int result4 = number7 + number8;
        System.out.println("number7 + number8 = " + result4);  // number1 + number2 = 15

        //Çıkarma
        int number9 = 8;
        int number10 = 7;
        int result5 = number9 - number10;
        System.out.println("number9 + number10 = " + result5);  // number1 + number2 = 15


        System.out.println("Ben " + (2025 - 1991) + " yaşındayım.");

        System.out.println("Toplam : " + (15 + 25) + " sonucudur.");
        System.out.println("Toplam : " + 10 + (15 + 25) + " sonucudur.");


    }
}
