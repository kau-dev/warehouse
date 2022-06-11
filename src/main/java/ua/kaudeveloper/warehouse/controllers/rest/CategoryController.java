package ua.kaudeveloper.warehouse.controllers.rest;

import ua.kaudeveloper.warehouse.models.category.Category;
import ua.kaudeveloper.warehouse.models.category.CategoryDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/category/get-all")
    public List<Category> getAllCategorys() {
        return categoryDao.getAllCategorys();
    }

    @PostMapping("/category/save")
    public Category save(@RequestBody Category category) {
        return categoryDao.save(category);
    }

    @GetMapping("/category/count")
    public Long count() {
        return categoryDao.count();
    }

    @PostMapping("/category/deleteById")
    public boolean deleteById(@RequestBody int categoryId) {
        return categoryDao.deleteById(categoryId);
    }

    @PostMapping("/category/findById")
    public Optional<Category> findById(@RequestBody int categoryId) {
        return categoryDao.findById(categoryId);
    }

    @GetMapping("/category/deleteAll")
    public void deleteAll() {
        categoryDao.deleteAll();
    }
}