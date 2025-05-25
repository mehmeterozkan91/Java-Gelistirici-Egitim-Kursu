package com.javakursu.sayisistemleri;

/**
 * @author Mehmet
 * @date 25.05.2025
 */
public class SayiSistemleriApplication {
    public static void main(String[] args) {
        char karakter = '{';
        int ascii = karakter;                                 // 10 luk taban
        String binary = Integer.toBinaryString(ascii);        // 2 lik taban
        String unicode = Integer.toHexString(ascii);          // 16 lık taban
        String octalString = Integer.toOctalString(ascii);    // 8 lık taban

        char karakter1 = '\u007b';
        System.out.println(karakter1);

        System.out.println("Karakter: " + karakter);
        System.out.println("Unicode: u00" + unicode);
        System.out.println("OctalString: " + octalString);
        System.out.println("ASCII (Decimal): " + ascii);
        System.out.println("Binary (8 bit): " + String.format("%8s", binary).replace(' ', '0'));

        char myChar ='A';
        String name = "Mehmet";  // \u004D \u0065 \u0068 \u006D \u0065 \u0074

        String yazi = "Mehmet\nERÖZKAN";
        String yazi1 = "Mehmet\tERÖZKAN";
        String yazi2 = "Mehmet\"ERÖZKAN";
        String yazi3 = "Mehmet\rERÖZKAN";
        String yazi4 = "Mehmet\bERÖZKAN";
        System.out.println(yazi);
        System.out.println(yazi1);
        System.out.println(yazi2);
        System.out.println(yazi3);
        System.out.println(yazi4);

    }
}
