package soft.springexercise.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import soft.springexercise.servises.TransactionService;
@Controller
@RequiredArgsConstructor
public class TransactionControll {
    public final TransactionService transactionService;


    @GetMapping("/transactions")
    public String transactions(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("transactions", transactionService.listTransactions(name));
        return "transactions";
    }


    @PostMapping("/transaction/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        transactionService.deleteProduct(id);
        return "redirect:/";
    }

}
