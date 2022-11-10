package TugasMandiri;

import java.util.Scanner;

public class TM01_1D {
    public static void main(String[] args) {
        boolean pilihan = true;
        int ops;
        while(pilihan){

        Scanner yoi = new Scanner(System.in);
        System.out.println("----------------");
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
        ops = yoi.nextInt();

        switch (ops) {
            case 1:
                System.out.println("Masukkan Angka Pertama : ");
                double ang1 = yoi.nextDouble();
                System.out.println("Masukkan Angka Kedua : ");
                double ang2 = yoi.nextDouble();
                System.out.println("Hasil Penjumlahan = " + (ang1 + ang2));
                break;
            case 2:
                System.out.println("Masukkan Angka Pertama : ");
                double min1 = yoi.nextDouble();
                System.out.println("Masukkan Angka Kedua : ");
                double min2 = yoi.nextDouble();
                System.out.println("Hasil Pengurangan = " + (min1 - min2));
                break;
            case 3:
                System.out.println("Masukkan Angka Pertama : ");
                int bagi1 = yoi.nextInt();
                System.out.println("Masukkan Angka Kedua : ");
                int bagi2 = yoi.nextInt();
                System.out.println("Hasil Pembagian = " + (bagi1 / bagi2));
                break;
            case 4:
                System.out.println("Masukkan Angka Pertama : ");
                float kali1 = yoi.nextFloat();
                System.out.println("Masukkan Angka Kedua : ");
                float kali2 = yoi.nextFloat();
                System.out.println("Hasil Perkalian = " + (kali1 * kali2));
                break;
            case 5:
                System.out.println("Masukkan Angka : ");
                int gg = yoi.nextInt();
                if (gg % 2 == 0) {
                    System.out.println("Angka tersebut Genap");
                } else {
                    System.out.println("Angka tersebut Ganjil");
                }
                break;
            case 6:
                System.out.println();
                System.out.println("Program Selesai...");
                System.exit(6);
                break;
            default:
                System.out.println("Input yang Anda Masukkan Salah,");
                System.out.println("Silahkan Perhatikan Pilihan pada Menu");
        }
        }
    }
}
