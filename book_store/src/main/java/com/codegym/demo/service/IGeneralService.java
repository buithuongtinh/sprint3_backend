package com.codegym.demo.service;

import com.codegym.demo.dto.CartDto;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    List<T> findAll();

    Optional<T> findById(Long id);

    CartDto save(T t);

    void remove(Long id);
}
