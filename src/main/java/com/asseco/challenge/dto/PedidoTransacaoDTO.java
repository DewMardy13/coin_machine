package com.asseco.challenge.dto;

import java.util.List;

public class PedidoTransacaoDTO {
    private List<String> leftPerson;
    private List<String> rightPerson;

    public List<String> getLeftPerson() {
        return leftPerson;
    }

    public void setLeftPerson(List<String> leftPerson) {
        this.leftPerson = leftPerson;
    }

    public List<String> getRightPerson() {
        return rightPerson;
    }

    public void setRightPerson(List<String> rightPerson) {
        this.rightPerson = rightPerson;
    }
}