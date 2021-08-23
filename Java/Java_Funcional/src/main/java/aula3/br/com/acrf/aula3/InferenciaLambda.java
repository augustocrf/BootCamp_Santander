package br.com.acrf.aula3;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer, Double> divicsaoPor2 = (var numero) -> numero / 2.0;

        System.out.println(divicsaoPor2.apply(15));
    }
}
