package br.com.acrf.aula3;

public class StringRepeat {
    public static void main(String[] args) {
        String nome = "Augusto";
        String aux = "";

        for (int i = 0; i<10; i++){
            aux+=nome;
        }
        System.out.println(aux);

        // jdk 11
        String nomeRepeat = "Augusto ";
        System.out.printf(nomeRepeat.repeat(10));
    }
}
