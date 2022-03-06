package com.codegym.demo.repository;


import com.codegym.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBookRepository extends JpaRepository<Book,Long> {

    @Query(value = "SELECT * FROM book WHERE`name` LIKE :name ORDER BY issue DESC ", nativeQuery = true)
    Page<Book> findAllBook(@Param("name") String name, Pageable pageable);
}
