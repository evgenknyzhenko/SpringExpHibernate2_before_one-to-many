package app.dao;

import app.model.Category;

import java.util.List;

public interface CategoryDao {
    Category addCategory(Category category);

    List getAllCategories();

    Category getCategoryById(Long id);
}
