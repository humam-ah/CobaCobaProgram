package BioskopHumam;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminBioskop {
    public static void main(String[] args) {
        Bioskop CGV = new Bioskop();
        CGV.setID("001");
        CGV.setNAMABIOSKOP("Bioskop Humam");
        System.out.println("Data Bioskop : ");
        System.out.println("====================================");
        System.out.println("ID Bioskop: "+CGV.getID());
        System.out.println("Nama Bioskop: "+CGV.getNAMABIOSKOP());
        System.out.println("------------------------------------");
        int jumlahStudio = 2;
        ArrayList<Studio> studios = new ArrayList<>();
        for(int index=0; index<jumlahStudio;index++){
            Scanner sc = new Scanner(System.in);
            Studio studio = new Studio();
            System.out.print("ID STUDIO : ");
            studio.setIDSTUDIO(sc.nextLine());
            System.out.print("NAMA STUDIO : ");
            studio.setNAMASTUDIO(sc.nextLine());
            System.out.print("KAPASITAS : ");
            studio.setKAPASITAS(sc.nextInt());
            System.out.println("\n Masukkan Data Film di "
                    + studio.getNAMASTUDIO()+": ");
            ArrayList<Film> films = new ArrayList<>();
            for(int index1=0; index1<=3;index1++){
                Film film = new Film();
                Scanner sc1 = new Scanner(System.in);
                System.out.print("ID FILM : ");
                film.setIDFILM(sc1.nextLine());
                System.out.print("NAMA FILM : ");
                film.setNAMAFILM(sc1.nextLine());
                System.out.print("KATEGORI FILM : ");
                film.setKATEGORI(sc1.nextLine());
                System.out.print("HARGA FILM : ");
                film.setHARGA(sc1.nextLine());
                films.add(film);
                System.out.println();
            }
            studio.setFILMSTUDIO(films);
            studios.add(studio);
        }

        Scanner scpntn = new Scanner(System.in);
        System.out.println("Pilih Studio : ");
        switch (scpntn.nextLine()){
            case "0":
                Scanner scpntn1 = new Scanner(System.in);
                Penonton pntnstu1 = new Penonton();
                System.out.println("ID PENONTON : ");
                pntnstu1.setID(scpntn1.nextLine());
                System.out.println("NAMA PENONTON : ");
                pntnstu1.setNAMA(scpntn1.nextLine());
                System.out.println("NOMOR HP PENONTON : ");
                pntnstu1.setNO_HP(scpntn1.nextLine());
                System.out.println("FILM YANG AKAN DITONTON : ");
                pntnstu1.setFILM_PILIHAN(scpntn1.nextLine());

                break;
            case "1":
                Scanner scpntn2 = new Scanner(System.in);
                Penonton pntnstu2 = new Penonton();
                System.out.println("ID PENONTON : ");
                pntnstu2.setID(scpntn2.nextLine());
                System.out.println("NAMA PENONTON : ");
                pntnstu2.setNAMA(scpntn2.nextLine());
                System.out.println("NOMOR HP PENONTON : ");
                pntnstu2.setNO_HP(scpntn2.nextLine());
                System.out.println("FILM YANG AKAN DITONTON : ");
                pntnstu2.setFILM_PILIHAN(scpntn2.nextLine());

                break;
            default:
                break;
        }

    }
}

