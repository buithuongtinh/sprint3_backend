package com.codegym.demo.repository;


import com.codegym.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
