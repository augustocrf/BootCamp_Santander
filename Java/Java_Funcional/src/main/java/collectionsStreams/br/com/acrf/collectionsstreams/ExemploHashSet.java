package br.com.acrf.collectionsstreams;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Implementações que aprenderemos
    java.util.HashSet
    java.util.TreeSet
    java.util.LinkedHashSet (Pode perder a performace)

Por padrão, não garante ordem
Não permite itens repetidos
Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação.
Não permite mmudança de ordenação.

                            Quando utilizar                         Ordenação                       Performance

HashSet                     Quando não é necessário                 Não é ordenado, e não           Por não ter repetição de valores e não ser
                            manter uma ordenação                    permite valores repetidos       ordenado, é a implementação mais performatica.

LinkedHashSet               Quando é necessário manter a            Mantém a ordem de inserção      É a implementação mais lenta por ser
                            ordem de inserção dos elementos         dos elementos                   necessária manter a ordem

TreeSet                     Quando é necessário alterar a           Mantém ordem e pode ser         É performático para leitura. Para modificação tem
                            ordem através do uso de comparators     reordenado                      a necessidade de reordenar, sendo mais lento que o
                                                                                                    LinkedHashSet
 */
public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos = criaHashSet();

        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Double nota:notasAlunos){
            System.out.println("--> "+nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());


    }

    private static Set<Double> criaHashSet(){
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        return notasAlunos;
    }
}
