package com.asseco.challenge.dto;

public class RespostaTransacaoDTO {
    private int leftPerson;
    private int rightPerson;

    public RespostaTransacaoDTO(int leftPerson, int rightPerson) {
        this.leftPerson = leftPerson;
        this.rightPerson = rightPerson;
    }

    public int getLeftPerson() {
        return leftPerson;
    }

    public void setLeftPerson(int leftPerson) {
        this.leftPerson = leftPerson;
    }

    public int getRightPerson() {
        return rightPerson;
    }

    public void setRightPerson(int rightPerson) {
        this.rightPerson = rightPerson;
    }
}