package Desafio_FullStack.demo.Services;

import Desafio_FullStack.demo.dto.InvestimentoResponse;
import Desafio_FullStack.demo.dto.TransactionResquest;
import Desafio_FullStack.demo.model.Transaction;
import Desafio_FullStack.demo.repository.TransactionRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@Setter

@Service
public class TransactionServiceImp implements TransactionServices {

    @Autowired
    private TransactionRepository repository;

    @Override
    public InvestimentoResponse salvar(TransactionResquest resquest){
        Transaction transaction = new Transaction();
        transaction.setNome(resquest.getNome());
        transaction.setTipo(resquest.getTipo());
        transaction.setValor(BigDecimal.valueOf(resquest.getValor()));
        transaction.setDataHora(resquest.getDataHora().toLocalDateTime());

        transaction = repository.save(transaction);

        return new InvestimentoResponse (transaction);

    }

    @Override
        public List<InvestimentoResponse> listarTodos() {
                return repository.findAll().stream()
                        .map(InvestimentoResponse::new)
                        .collect(Collectors.toList());

        }

    @Override
    public List<Transaction> getListResponseEntity() {
        return List.of();
    }

    @Override
    public Optional<Transaction> buscarPorID(Long id) {
        return repository.findById(id);
    }

}
