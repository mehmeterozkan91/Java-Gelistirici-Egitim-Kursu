package com.javakursu.typecasting;

/**
 * @author Mehmet
 * @date 4.06.2025
 */
public class TypeCastingApplication {
    public static void main(String[] args) {

        //Otomatik dönüşüm
        int sayi = 42;
        double ondalik1 = sayi;                     // int → double otomatik dönüşüm

        short sayi1 = 10;
        float ondalik2 = sayi1;                    // short → float otomatik dönüşüm

        byte sayi2 = 25;
        int sayi3 = sayi2;

        System.out.println("Ondalık1: " + ondalik1);
        System.out.println("Ondalık2: " + ondalik2);
        System.out.println("Sayi3: " + sayi3);

        //Truncation işlemi
        double ondalik = 42.75;
        int tam = (int) ondalik;          // double → int dönüşüm (virgülden sonrası kaybolur)

        System.out.println("Tam sayı: " + tam);

        // Overflow
        long buyukSayi = 130;
        byte kucukSayi = (byte) buyukSayi;         // byte sınırı: -128 ila 127, 256 adet

        System.out.println("Orijinal sayı (long): " + buyukSayi);
        System.out.println("Dönüştürülen sayı (byte): " + kucukSayi);

        float degisken = 10.546f;
        long degisken1 =(long) degisken;

        System.out.println("Dönüştürülen sayı (long): " + degisken1);


        //char dönüşümü
        char harf = 'A';
        int ascii = harf; // char → int

        char harf1 = 'B';
        int ascii1 = harf1;

        char harf2 = 'Z';
        long ascii2 = harf2;

        System.out.println("ASCII kodu: " + ascii);
        System.out.println("ASCII kodu1: " + ascii1);
        System.out.println("ASCII kodu2: " + ascii2);


        //String --> Sayı Dönüşümleri
        String sayiStr = "123";
        int sayiString = Integer.parseInt(sayiStr);

        System.out.println("Toplam: " + (sayiString + 10));


//        String s = "abc";
//        int x = Integer.parseInt(s); // ❌ NumberFormatException hatası fırlatır


        int sayi11 = 42;
        String str = String.valueOf(sayi11);
        // veya
        String str2 = Integer.toString(sayi11);
        System.out.println("str:  " + str);
        System.out.println("str2:  " + str2);

        long longSayi = 256 ;
        String str3 = Long.toString(longSayi);
        System.out.println("str3:  " + str3);

        float floatSayi = 256.54f ;
        String str4 = Float.toString(floatSayi);
        System.out.println("str4:  " + str4);

        //Object Türü
        //Upcasting (Genişletme): Otomatik
        Object obj = "Merhaba";                            // String → Object	7

        //Downcasting (Daraltma): Manuel
        Object obj1 = "Merhaba";
        String str10 = (String) obj1;                              // Object → String (explicit cast)

        System.out.println("Değişken Uzunluğu : " + str10.length());


        Object objInt = 123;
        int intObj = (int) objInt;
        System.out.println("Int Object :"+intObj);

//        //Hatalı Downcasting
//        Object obj2 = 123;
//        String str11 = (String) obj2;                              // ❌ ClassCastException!


        //Instance Dönüşüm
        Object objIns = "Merhaba dünya";

        if (objIns instanceof String s) { // true yada false
            System.out.println("Bu tip bir stringtir ve uzunluğu: " + s.length());
        }else {
            System.out.println("Bu beklenen bir tip değildir.");
        }

        Object objInteger = 123;

        if (objInteger instanceof Integer s) { // true yada false
            System.out.println("Bu tip bir Integer: " + s);
        }else {
            System.out.println("Bu beklenen bir tip değildir.");
        }

        if (objInteger instanceof String s) { // true yada false
            System.out.println("Bu tip bir stringtir ve uzunluğu: " + s.length());
        } else {
            System.out.println("Bu beklenen bir tip değildir.");
        }



//        // 1. Otomatik (Widening) Dönüşüm
//        int sayi = 42;
//        double ondalik = sayi;
//        System.out.println("1. Otomatik Dönüşüm (int → double): " + ondalik);
//
//        // 2. Manuel (Narrowing) Dönüşüm
//        double ondalik2 = 42.75;
//        int tam = (int) ondalik2;
//        System.out.println("2. Manuel Dönüşüm (double → int): " + tam);
//
//        // 3. char ↔ int dönüşümü
//        char harf = 'A';
//        int ascii = harf;
//        System.out.println("3. char → int: " + ascii);
//
//        char harf2 = (char) 66;
//        System.out.println("3. int → char: " + harf2);
//
//        // 4. String → int
//        String sayiStr = "123";
//        int sayi2 = Integer.parseInt(sayiStr);
//        System.out.println("4. String → int: " + (sayi2 + 10));
//
//        // 5. int → String
//        int sayi3 = 55;
//        String str = String.valueOf(sayi3);
//        System.out.println("5. int → String: " + str + "TL");
//
//        // 6. Object türünde Upcasting ve Downcasting
//        Object obj = "Merhaba";
//        String mesaj = (String) obj; // downcasting
//        System.out.println("6. Downcasting sonrası uzunluk: " + mesaj.length());
//
//        // 7. instanceOf + Pattern Matching (Java 16+)
//        Object obj2 = "Java 24 ile gelişmiş pattern matching";
//        if (obj2 instanceof String s) {
//            System.out.println("7. Pattern Matching: " + s.toUpperCase());
//        }



    }
}
