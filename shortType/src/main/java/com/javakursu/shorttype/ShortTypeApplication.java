package com.javakursu.shorttype;

/**
 * @author Mehmet
 * @date 25.05.2025
 */
public class ShortTypeApplication {
    public static void main(String[] args) {
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Değeri: " + minShortValue);
        System.out.println("Maximum Short Değeri: " + maxShortValue);

        short exampleValue = (short) 70000;

        /*
           Girilen değerin short çevrilmesi işlemi şu şekildedir :
           16 bit 256 tane değer alabilir. Yani -32768 ila 32767 arasında 65536 adet sayı vardır. 216 = 65536
            Girilen değer pozitif olduğunda ve 32767 büyükse 65536 çıkarılır,
            negatif olursa ve -32768 den küçükse 65536 ile toplanır.

           exampleValue = (70000 - 65536)  => 4464 cevabı olacaktır.
        */

        short exampleValue1 = (short) -32769;
        /*
        Girilen değieri 65536 ile toplayacağız
        65536 - 32769 = 32767
         */
        System.out.println("Short Değeri: " + exampleValue1);

        short exampleValue2 = (short) -157456;
        /*
        Girilen değieri 65536 ile toplayacağız
        -157456 + 65536  = -91920 + 65536 = -26384
         */
        System.out.println("Short Değeri: " + exampleValue2);

    }
}
