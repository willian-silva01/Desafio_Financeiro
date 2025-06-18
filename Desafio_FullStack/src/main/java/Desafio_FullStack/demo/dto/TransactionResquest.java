package Desafio_FullStack.demo.dto;

import lombok.Getter;

import lombok.Setter;

import java.time.OffsetDateTime;
@Getter
@Setter
public class TransactionResquest {

    public String nome;
    public String tipo;
    public double valor;
    public OffsetDateTime dataHora;

}
