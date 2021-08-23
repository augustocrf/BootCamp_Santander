package br.com.acrf.collectionsstreams;

import java.util.HashMap;
import java.util.Map;

/*
Implementações que aprenderemos
    java.util.HashMap
    java.util.TreeMap
    java.util.HashTable

Entrada de chave e valor
Permite valores repedidos, mas não permite repetição de chave.
Permite adição, busca por chave ou valor, atualização, remoção e navegação.
Pode ser ordenado.

 */
public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa = criaHashMap();

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil",6);

        System.out.println(campeoesMundialFifa);

        System.out.println(campeoesMundialFifa.get("Argentina"));

        System.out.println(campeoesMundialFifa.containsKey("França"));

        campeoesMundialFifa.remove("França");

        System.out.println(campeoesMundialFifa.containsValue(2));

        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " -- "+ entry.getValue());
        }

        for (String key : campeoesMundialFifa.keySet()){
            System.out.println(key+" -- "+campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));


    }

    private static Map<String, Integer> criaHashMap(){
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Itália",4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Inglaterra",1);
        campeoesMundialFifa.put("Espanha",1);

        return campeoesMundialFifa;
    }
}
