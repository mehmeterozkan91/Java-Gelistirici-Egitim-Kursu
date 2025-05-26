package com.javakursu.chartype;

/**
 * @author Mehmet
 * @date 26.05.2025
 */
public class CharTypeApplication {
    public static void main(String[] args) {
        char tab = '\t';
        char newline = '\n';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';

        char karakter = 'K';
        System.out.println("Karakter : "+ karakter);

        char karakter1 = '\u004B';
        System.out.println("Karakter1 : "+ karakter1);

        System.out.println("Karakter : "+ karakter + tab +  " Karakter1: " + karakter1);


    }
}
