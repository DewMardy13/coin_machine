package com.asseco.challenge;

public class Utilizador {
    private int moedas;

    public Utilizador() {
        this.moedas = Config.MOEDAS_INICIAIS;
    }

    public int getMoedas() {
        return moedas;
    }

    public void inserirMoedas(int quantidade) {
        if (quantidade > 0) {
            moedas -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade de moedas a inserir deve ser positiva.");
        }
    }

    public void receberMoedas(int quantidade) {
        if (quantidade > 0) {
            moedas += quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade de moedas recebidas deve ser positiva.");
        }
    }
}
