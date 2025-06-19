package Desafio_FullStack.demo.Controller;

import Desafio_FullStack.demo.Services.TransactionServices;
import Desafio_FullStack.demo.dto.InvestimentoResponse;
import Desafio_FullStack.demo.dto.TransactionResquest;
import Desafio_FullStack.demo.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class  TransactionController {

    @Autowired
    private TransactionServices transactionServices;

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id) {
        return transactionServices.buscarPorID(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    // POST - Salvar
    @PostMapping
    public ResponseEntity<InvestimentoResponse> createTransaction(@RequestBody TransactionResquest request) {
        return ResponseEntity.ok(transactionServices.salvar(request));
    }

    @GetMapping("/entidades")
    public ResponseEntity<List<InvestimentoResponse>> getListResponseEntity() {
        List<InvestimentoResponse> lista = transactionServices.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build(); // Ou notFound(), se preferir
        }
        return ResponseEntity.ok(lista);
    }


}
