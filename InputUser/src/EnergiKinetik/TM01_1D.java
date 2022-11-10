package EnergiKinetik;

import java.util.Scanner;

public class TM01_1D {
    public static void main(String[] args) {
        Scanner yoi = new Scanner(System.in);

        System.out.println("PROGRAM TM01-1D");
        System.out.println("----------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Ganjil atau Genap");
        System.out.println("6. Exit");
        System.out.println("----------------");
        System.out.println("Masukkan Pilihan Anda : ");
        int pilihan = yoi.nextInt();
        System.out.println("Masukkan Angka Pertama : ");
        int ang1 = yoi.nextInt();
        System.out.println("Masukkan Angka Kedua : ");
        int ang2 = yoi.nextInt();
        int hasil = 0;
        switch (pilihan)
        {
            case 1 : hasil = ang1 + ang2; break;
            case 2 : hasil = ang1 - ang2; break;
            case 3 : hasil = ang1 / ang2; break;
            case 4 : hasil = ang1 * ang2; break;
            default:
                System.out.println("Input Anda Salah, Silahkan Perhatikan Pada Menu");
        }
        System.out.println("Hasilnya = " + hasil);
    }
}
