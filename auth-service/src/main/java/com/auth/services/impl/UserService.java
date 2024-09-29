package com.auth.services.impl;

import com.auth.domain.entities.User;
import com.auth.domain.exception.NoSuchUserExistsException;
import com.auth.repositories.IUserRepository;
import com.auth.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchUserExistsException::new);
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }
}
