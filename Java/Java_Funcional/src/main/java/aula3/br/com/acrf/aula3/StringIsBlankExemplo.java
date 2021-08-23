package br.com.acrf.aula3;

public class StringIsBlankExemplo {
    public static void main(String[] args) {
        String espaco = "                                    ";
        System.out.println(espaco == null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' ')); //Versão antiga
        System.out.println(espaco.isBlank()); // java 11 jdk
    }

    public boolean eCompletamenteEmBranco(String espaco)
    {
        espaco.chars()
                .filter(c -> c != ' ');

        return true;
    }
}
