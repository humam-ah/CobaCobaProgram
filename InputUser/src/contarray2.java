import java.util.Scanner;

public class contarray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[5];
            for (int index = 0; index< nama.length; index++){
                System.out.print("Masukkan Nama Ke - "+ (index+1) + " = ");
                nama[index] = input.nextLine();
            }
        if (nama.length!=0){
            System.out.println("Nama yang terdaftar adalah : ");
            System.out.println("==============================");
            for (int counter=0; counter<nama[counter].length(); counter++){
                int jum_huruf = nama[counter].length();
                System.out.println((counter+1)+". "
                        + nama[counter] + " jumlah huruf "
                        + jum_huruf);
            }
        }
    }
}
