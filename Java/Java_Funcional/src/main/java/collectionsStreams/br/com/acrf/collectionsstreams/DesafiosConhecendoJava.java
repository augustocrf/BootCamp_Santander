package br.com.acrf.collectionsstreams;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class DesafiosConhecendoJava {

    /*
    public static void main(String[] args) throws IOException {
        String linha;
        Double n;
        int Pos, i;

        Pos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i=0; i < 6; i++) {
            linha = br.readLine();
            n = Double.parseDouble(linha);
            if(n > 0.0)Pos++;
        }

        System.out.println("" + Pos + " valores positivos");
    }
    */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] valores = new String[6];
        valores[0] = leitor.next();
        valores[1] = leitor.next();
        valores[2] = leitor.next();
        valores[3] = leitor.next();
        valores[4] = leitor.next();
        valores[5] = leitor.next();
        int x = 0;
        int cont = 0;

        while (x < 6 ) {
            if (!valores[x].isEmpty()) {
                if (Double.parseDouble(valores[x]) >= 0) {
                    cont++;
                }
            }
            x++;
        }
        System.out.println(cont + " valores positivos");
    }
      /*
    public static void main(String[] args) throws FileNotFoundException {
        Scanner leitor = new Scanner(System.in);
        String[] valores = new String[6];
        valores[0] = leitor.nextLine();
        valores[1] = leitor.nextLine();
        valores[2] = leitor.nextLine();
        valores[3] = leitor.nextLine();
        valores[4] = leitor.nextLine();
        valores[5] = leitor.nextLine();
        int x = 0;
        int cont = 0;

        while (x < 6 ) {
            if (Double.parseDouble(valores[x]) >= 0) {
                cont ++;
            }
            x++;
        }
        System.out.println(cont + "valores positivos");


        String input = "1 fish 2 fish red fish blue fish";
     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
     System.out.println(s.nextInt());
     System.out.println(s.nextInt());
     System.out.println(s.next());
     System.out.println(s.next());
     s.close();

     String input = "1 fish 2 fish red fish blue fish";
     Scanner s = new Scanner(input);
     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
     MatchResult result = s.match();
     for (int i=1; i<=result.groupCount(); i++)
         System.out.println(result.group(i));
     s.close();


        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

//continue a solucao de acordo com o solicitado no enunciado

        while (cont < 6 ) {
            if ( x % 2  == 1) {
                System.out.println(   x   );
                cont  ++;
            }
            x++;
        }

    }*/
}
