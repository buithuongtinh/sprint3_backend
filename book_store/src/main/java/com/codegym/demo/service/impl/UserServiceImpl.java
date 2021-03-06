package com.codegym.demo.service.impl;


import com.codegym.demo.dto.CartDto;
import com.codegym.demo.model.Book;
import com.codegym.demo.model.User;
import com.codegym.demo.repository.IUserRepository;
import com.codegym.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return iUserRepository.findById(id);
    }

    @Override
    public CartDto save(User user) {
        iUserRepository.save(user);
        return null;
    }

    @Override
    public void remove(Long id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return iUserRepository.findAll();
    }
}
