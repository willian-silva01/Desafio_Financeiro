package Desafio_FullStack.demo.repository;

import Desafio_FullStack.demo.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
