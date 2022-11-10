import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        int loop = 0;
        while (loop==0) {
            Scanner f = new Scanner(System.in);
            int angka = 1, n, i;
            System.out.println("Masukkan Angka: ");
            n = f.nextInt();
            for (i = 1; i <= n; i++) {
                angka *= i;
            }
            System.out.println("Hasil Faktorial Angka tersebut = " + angka);
        }
    }
}
