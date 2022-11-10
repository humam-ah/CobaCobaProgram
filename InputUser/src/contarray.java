import java.util.Scanner;

public class contarray {
    public static void main(String[] args) {
        String[] kelas= new String[5];
        Scanner huu = new Scanner(System.in);
        for(int idx = 0; idx<kelas.length;idx++){
            System.out.print("Masukkan Nama Siswa = ");
            kelas[idx]=huu.nextLine();
        }
        System.out.println();

        System.out.println("Daftar Siswa di Kelas adalah: ");
        for (int dex = 0; dex< kelas.length;dex++){
            System.out.println(kelas[dex]);
        }
    }
}
