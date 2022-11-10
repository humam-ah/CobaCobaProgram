package COBACOBA;

import java.util.Scanner;

public class huruf {
    public static void main(String[] args) {
        Scanner hore = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = hore.nextLine();
        int jmlh = nama.length();
        System.out.println("Jumlah Huruf = " + jmlh);
    }
}
