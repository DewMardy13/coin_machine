package com.asseco.challenge.controlador;

import com.asseco.challenge.*;
import com.asseco.challenge.dto.PedidoTransacaoDTO;
import com.asseco.challenge.dto.RespostaTransacaoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControladorMoedas {

    @PostMapping("/coins")
    public RespostaTransacaoDTO processarTransacoes(@RequestBody PedidoTransacaoDTO pedido) {
        List<Acao> acoesEsquerda = converterParaAcoes(pedido.getLeftPerson());
        List<Acao> acoesDireita = converterParaAcoes(pedido.getRightPerson());

        Utilizador utilizadorEsquerda = new Utilizador();
        Utilizador utilizadorDireita = new Utilizador();

        Maquina maquina = new Maquina(utilizadorEsquerda, utilizadorDireita);
        maquina.processarTransacoes(acoesEsquerda, acoesDireita);

        return new RespostaTransacaoDTO(utilizadorEsquerda.getMoedas(), utilizadorDireita.getMoedas());
    }

    private List<Acao> converterParaAcoes(List<String> lista) {
        List<Acao> resultado = new ArrayList<>();
        for (String acao : lista) {
            resultado.add(Acao.valueOf(acao));
        }
        return resultado;
    }
}
