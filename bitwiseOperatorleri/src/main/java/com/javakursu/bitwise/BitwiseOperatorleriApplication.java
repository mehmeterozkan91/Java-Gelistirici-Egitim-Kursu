package com.javakursu.bitwise;

/**
 * @author Mehmet
 * @date 5.06.2025
 */
public class BitwiseOperatorleriApplication {
    public static void main(String[] args) {
        //        ~ (Tersleme Operatörü - Bitwise NOT):
        //        ~x ifadesi, x'in her bir bitini tersine çevirir.
        //        Yani, 0 ise 1'e, 1 ise 0'a çevirir.

        int sayi1 = 5;                 // 0000 0101
        int sayi2 = ~sayi1;            // 1111 1010 (-6)
        System.out.println("sayi2 : " + sayi2);    // sayi2 : -6

        //        & (VE Operatörü - Bitwise AND):
        //        x & y ifadesi, x ve y'nin her bir bitini AND işlemine tabi tutar.
        //        Her iki bit de 1 ise sonuç 1, aksi halde 0 olur.

        int sayi3 = 5;                              		// 0000 0101
        int sayi4 = 3;                              		// 0000 0011
        int sayi5 = sayi3 & sayi4;                         	// 0000 0001 (1)
        System.out.println("sayi5 : "+sayi5);             	// sayi5 : 1

        //        ^ (XOR Operatörü - Bitwise XOR):
        //        x ^ y ifadesi, x ve y'nin her bir bitini XOR işlemine tabi tutar.
        //        Her iki bit de farklı ise sonuç 1, aynı ise 0 olur.

        int sayi6 = 5;                             		// 0000 0101
        int sayi7 = 3;                                  // 0000 0011
        int sayi8 = sayi6 ^ sayi7;                      // 0000 0110 (6)
        System.out.println("sayi8 : "+sayi8);          // sayi8 : 6

        //        | (VEYA Operatörü - Bitwise OR):
        //        x | y ifadesi, x ve y'nin her bir bitini OR işlemine tabi tutar.
        //        Her iki bit de 0 ise sonuç 0, aksi halde 1 olur.

        int sayi9 = 5;                             		// 0000 0101
        int sayi10 = 3;                              	// 0000 0011
        int sayi11 = sayi9 | sayi10;                    // 0000 0110 (7)
        System.out.println("sayi11 : "+sayi11);         // sayi11 : 7


        // << (Bitleri Sol Kaydırma Operatörü - Left Shift Operator)
        int number1 = 5;                               // 0000 0101 (5)
        int number2 = number1 << 2;                    // 0001 0100 (20)
        System.out.println("number2 = " + number2);    // number2 = 20

       // >> (Bitleri Sağ Kaydırma Operatörü - Rigth Shift Operator)
        int number3 = -16;                            // 1111 0000 (-16)
        int number4 = number3 >> 2;                   // 1111 1100 (-4)
        System.out.println("number4 = " + number4);   // number4 = -4

        // >>> (Unsigned Right Shift Operator)
        int number5 = -16;                            // 1111 1111 1111 1111 1111 1111 1111 0000
        int number6 = number5 >>> 2;                  // 0011 1111 1111 1111 1111 1111 1111 1100 (1073741820)
        System.out.println("number6 = " + number6);   // number6 = 1073741820





    }
}
