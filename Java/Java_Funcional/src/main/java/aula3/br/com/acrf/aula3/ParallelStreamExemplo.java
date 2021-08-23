package br.com.acrf.aula3;

import java.io.PrintStream;

public class ParallelStreamExemplo {
    public static void main(String[] args) {
        System.out.printf("Erro");
    }

    public static long fatorial(long num){
        long fat = 0;
        for (long i = 2; i<= num ; i++){
            fat*=i;
        }
        return fat;
    }

}