package com.javakursu.iliskiseloperatorler;

/**
 * @author Mehmet
 * @date 6.06.2025
 */
public class IliskiselOperatorlerApplication {
    public static void main(String[] args) {
//        // < küçüktür
//        int x = 5;  // x değeri 5 sayısının atamasını yapıyoruz.
//        int y = 3; // y değeri 3 sayısının atamasını yapıyoruz.
//        boolean kucukMu = x < y ;
//        System.out.println(kucukMu);
//        if (kucukMu) {  // x değeri y değerinden küçük mü?
//            // Eğer x değeri y’den küçükse çıktı olarak “x, y’den küçüktür” yazısı yazacaktır.
//            System.out.println("x, y'den küçüktür.");
//        } else {  // x değeri y’den küçük değilse
//            // Eğer x, y’den küçük değilse, çıktı olarak “x, y’den büyük veya eşittir” yazacaktır
//            System.out.println("x, y'den büyük veya eşittir.");
//        }


//        //<= küçük eşittir
//        int x = 5;  // x değişkenine 5 değeri atamasını yapıyoruz.
//        int y = 3;  // y değişkenine 3 değerini atamasını yapıyoruz.
//
//        if (x <= y) {  // x değeri y değerinden küçük veya eşit mi?
//            // Eğer x değeri y’den küçük veya eşitse çıktı olarak “x, y’den küçük veya eşittir” yazısı yazacaktır.
//            System.out.println("x, y'den küçük veya eşittir.");
//        } else {  // x değeri y’den küçük veya eşit değilse
//            // Eğer x, y’den küçük veya eşit değilse, çıktı olarak “x, y’den büyüktür” yazacaktır
//            System.out.println("x, y'den büyüktür.");
//        }

//        // > büyüktür
//        int x = 5;  // x değişkenine 5 değeri atamasını yapıyoruz.
//        int y = 3; // y değişkenine 3 değerini atamasını yapıyoruz.
//
//        if (x > y) {  // x değeri y değerinden büyük mü?
//            // Eğer x değeri y’den büyükse çıktı olarak “x, y’den büyüktür” yazısı yazacaktır.
//            System.out.println("x, y'den büyüktür.");
//        } else {  // x değeri y’den büyük değilse
//            // Eğer x, y’den büyük değilse, çıktı olarak “x, y’den küçük veya eşittir” yazacaktır
//            System.out.println("x, y'den küçük veya eşittir.");
//        }


//        //>= büyük eşittir
//        int x = 5;  // x değişkenine 5 değeri atamasını yapıyoruz.
//        int y = 3; // y değişkenine 3 değerini atamasını yapıyoruz.
//
//        if (x >= y) {  // x değeri y değerinden büyük veya eşit mi?
//            // Eğer x değeri y’den büyük veya eşitse çıktı olarak “x, y’den büyük veya eşittir.” yazısı yazacaktır.
//            System.out.println("x, y'den büyük veya eşittir.");
//        } else {  // x değeri y’den büyük veya eşit değilse
//            // Eğer x, y’den büyük veya eşit değilse, çıktı olarak “x, y’den küçüktür.” Yazacaktır.
//            System.out.println("x, y'den küçüktür.");
//        }

//        // != eşit değildir
//        int x = 5;  // x değişkenine 5 değeri atamasını yapıyoruz.
//        int y = 4; // y değişkenine 6 değerini atamasını yapıyoruz.
//
//        if (x != y) {  // x değeri y değerine eşit değil mi?
//            // Eğer x değeri y değerine eşit değilse “x ve y eşit değildir.” yazısı yazacaktır.
//            System.out.println("x ve y eşit değildir");
//        } else {  // x ve y eşitse
//            // Eğer x ve y eşitse, çıktı olarak “x ve y eşittir.” yazacaktır
//            System.out.println("x ve y eşittir.");
//        }

//        //== eşittir
//        int x = 5;  // x değişkenine 5 değeri atamasını yapıyoruz.
//        int y = 5; // y değişkenine 5 değerini atamasını yapıyoruz.
//
//        if (x == y) {  // x değeri y değerine eşit mi?
//            // Eğer x değeri y değerine eşitse “x ve y eşittir.” yazısı yazacaktır.
//            System.out.println("x ve y eşittir.");
//        } else {  // x ve y eşit değilse
//            // Eğer x ve y eşit değilse, çıktı olarak “x ve y eşit değildir.” yazacaktır
//            System.out.println("x ve y eşit değildir.");
//        }

//        String str1 = "Merhaba";  // str1 değişkenine “Merhaba” değerini atıyoruz
//        String str2 = "Merhaba";  // str2 değişkenine “Merhaba” değerini atıyoruz
//
//        if (str1 == str2) {  // str1 ve str2 değerleri eşit mi?
//            System.out.println("str1 ve str2 referansları aynıdır.");
//        } else {
//            System.out.println("str1 ve str2 referansları farklıdır.");
//        }


        int x = 5 ;
        int y = 7;
        int toplam = 35;

        boolean esitMi = toplam == ( x * y );
        boolean buyukMu = toplam > ( x * y );
        boolean buyukEsitMi = toplam >= ( x * y );
        boolean kucukMu = toplam < ( x * y );
        boolean kucukEsitMi = toplam <= ( x * y );
        boolean esitDegilMi = toplam != ( x * y );

        System.out.println("Eşit mi :" + esitMi);
        System.out.println("Büyük mü :" + buyukMu);
        System.out.println("buyukEsitMi :" + buyukEsitMi);
        System.out.println("kucukMu :" + kucukMu);
        System.out.println("kucukEsitMi :" + kucukEsitMi);
        System.out.println("esitDegilMi :" + esitDegilMi);




    }
}
