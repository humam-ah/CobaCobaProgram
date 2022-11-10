package COBACOBA;

import java.util.Random;

public class array2d {
    public static void main(String[] args) {
        String[][] huruf={
                {"A","B","C"},
                {"D","E","F"},
                {"G","H","I"}
        };
        System.out.println(huruf[0][1]);
        System.out.println(huruf[2][0]);
        int n = 180;
        Random rnum = new Random();
        String a = "Pfizer", b="OSND",c="Moderna";
        String[][] vaksin={
                {a,b,c},{a,b,c},{a,b,c}
        };
        System.out.println(vaksin[rnum.nextInt(3)][rnum.nextInt(3)]);

    }
}
