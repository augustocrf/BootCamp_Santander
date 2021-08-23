package br.com.acrf.aula3;

public class ThreadExemplo {

    public static void main(String[] args) {
        GerarPDF gerarpdf = new GerarPDF();
        gerarpdf.run();

        BarraDeCarregamento barradecarregamento = new BarraDeCarregamento();
        barradecarregamento.run();
    }
}

class GerarPDF implements Runnable {
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run(){
        System.out.println("Loading ...");
    }
}