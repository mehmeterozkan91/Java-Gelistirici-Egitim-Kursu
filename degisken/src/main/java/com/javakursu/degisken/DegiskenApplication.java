package com.javakursu.degisken;

/**
 * @author Mehmet
 * @date 26.05.2025
 */
public class DegiskenApplication {

    static int kisiSayisi = 0;    // static değişken

    public static void main(String[] args) {
        int yas = 25;                    //int = veri tipi   yas = degişkenİsmi  25 = başlangıçDeğeri
        double pi = 3.14;                // double = veri tipi   pi = degişkenİsmi  3.14 = başlangıçDeğeri
        String isim = "Mehmet";          // String = veri tipi   isim = degişkenİsmi  Mehmet = başlangıçDeğeri
        boolean aktifMi = true;          // boolean = veri tipi   aktifMi = degişkenİsmi  true = başlangıçDeğeri

        String ad;            // instance değişken

        karesiHesapla(10);
        toplama(15,10);

       // int 8ad = 0;    //Yanlış tanımlama çünkü sayı ile başlanamaz

       // double void = 5.5;  // Anahtar kelimeler değişken adı olarak kullanılamaz.

        int matematiktekiToplamSembolu = 5;

        var name = "1587";               // String olarak algılanır
        var age = 30;                      // int olarak algılanır
        var price = 19.99;                 // double olarak algılanır

       // var x;                                      // ❌ HATA: Türü çıkarılamaz çünkü başlangıç değeri yok.

        age = (short) 45;
//        age = "Mehmet";    //var türünün veri tipi değiştirilemez.

        System.out.println("Var Name: " + name);
        System.out.println("Var Age: " + age);
        System.out.println("Var Age: "+ Integer.parseInt(name));

    }

    public static void karesiHesapla(int sayi){
        int karesi = sayi * sayi;
        System.out.println("Karesi: " + karesi);
        System.out.println("Kisi Sayısı: " + kisiSayisi);
    }

    public static void toplama(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);
        System.out.println("Toplam: " + (sayi1 + sayi2));
    }
}
