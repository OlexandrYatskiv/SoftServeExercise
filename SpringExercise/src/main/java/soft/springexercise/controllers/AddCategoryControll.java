package soft.springexercise.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import soft.springexercise.models.Category;
import soft.springexercise.servises.CategoryService;
@RequiredArgsConstructor
@Controller
public class AddCategoryControll {


    public final CategoryService categoryService;


    @GetMapping("/Category/createcategory")
    public String addcategory() {
        return "addCategory";
    }



    @PostMapping("/Category/createcategory")
    public String createProduct(Category product) {
        categoryService.saveProduct(product);
        return "redirect:/";
    }

}
