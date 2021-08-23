package br.com.acrf.collectionsstreams;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica = criaLinkedHashSet();

        System.out.println(sequenciaNumerica);
    }

    public static  LinkedHashSet<Integer> criaLinkedHashSet(){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        return sequenciaNumerica;
    }
}
