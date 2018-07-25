package app.service;

import app.model.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);

    List getAllCategories();

    Category getCategoryById(Long id);
}
