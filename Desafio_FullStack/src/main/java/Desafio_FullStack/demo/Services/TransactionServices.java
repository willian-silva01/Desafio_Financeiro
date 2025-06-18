package Desafio_FullStack.demo.Services;

import Desafio_FullStack.demo.dto.InvestimentoResponse;
import Desafio_FullStack.demo.dto.TransactionResquest;

import java.util.List;

public interface TransactionServices {

    InvestimentoResponse salvar(TransactionResquest resquest);
    List<InvestimentoResponse> listaTodos();


    List<InvestimentoResponse> listarTodos();
}



