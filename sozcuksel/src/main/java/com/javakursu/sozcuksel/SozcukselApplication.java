package com.javakursu.sozcuksel;

public class SozcukselApplication {
    public static void main(String[] args) {

       // Anahtar Kelimeler(Keywords)
        /*
        abstract   continue   for          new         switch   assert     default    if           package     synchronized
        boolean    do         goto         private     this     break      double     implements   protected   throw
        byte       else       import       public      throws   case       enum       instanceof   return      transient
        catch      extends    int          short       try      char       final      interface    static      void
        class      finally    long         strictfp    volatile   const      float      native       super       while
        _ (underscore)
         */

//---------------------------------------------------------------------------------------
       // Tanımlayıcılar(Identifiers)

        /*
        Java’da Tanımlayıcılar (Identifiers), değişken, metot, sınıf, arayüz, paket vb. adlarını belirlemek için
        kullanılan isimlerdir. Java’da senin verdiğin her isim bir tanımlayıcıdır. Aşağıdaki kurallara göre yazılır.
            1.	Harf (a-z, A-Z), dolar işareti $ veya alt çizgi _ ile başlamalı.
            2.	Devamında rakam (0–9) olabilir.
            3.	Boşluk, tire -, nokta . gibi özel karakterler kullanılamaz.
            4.	Java anahtar kelimeleri (reserved keywords) kullanılamaz. Örnek, class, int gibi
            5.	Büyük/küçük harf duyarlıdır.
         */

       // int nesne11 = 10; //DOĞRU Değişken tanımlayıcısı
       // int nesne-adi = 11; //YANLIŞ Değişken tanımlayıcısı - işareti olmamalı

       // public void toplamaIslemi() { } //DOĞRU Metot tanımlayıcısı
       // public void toplama.Islemi() { } //YANLIŞ Metot tanımlayıcısı nokta olmamalı

       // public class SozcukselApplication { } //DOĞRU Sınıf tanımlayıcısı
       // public class Sozcuksel-Application { } //YANLIŞ Sınıf tanımlayıcısı - kullanılmamalı


       // Değerler(Literals)
        int sayi = 5;   // 5 bir literaldir.
        String isim = "Mehmet";  // Mehmet bir literaldir.
//---------------------------------------------------------------------------------------
       // Operatörler(Operators)
        // Matematiksel operatörler, karşılaştırma operatörleri, mantıksal operatörler, atama operatörleri vb.
        /*
             =   >   <   !   ~   ?   :   ->
            ==  >=  <=  !=  &&  ||  ++  --
            +   -   *   /   &   |   ^   %   <<   >>   >>>
            +=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=
         */
//---------------------------------------------------------------------------------------
       // Ayraçlar(Delimeters)
        /*
        Ayracın Adı     	Sembol(ler)	    Kullanım Amacı
        --------------      ----------      ---------------
        Süslü parantezler	{ }	            Kod bloklarını belirler (sınıf, metot, if, for vb.)
        Normal parantezler	(  )	        Metot çağrısı, kontrol yapıları, öncelik belirtme
        Köşeli parantezler	[  ]	        Dizi tanımı ve erişimi
        Noktalı virgül	    ;	            Komut (statement) sonu
        Nokta	            .	            Üyeye erişim (field, metot vs.)
        Virgül	            ,	            Parametre veya liste elemanlarını ayırır
        Çift tırnak	        “	            String literal oluşturur
        Tek tırnak	        ‘	            Char literal oluşturur
*/
//---------------------------------------------------------------------------------------
       // Ayırıcılar(Seperators)
       /*
       ... (üç nokta – değişken uzunlukta arguman)
        :: (çift iki nokta - metot referans işareti)
        @ (anatosyan tanımı)
        */


//---------------------------------------------------------------------------------------
       // Anahtar Kelime Belirteçleri(Keyword Token)
        /*
        Belirli bir bağlam içinde özel anlam taşıyan, özel durumları ifade eden belirteçlerdir.
        Örnek belirteçler:
        this, super, new, instanceof, import, package, vb.
         */

//---------------------------------------------------------------------------------------
       // Özel Karakterler
        /*
        Özel semboller ve karakterler, belirli bir anlam taşıyan özel belirteçlerdir. Örnek özel karakterler:
        @  #  $  _  ?  :  vb.

         */


    }
}
