package COBACOBA;

import java.util.Scanner;

public class contohswitch {
    public static void main(String[] args){
        String pesan = "tiga";
        switch (pesan)
        {
            case "satu":
                System.out.println("Selamat");
                break;
            case "dua":
                System.out.println("Belajar");
                break;
            case "tiga":
                System.out.println("Java");
                break;
            default:
                System.out.println("tidak ditemukan");
        }
    }


}
