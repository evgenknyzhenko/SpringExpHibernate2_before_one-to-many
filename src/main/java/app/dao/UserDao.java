package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    User addUser(User user);

    User getByName(User user);

    List getAllUsers();

    User getByName(String name);
}
