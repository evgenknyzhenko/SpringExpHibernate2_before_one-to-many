package app.service;

import app.model.User;

import java.util.List;

public interface UserServise {
    User addUser(User user);

    User getByName(User user);

    List<User> getAllUsers();

    User getByName(String name);
}
