package Desafio_FullStack.demo.dto;

import Desafio_FullStack.demo.model.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
@Getter
@Setter
@AllArgsConstructor

public class InvestimentoResponse {

    private String nome;
    private String tipo;
    private double valor;
    private OffsetDateTime dataHora;

    public InvestimentoResponse(Transaction transaction) {

    }



}
