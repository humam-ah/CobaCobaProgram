package COBACOBA;

import java.util.Scanner;

public class loro {
    public static void main(String[] args) {
        double a1,a2,a3;

        Scanner aye =
                new Scanner(System.in);

        System.out.println("Masukkan Angka Pertama : ");
        a1 = aye.nextDouble();
        System.out.println("Masukkan angka kedua : ");
        a2 = aye.nextDouble();
        System.out.println("Masukkan angka ketiga : ");
        a3 = aye.nextDouble();
        System.out.println();
        double hasil = a1+a2+a3;
        System.out.println("Jadi hasil penjumlahannya = " + hasil);
        if (hasil%2==0){
            System.out.println("Hasilnya bilangan Genap");
        }else {
            System.out.println("Hasilnya bilangan Ganjil");
        }
    }
}
