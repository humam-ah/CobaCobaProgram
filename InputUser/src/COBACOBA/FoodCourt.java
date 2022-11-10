package COBACOBA;

public class FoodCourt {
    public static void thod2(){

    }
    public static void thod1(){
        System.out.println("==============================");
        System.out.println("Selamat Datang di 'Oishi Ne'");
        System.out.println("==============================");
        System.out.println("-Silahkan Pilih Paket Menu-");
        String[] namaPaket = {"1. Nasi + Ayam Paha","2. Nasi + Ayam Sayap",
                "3. Nasi + Ayam Dada","4. Nasi + Bebek","5. Nasi + Lele",
                "6. Nasi + Cumi","7. Nasi + Wagyu","8. Nasi + Beng-Beng"};
        for (int ind=0;ind< namaPaket.length;ind++){
            System.out.println(namaPaket[ind]);
        }
        thod2();
    }
    public static void main(String[] args) {
        thod1();

    }
}
