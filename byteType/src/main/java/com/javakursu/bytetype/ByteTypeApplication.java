package com.javakursu.bytetype;

/**
 * @author Mehmet
 * @date 25.05.2025
 */
public class ByteTypeApplication {
    public static void main(String[] args) {
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Değeri: " + minByteValue);
        System.out.println("Maximum Byte Değeri: " + maxByteValue);

        byte exampleValue = (byte) 300;

        /* Burada verilen değer 127 den büyük olduğu için çıktı olarak bize 300 değerini vermez.
           Girilen değerin byte çevrilme işlemi şu şekildedir :
           8 bit 256 tane değer alabilir. Yani -128 ila 127 arasında 256 adet sayı vardır. 28 = 256
           exampleValue = (300 - 256)  => 44 cevabı olacaktır.
        */
        System.out.println("Byte Değeri: " + exampleValue);

        /*
            Eğer cevap -128 ila 127 arasında değilse tekrar 256'dan çıkarılır.
            Sonuç -128 ila 127 olana kadar çıkarma işlemi devam ettirilir.
            Örnek :
        */

        byte exampleValue1 = (byte) 600;
        /*
         exampleValue1 = 600 - 256 => 344 - 256 => 88 cevabı olacaktır.
        */
        System.out.println("Byte Değeri: " + exampleValue1);

        byte exampleValue2 = (byte) 1000;
        /*
         exampleValue1 = 1000 - 256 =>  744 - 256 => 488 - 256 => 232 - 256 => -24 cevabı olacaktır.
        */
        System.out.println("Byte Değeri: " + exampleValue2);

        byte exampleValue3 = (byte) -500;
        /*
         Girilen değer eksi bir değer ise, 256 ile toplanarak -128 ila 127 olana kadar işlem devam ettirilir.
         exampleValue1 = -500 + 256 =>  -244 + 256 => 12 cevabı olacaktır.
        */
        System.out.println("Byte Değeri: " + exampleValue3);

        byte exampleValue4 = (byte) -129;
        /*
         exampleValue1 = -129 + 256 =>  127 cevabı olacaktır.
        */
        System.out.println("Byte Değeri: " + exampleValue4);


    }
}
