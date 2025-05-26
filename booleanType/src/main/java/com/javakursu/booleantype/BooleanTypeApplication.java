package com.javakursu.booleantype;

/**
 * @author Mehmet
 * @date 26.05.2025
 */
public class BooleanTypeApplication {
    public static void main(String[] args) {
        // Kontrol ifadelerinde kullanımı
        boolean isJavaFun = true;

        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }


        //Mantıksal operatörlerde kullanımı
        boolean isSunny = true;
        boolean isWarm = true;

        if (isSunny && isWarm) {  // true ve true ise koşul sağlanıyor demektir.
            System.out.println("It's a sunny and warm day!");
        } else {
            System.out.println("It's not a sunny and warm day!");
        }

        // Metodlarda kullanımı

        // Kullanım
        System.out.println("10 değeri için : "+isEven(10));  // true
        System.out.println("7 değeri için: " +isEven(7));   // false
        System.out.println("1991 değeri için: " +isEven(1991));   // false


    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
