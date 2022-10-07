package com.company;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Introduza um número inteiro:");
        x = ler.nextInt();
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
            }
            else{
                x = x * 3 + 1;
            }
            System.out.println(x);
        }
    }
}