package com.company;

public class Main {

    public static void main(String[] args) {

        int i,fatorial = 1,fib = 0,fibo = 1,ante = 0;
        //ex1
        System.out.println("\nEx1:\n");
        for(i = 100;i <= 200;i++){
            System.out.println(i);
        }
        //ex2
        System.out.println("\nEx2:\n");
        for(i = 1;i <= 1000;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        //ex3
        System.out.println("\nEx3:\n");
        for(i = 1;i <= 100;i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
        //ex4
        System.out.println("\nEx4:\n");
        for(i = 1;i <= 6;i++){
            fatorial*=i;
            System.out.println(fatorial);
        }
        //ex5
        System.out.println("\nEx5:\n");
        System.out.println("0\n1");
        while(fib < 50){
            fib = fibo + ante;
            System.out.println(fib);
            ante = fibo;
            fibo = fib;
        }
    }
}
