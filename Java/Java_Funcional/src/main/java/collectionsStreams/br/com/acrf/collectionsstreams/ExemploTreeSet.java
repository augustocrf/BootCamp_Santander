package br.com.acrf.collectionsstreams;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais = criaTreeSet();

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first());

        System.out.println(treeCapitais.last());

        System.out.println(treeCapitais.lower("Florianópolis"));

        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais);
    }

    public static TreeSet<String>  criaTreeSet(){
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        return treeCapitais;
    }
}
