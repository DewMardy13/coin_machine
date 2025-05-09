package com.asseco.challenge;

import java.util.List;

public class Maquina {
    private Utilizador leftPerson;
    private Utilizador rightPerson;

    public Maquina(Utilizador leftPerson, Utilizador rightPerson) {
        this.leftPerson = leftPerson;
        this.rightPerson = rightPerson;
    }

    public void processarTransacoes(List<Acao> leftAcoes, List<Acao> rightAcoes) {
        if (leftAcoes == null || rightAcoes == null || leftAcoes.isEmpty() || rightAcoes.isEmpty()) {
            throw new IllegalArgumentException("as listas de ações não podem ser nulas ou vazias");
        }
        //poderia ter utilizado o Iterator padrão, mas como o IteratorM é uma implementação própria, optei por utilizá-lo
        // Iterator<Acao> leftIterator = leftAcoes.iterator();
        // Iterator<Acao> rightIterator = rightAcoes.iterator();

        IteratorInterface leftIterator = new IteratorM(leftAcoes);
        IteratorInterface rightIterator = new IteratorM(rightAcoes);
        while (leftIterator.hasNext() || rightIterator.hasNext()) {
            Acao leftAction = leftIterator.hasNext() ? leftIterator.next() : null;
            Acao rightAction = rightIterator.hasNext() ? rightIterator.next() : null;

            if (leftAction != null && leftAction == Acao.P) {
                leftPerson.inserirMoedas(Config.MOEDAS_POR_INSERCAO);
                rightPerson.receberMoedas(Config.MOEDAS_RECEBIDAS);
            }

            if (rightAction != null && rightAction == Acao.P) {
                rightPerson.inserirMoedas(Config.MOEDAS_POR_INSERCAO);
                leftPerson.receberMoedas(Config.MOEDAS_RECEBIDAS);
            }
        }
    }
}
