package soft.springexercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import soft.springexercise.models.Transaction;

import java.util.List;

public interface TransactionsRepo extends JpaRepository<Transaction, Long> {
        List<Transaction> findByName(String name);


}
