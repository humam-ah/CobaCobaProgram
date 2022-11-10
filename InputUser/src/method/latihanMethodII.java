package method;

import java.util.Scanner;

public class latihanMethodII {
    public static void thod3(int jumlah){
        System.out.println();
        System.out.println("Jumlah Siswa ada "+jumlah+" orang");
    }
    public static void thod2(String[] cetakNama) {
        System.out.println();
        String[] urut = {"Pertama","Kedua","Ketiga","Keempat","Kelima"};
        for (int ind=0;ind < cetakNama.length;ind++){
            System.out.println("Nama Siswa "+urut[ind]+" Adalah: " + cetakNama[ind]);
        }
        thod3(cetakNama.length);
    }
    public static void thod1 (){
        String[] namaSiswa = new String[5];
        String[] urut = {"Pertama","Kedua","Ketiga","Keempat","Kelima"};
        Scanner nada = new Scanner(System.in);
        for (int dex=0;dex< namaSiswa.length; dex++){
            System.out.println("Masukkan Nama Siswa "+urut[dex]+": ");
            namaSiswa[dex]= nada.nextLine();
        }
        thod2(namaSiswa);
    }
    public static void main(String[] args) {
        thod1();
    }
}