package soft.springexercise.controllers;
import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import soft.springexercise.servises.CategoryService;

@Controller
@RequiredArgsConstructor
public class CategoryControll {
    public final CategoryService categoryService;


    @GetMapping("/")
    public String products(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("products", categoryService.listCategories(name));
        return "products";
    }


    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        categoryService.deleteProduct(id);
        return "redirect:/";
    }


}


