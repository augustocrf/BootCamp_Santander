package br.com.acrf.collectionsstreams;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes = criarVector();

        System.out.println(esportes);

        // Altera o valor da posição 2 do vetor
        esportes.set(2,"Ping Pong");

        esportes.remove(2);

        esportes.remove("Handebol");

        System.out.println(esportes.get(0));

        for (String esporte: esportes){
            System.out.println(esporte);
        }
    }

    private  static List<String> criarVector(){
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        return esportes;
    }

}
