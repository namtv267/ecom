package com.auth.services;

import com.auth.domain.entities.User;

import java.util.List;

public interface IUserService {
    User createUser(User user);
    List<User> getUsers();
    User getUserById(Long id);
    User updateUser(Long id, User user);

}
