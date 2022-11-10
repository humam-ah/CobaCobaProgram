import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PuskesmasVaksin {
    static int totalJumlahPenerimaVaksin = 180;
    public static String[] Pfizer = new String[50];
    public static String[] Sinopharm = new String[60];
    public static String[] Moderna = new String[70];
    public static void printInfoPasienVaksin(){
        int totalPfizer=0;
        int totalSisaKuota=0;
        for (int index =0;index< Pfizer.length;index++){
            if (Pfizer[index]!=null){
                totalPfizer++;
            }
        }
        int totalSinopharm=0;
        for (int index=0;index< Sinopharm.length;index++){
            if (Sinopharm[index]!=null){
                totalSinopharm++;
            }
        }
        int totalModerna=0;
        for (int index=0;index< Moderna.length;index++){
            if (Moderna[index]!=null){
                totalModerna++;
            }
        }
        totalSisaKuota = totalJumlahPenerimaVaksin - totalPfizer-totalSinopharm-totalModerna;
        System.out.println("Total Pasien Pfizer: "+totalPfizer+" | Total Pasien Sinopharm: "+totalSinopharm+" | Total Pasien Moderna: "+totalModerna);
        System.out.println("Jumlah Seluruh Vaksin: "+ totalJumlahPenerimaVaksin+" | Total Sisa Kuota Vaksin: "+totalSisaKuota);
        System.out.println();
    }
    public static void checkIndexArray(String[] myArray,String pasien){
        int indexNow = 0;
        for (int index=0;index<myArray.length;index++){
            if (myArray[index] != null){
                indexNow=index+1;
            }
        }
        if (indexNow<myArray.length){
            myArray[indexNow]=pasien;
        }
    }
    public static void simpanPasien(int angkaRandom, String pasien){
        switch (angkaRandom){
            case 1:
                checkIndexArray(Pfizer,pasien);
                System.out.println("Anda Mendapat Vaksin Pfizer");
                printInfoPasienVaksin();
                break;
            case 2:
                checkIndexArray(Sinopharm,pasien);
                System.out.println("Anda Mendapat Vaksin Sinopharm");
                printInfoPasienVaksin();
            case 3:
                checkIndexArray(Moderna,pasien);
                System.out.println("Anda Mendapat Vaksin Moderna");
                printInfoPasienVaksin();
                break;
        }
    }
    public static void inputPasien(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.println("Nama Pasien = ");
            String namaPasien = inputData.nextLine();
            if (namaPasien.isBlank()){
                System.out.println("Nama Pasien Wajib Diisi ");
                inputPasien();
            }else {
                Random hasilRandom = new Random();
                int jenisRandom = hasilRandom.nextInt(3)+1;
                simpanPasien(jenisRandom,namaPasien);
            }
        }
    }
    public static void main(String[] args) {
        inputPasien();
    }
}
