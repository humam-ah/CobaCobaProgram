package IfCondition;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner hasan = new Scanner(System.in);
        System.out.println("Input Password :");
        String password = hasan.nextLine();
        if (password.equals("javaclass")){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
}
