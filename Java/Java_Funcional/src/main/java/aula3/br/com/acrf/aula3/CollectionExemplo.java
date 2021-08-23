package br.com.acrf.aula3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {
    public static void main(String[] args) {
        /*List<String> nomes = Arrays.asList("João","Paulo","Oliveira", "Santos");

        System.out.println(nomes);*/

        //Collection<String> nomes = Arrays.asList("João","Paulo","Oliveira", "Santos");
        Collection<String> nomes = Set.of("João","Paulo","Oliveira", "Santos"); //Novo JDK 11

        System.out.println(nomes);
    }
}
