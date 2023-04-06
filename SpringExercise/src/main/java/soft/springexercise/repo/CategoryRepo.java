package soft.springexercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import soft.springexercise.models.Category;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    List<Category> findByName(String name);


}
