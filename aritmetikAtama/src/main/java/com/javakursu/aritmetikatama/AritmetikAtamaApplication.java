package com.javakursu.aritmetikatama;

/**
 * @author Mehmet
 * @date 6.06.2025
 */
public class AritmetikAtamaApplication {
    public static void main(String[] args) {
        //Toplama Atama
        int x = 5;
       // x = x + 3;
        x += 3;                 // x değişkenine 3 ekler ve atama yapar x=x+3
        System.out.println(x);

        //Çıkarma Atama
        int y = 7;
        // y = y - 3;
        y -= 3;                 // y değişkenine 3 çıkar ve atama yapar y=y-3
        System.out.println(y);


        //Çarpma Atama
        int z = 3;
        // z = z * 3;
        z *= 3;                 // z değişkenine 3 çarpar ve atama yapar z=z*3
        System.out.println(z);

        //Bölme Atama
        int m = 9;
        // m = m / 3;
        m /= 3;                 // m değişkenine 3 böler ve atama yapar m=m/3
        System.out.println(m);

        //Mod Alma Atama
        int t = 11;
        // t = t % 3;
        t %= 3;                 // 5 değişkenine 3 mod alır ve atama yapar t=t%3
        System.out.println(t);


        int d = 15;
        int e = 5;
        // e = e * ( d / 3 )
        e *= ( d / 3 );
        System.out.println(e);


        long p = 11 ;
        long q = 15 ;
        q += ( p * q );  // q = q + ( p * q )
        System.out.println(q);

    }
}
