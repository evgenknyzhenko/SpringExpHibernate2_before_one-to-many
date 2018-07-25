package app.service;


import app.dao.UserDao;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiseImpl implements UserServise {

    @Autowired
    private UserDao userDao;

    public User addUser(User user) {
        return userDao.addUser(user);
    }

    public User getByName(User user) {
        return userDao.getByName(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getByName(String name) {
        return userDao.getByName(name);
    }
}
