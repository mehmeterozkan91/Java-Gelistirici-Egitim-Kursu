package com.javakursu.artisazaltma;

/**
 * @author Mehmet
 * @date 5.06.2025
 */
public class ArtisAzaltmaOperatorleriApplication {
    public static void main(String[] args) {
        //Artış
        int number1 = 8;
        int number2 = ++number1;
        System.out.println("Prefix number2 = " + number2);

        int numberX = 3;
        int number3 = numberX++;
        System.out.println("Postfix number3 = " + number3);

        //Azaltma
        int numberY = 7;
        int number4 = --numberY;
        System.out.println("Prefix number4 = " + number4);

        int numberZ = 4;
        int number5 = numberZ--;
        System.out.println("Postfix number5 = " + number5);
        System.out.println("numberZ = " + numberZ);


        int sayi1 = 5;
        int sayi2 = 8;
        float sayi3 = 0.5f;
        long sayi5 = 100;


        System.out.println("Sonuc: " +  ( sayi1 + ++sayi2 ) );

        System.out.println("Sayi1 : " +sayi1);
        System.out.println("Sonuc: " +  ( sayi2 + --sayi1 ) );

        System.out.println("Sayi1 : " +sayi1);

        System.out.println("Sonuc: " +  ( sayi2 + sayi1-- + sayi5 ) );
        System.out.println("Sonuc: " +  ( sayi1 * sayi3 ) );

        System.out.println("Sayi1 : " +sayi1);
        System.out.println("Sonuc: " +  ( sayi1 * sayi3 ) );



    }
}
