package com.asseco.challenge;

import java.util.List;


public class AgregadoAcoesUser implements AgregadoAcoes {
     private List<Acao> acoes;

    public AgregadoAcoesUser(List<Acao> acoes) {
        this.acoes = acoes;
    }

    @Override
    public IteratorM createIterator() {
        return new IteratorM(acoes);
    }
}
