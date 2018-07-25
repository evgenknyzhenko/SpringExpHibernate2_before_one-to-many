package app.dao;

import app.model.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Category addCategory(Category category) {
        sessionFactory.getCurrentSession().save(category);
        return getCategoryById(category.getId());
    }

    public List getAllCategories() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category", Category.class).list();
    }

    private Category getCategoryById(Long id) {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category where Id =:Id", Category.class)
                .setParameter("Id", id)
                .uniqueResult();
    }
}
