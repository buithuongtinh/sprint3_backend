package com.codegym.demo.service;


import com.codegym.demo.model.Book;
import com.codegym.demo.model.User;

import java.util.List;

public interface IUserService extends IGeneralService<User> {
    List<User> getAll();
}
