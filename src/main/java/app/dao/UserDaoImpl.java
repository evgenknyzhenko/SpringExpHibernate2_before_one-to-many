package app.dao;

import app.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;



    public User addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return getByName(user);
    }

    public User getByName(User user) {
        return sessionFactory.getCurrentSession()
                .createQuery("from User where name =: name1", User.class)
                .setParameter("name1", user.getName())
                .uniqueResult();
    }

    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession()
                .createQuery("from User", User.class).list();
    }

    public User getByName(String name) {
        return sessionFactory.getCurrentSession()
                .createQuery("from User where name =: name", User.class)
                .setParameter("name", name)
                .uniqueResult();
    }
}
