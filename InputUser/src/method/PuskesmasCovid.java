package method;

import java.util.Random;
import java.util.Scanner;

public class PuskesmasCovid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rnum = new Random();
        String[] vaksin = new String[180];
        System.out.println("1. Next");
        int koh = inp.nextInt();
        while (koh==1) {
            for (int ind = 0; ind < 1; ind++) {
                for (int ind1 = 0; ind1 < 50; ind1++) {
                    vaksin[ind1] = "AAAAA";
                }
                for (int ind2 = 50; ind2 < 110; ind2++) {
                    vaksin[ind2] = "BBBBB";
                }
                for (int ind3 = 110; ind3 < 180; ind3++) {
                    vaksin[ind3] = "CCCCC";
                }
                System.out.println(vaksin[rnum.nextInt(180)]);
            }
        }
    }
}