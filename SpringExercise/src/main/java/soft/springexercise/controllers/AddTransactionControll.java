package soft.springexercise.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import soft.springexercise.models.Transaction;
import soft.springexercise.servises.TransactionService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class AddTransactionControll {


    public final TransactionService transactionService;

    @GetMapping("/transaction/create/edit")
    public String transactions(String name, Model model) {
        model.addAttribute("transactions",transactionService.listTransactions(name));
        return "addTransaction";
    }


    @GetMapping("/transaction/create")
    public String addtransaction() {
        return "addTransaction";
    }


    @PostMapping("/Transaction/create")
    public String createProduct(Transaction product) {
        transactionService.saveProduct(product);
        return "redirect:/transactions";
    }

}
