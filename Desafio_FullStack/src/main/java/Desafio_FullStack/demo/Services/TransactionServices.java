package Desafio_FullStack.demo.Services;

import Desafio_FullStack.demo.dto.InvestimentoResponse;
import Desafio_FullStack.demo.dto.TransactionResquest;
import Desafio_FullStack.demo.model.Transaction;
import lombok.Getter;

import java.util.List;
import java.util.Optional;



public interface TransactionServices {

    InvestimentoResponse salvar(TransactionResquest resquest);

    List<InvestimentoResponse> listarTodos();  // Mantém só esse

    List<Transaction> getListResponseEntity(); // Esse aqui tudo bem manter

    Optional<Transaction> buscarPorID(Long id);



}



