package com.codegym.demo.service.impl;


import com.codegym.demo.model.Role;
import com.codegym.demo.repository.IRoleRepository;
import com.codegym.demo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository iRoleRepository;

    @Override
    public List<Role> findAll() {
        return iRoleRepository.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Role role) {

    }

    @Override
    public void remove(Long id) {

    }
}
