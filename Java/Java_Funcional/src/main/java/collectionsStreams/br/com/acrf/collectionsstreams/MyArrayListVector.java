package br.com.acrf.collectionsstreams;

/*
Implementações que aprenderemos
    java.util.ArrayList
    java.util.Vector

Garante ordem de inserção
Permite adicão, atualização, leitura e remoção sem regras adicionais
Permite ordenação através de comparators

 */

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayListVector {
    public static void main(String[] args) {
        exemploList();
    }

    private static void exemploList(){
        List<String> nomes = new ArrayList<>();
        nomes = crialist();
        System.out.println(nomes);

        int posicao = nomes.indexOf("João");
        System.out.println(posicao);

        // alterar o valor da Juliana
        nomes.set(2,"Larissa");

        posicao = nomes.indexOf("Juliana");
        System.out.println(posicao);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAugusto = nomes.contains("Augusto");
        System.out.println(temAugusto);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        nomes = crialist();

        // A forma mais imperativa é utilizando o for
        for (String nomeDoItem: nomes) {
            System.out.println("--> "+nomeDoItem);
        }

        // ou na forma de iterator com o while
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("----> "+iterator.next());
        }
    }

    private static List<String> crialist(){
        List<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Augusto");
        nomes.add("Juliana");
        nomes.add("Alfredo");
        nomes.add("Maria");
        nomes.add("João");

        return  nomes;
    }

}
