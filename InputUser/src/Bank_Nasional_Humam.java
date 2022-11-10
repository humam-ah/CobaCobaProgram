import java.util.Scanner;

public class Bank_Nasional_Humam {
    public static void main(String[] args) {
        int depo, tarik, tf, exit;
        int saldoawal = 1000000;
        Scanner ww = new Scanner(System.in);

        while(true){
            System.out.println("====================");
            System.out.println("Bank Nasional Humam ");
            System.out.println("--------------------");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("--------------------");
            System.out.println("Masukkan pilihan anda: ");
            Scanner input = new Scanner(System.in);

            int mov = ww.nextInt();
            switch (mov){
                case 1 :
                    System.out.println();
                    System.out.println("Saldo anda saat ini : "+saldoawal);
                    System.out.println();
                    break;

                case 2 :
                    System.out.println();
                    System.out.println("Masukkan jumlah deposit anda : ");
                    depo = ww.nextInt();
                    saldoawal=saldoawal+depo;
                    System.out.println("Saldo anda sekarang : "+saldoawal);
                    System.out.println();
                    break;

                case 3 :
                    System.out.println();
                    System.out.println("Masukkan jumlah untuk ditarik : ");
                    tarik = ww.nextInt();
                    if (saldoawal > tarik){
                        saldoawal=saldoawal-tarik;
                        System.out.println("Saldo anda mencukupi ");
                        System.out.println("Saldo anda sekarang adalah : "+ saldoawal);
                        System.out.println();
                    }else {
                        System.out.println("Saldo anda kurang");
                        System.out.println("Sisa saldo anda sekarang adalah : " +saldoawal);
                        System.out.println();
                    }
                    break;

                case 4 :
                    System.out.println();
                    System.out.println("Masukkan nomor rekening tujuan : ");
                    tf = input.nextInt();
                    System.out.println("Masukkan jumlah uang yang ingin di transfer : ");
                    tf = input.nextInt();
                    if (tf>=saldoawal){
                        System.out.println("Jumlah transfer "+tf);
                        System.out.println("Jumlah transfer melebihi batas limit saldo");
                        System.out.println("Anda tidak dapat meneruskan proses ini ");
                        System.out.println();
                    }else {
                        System.out.println("Jumlah transfer : "+tf);
                        System.out.println("Saldo akhir : "+(saldoawal-tf));
                        System.out.println();
                    }
                    break;

                case 5 :
                    System.out.println();
                    System.out.println("Terimakasih telah menggunakan layanan kami");
                    System.exit(0);
            }
        }
    }
}