package EnergiKinetik;

import java.util.Scanner;

public class TugasEnergiKinetik {
    public static void main(String[] args) {
        Scanner uwu =
                new Scanner(System.in);

        System.out.println("MENENTUKAN ENERGI KINETIK BY: HUMAM");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Masukkan Nama Anda : ");
        String username = uwu.nextLine();
        System.out.println("Masukkan Massa Benda (kg) : ");
        double massa = uwu.nextDouble();
        System.out.println("Masukkan Kecepatan Mula-mula (m/s) : ");
        double kecepatanmulamula = uwu.nextDouble();
        System.out.println("Masukkan Gaya (Newton) : ");
        double fnewton = uwu.nextDouble();
        System.out.println("Perpindahan Benda (m) : ");
        double perpindahanbenda = uwu.nextDouble();
        System.out.println("Waktu (s) : ");
        double waktu = uwu.nextDouble();
        double kecepatan = perpindahanbenda / waktu;
        double EK = massa * kecepatan * kecepatan / 2;
        System.out.println("Kecepatan menjadi : " + kecepatan + " m/s");
        System.out.println("Energi Kinetik :  " + EK + " Joule");
        System.out.println();

        if(EK % 2 == 0){
            System.out.println("Energi Kinetik adalah Bilangan Genap");
        }else{
            System.out.println("Energi Kinetik bukan Bilangan Genap");
        }
        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("Terima Kasih " + username + " telah mencoba Program Saya ");
    }
}
