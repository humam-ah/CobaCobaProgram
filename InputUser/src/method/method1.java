package method;
import java.util.Scanner;
public class method1 {
    public static void kali(){
        int a = 5;
        int b = 6;
        int kali = a*b;
        System.out.println("Hasilnya adalah: "+kali);
    }

    public static void Judul(String Kelas, String title){
        System.out.println(title +" "+Kelas);
    }

    public static void GanjilGenap(int ang){
        if (ang%2==0){
            System.out.println("Angka "+ang+" adalah Genap");
        }else{
            System.out.println("Angka "+ang+" adalah Ganjil");
        }
    }

    public static void main(String[] args) {
        Scanner Judul = new Scanner(System.in);
        System.out.println("Masukkan Kelas: ");
        String k = Judul.nextLine();
        System.out.println("Masukkan Judul: ");
        String t = Judul.nextLine();
        Judul(k, t);
        kali();
        System.out.println();
        Scanner Judul2 = new Scanner(System.in);
        System.out.println("Masukkan Kelas: ");
        String k2 = Judul2.nextLine();
        System.out.println("Masukkan Judul: ");
        String t2 = Judul2.nextLine();
        Judul(k2, t2);
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        GanjilGenap(angka.nextInt());
    }

}
