package com.asseco.challenge;

import java.util.List;


public class IteratorM implements IteratorInterface {
    private List<Acao> acoes;
    private int posicao = 0;

    public IteratorM(List<Acao> acoes) {
        this.acoes = acoes;
    }

    @Override
    public boolean hasNext() {
        return posicao < acoes.size();
    }

    @Override
    public Acao next() {
        if (hasNext()) {
            return acoes.get(posicao++);
        }
        return null; 
    }
}
