package COBACOBA;

import java.lang.reflect.Array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int loop = 0;
        while (loop == 0) {
            Scanner num = new Scanner(System.in);
            int pil;
            System.out.println("Masukkan nomor absen: ");
            pil = num.nextInt();
            String[] nama = {"Salah Woy", "Linda", "Santi", "Susan", "Mila", "Ayu"};
            System.out.println(nama[pil]);
            System.out.println();
        }
    }
}
