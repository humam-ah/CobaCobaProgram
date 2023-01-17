package UAS_22090165_HumamAsathinHaqqani_1D;
import java.util.Scanner;
import java.util.ArrayList;

public class PSVM {
    public static void main(String[] args) {
        int jum=4;
        UAS1D myMessage =  new UAS1D();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan ID Pesan: ");
        myMessage.setMessageID(sc.nextLine());
        System.out.println("Masukkan Nama Pesan: ");
        myMessage.setMessageName(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for(int index=0; index<jum;index++){
            System.out.println("Masukkan Kata ke Data: ");
            context.add(sc.nextLine());
        }
        myMessage.setContext(context);
        System.out.print("Kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println("Kata tersebut berada di Index ke "+myMessage.FindWords(context,cari));
    }

}
