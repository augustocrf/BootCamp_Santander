package br.com.acrf.digital.innovation.one.operacao.internal;

import br.com.acrf.digital.innovation.one.operacao.Operacao;

public class SumHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
