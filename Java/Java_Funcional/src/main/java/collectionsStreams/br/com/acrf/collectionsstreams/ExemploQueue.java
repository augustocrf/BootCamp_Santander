package br.com.acrf.collectionsstreams;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 Implementações que aprenderemos
    java.util.LinkedList

 Garante ordem de inserção
 Permite adição, leitura e remoção considerando a regra
 básica de uma fila: Primeiro que entra, primeiro que sai (FIFO)

 Não permite mudança de ordenção
 */
public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco = criaQueue();

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        //filaBanco.clear(); // Limpa a fila

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        String primerioClienteOuErro = filaBanco.element(); // Se a lista estiver vazia estora um erro

        System.out.println(primerioClienteOuErro);

        System.out.println(filaBanco);

        filaBanco = criaQueue();

        for (String cliente: filaBanco){
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("--> "+iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());
        System.out.println("Wesley");
        System.out.println(filaBanco);

    }

    private static Queue<String> criaQueue(){
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Augusto");

        return  filaBanco;
    }
}
