package com.javakursu.mantiksaloperator;

/**
 * @author Mehmet
 * @date 9.06.2025
 */
public class MantiksalOperatorlerApplication {
    public static void main(String[] args) {
        //&& AND Operatörü
        boolean isActive = true;
        boolean isEmailVerified = false;

        if (isActive && isEmailVerified) {
            System.out.println("Gönderiyi görebilirsin.");
        } else {
            System.out.println("Gönderiyi göremezsin.");
        }

        //OR || Operatörü
        boolean isAdmin = false;
        boolean isModerator = true;

        if (isAdmin || isModerator) {
            System.out.println("Yönetim paneline erişimin var.");
        } else {
            System.out.println("Yönetim paneline erişimin yok.");
        }

        // ! NOT Operatörü

        boolean isBanned = true;

        if (!isBanned) {
            System.out.println("Hesabın aktif.");
        } else {
            System.out.println("Hesabın banlandı.");
        }

    }
}
