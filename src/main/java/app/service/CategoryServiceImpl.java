package app.service;

import app.dao.CategoryDao;
import app.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    public Category addCategory(Category category) {
        return categoryDao.addCategory(category);
    }

    public List getAllCategories() {
        return categoryDao.getAllCategories();
    }

    @Override
    public Category getCategoryById(Long id) {

        return categoryDao.getCategoryById(id);
    }
}
