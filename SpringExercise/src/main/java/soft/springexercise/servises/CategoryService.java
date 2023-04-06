package soft.springexercise.servises;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import soft.springexercise.models.Category;
import soft.springexercise.repo.CategoryRepo;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Component
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public List<Category> listCategories(String name) {
        if (name != null) return
                categoryRepo.findByName(name);
        return categoryRepo.findAll();
    }

    public void saveProduct( Category product) {

            log.info("Saving new {}", product);
            categoryRepo.save(product);

    }


    public void deleteProduct(Long id) {
        categoryRepo.deleteById(id);
    }

    public Category getProductById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }


}


