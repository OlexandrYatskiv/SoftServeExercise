package soft.springexercise.servises;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import soft.springexercise.models.Category;
import soft.springexercise.models.Transaction;
import soft.springexercise.repo.CategoryRepo;
import soft.springexercise.repo.TransactionsRepo;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Component
public class TransactionService {

    private final TransactionsRepo transactionsRepo;
    public List<Transaction> listTransactions(String name) {
        if (name != null) return
                transactionsRepo.findByName(name);
        return transactionsRepo.findAll();
    }

    public void saveProduct( Transaction product) {

        log.info("Saving new {}", product);
        transactionsRepo.save(product);

    }


    public void deleteProduct(Long id) {
        transactionsRepo.deleteById(id);
    }

    public Transaction getProductById(Long id) {
        return transactionsRepo.findById(id).orElse(null);
    }


}
