package COBACOBA;

import java.util.Scanner;

public class siji {
    public static void main(String[] args) {
        Scanner uwu =
                new Scanner(System.in);

        System.out.println("Masukkan Nama Mahasiswa = ");
        String nama = uwu.nextLine();
        System.out.println("Masukkan Nilai Tugas 1 = ");
        double tugas1 = uwu.nextInt();
        System.out.println("Masukkan Nilai Tugas 2 = ");
        double tugas2 = uwu.nextInt();
        System.out.println("Masukkan Nilai Tugas 3 = ");
        double tugas3 = uwu.nextInt();
        System.out.println("Masukkan Nilai UTS = ");
        double UTS = uwu.nextInt();
        System.out.println("Masukkan Nilai UAS = ");
        double UAS = uwu.nextInt();
        System.out.println();

        double atugas,auts,auas,nakhir;
        atugas = ((tugas1+tugas2+tugas3)/3)*0.2;
        auts = (UTS * 0.3);
        auas = (UAS * 0.5);
        nakhir = atugas + auas + auts;

        if (tugas1 <= 69)
            System.out.println("Tugas 1 " + nama + " Perlu Perbaikan");
        if (tugas2 <= 69)
            System.out.println("Tugas 2 " + nama + " Perlu Perbaikan");
        if (tugas3 <= 69)
            System.out.println("Tugas 3 " + nama + " Perlu Perbaikan");
        if (UTS <= 69)
            System.out.println("UTS " + nama + " Perlu Perbaikan");
        if (UAS <= 69)
            System.out.println("UAS " + nama + " Perlu Perbaikan");
        System.out.println();

        if (nakhir <= 20){
            System.out.println("Predikat Nilai Akhir " + nama + " = E");
        } else if (nakhir <= 40){
            System.out.println("Predikat Nilai Akhir " + nama + " = D");
        } else if (nakhir <= 60){
            System.out.println("Predikat Nilai Akhir " + nama + " = C");
        } else if (nakhir <= 80){
            System.out.println("Predikat Nilai Akhir " + nama + " = B");
        } else if (nakhir <= 100){
            System.out.println("Predikat Nilai Akhir " + nama + " = A");
        }

        if (nakhir <= 60) {
            System.out.println(nama + " Dinyatakan Tidak Lulus, Silahkan untuk Mengulang atau Memperbaiki Nilai");
        } else if (nakhir <= 80) {
            System.out.println(nama + " Dinyatakan Lulus Bersyarat");
        } else if (nakhir >= 81){
            System.out.println("Selamat, " + nama + " Dinyatakan Lulus");
        }

    }
}
