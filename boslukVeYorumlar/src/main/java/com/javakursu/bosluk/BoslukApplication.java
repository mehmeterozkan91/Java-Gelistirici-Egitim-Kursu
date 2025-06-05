package com.javakursu.bosluk;

public class BoslukApplication {
    public static void main(String[] args) {
        //Space
        int sayi=5;

        //Sekme (Tab)
        if (sayi==5) {
            // Sekme karakteriyle iç içe geçmiş blok
            System.out.println("Koşul doğru");
        }

        //Satır Sonu (Line Break)
        System.out.println("Merhaba");
        System.out.println("Dünya");

        // Bu bir satır içi yorumdur.
        int x = 5; // Bu da bir satır içi yorumdur.

        /*
          Bu
          bir
          çok satırlı
          yorumdur.
        */
        int y = 10;


    }
}
