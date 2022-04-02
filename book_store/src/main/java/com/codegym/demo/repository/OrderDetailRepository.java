package com.codegym.demo.repository;

import com.codegym.demo.model.Book;
import com.codegym.demo.model.OrderDetail;
import com.codegym.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

//    @Modifying
//    @Transactional
//    @Query(value = "insert into order_detail(id,order_date,quantity,total_money,book_id,user_id) " +
//            "values(?1,?2,?3,?4,?5,?6) ", nativeQuery = true)
//    void saveOrderBookDto(Long Id, String orderDate , Integer quantity, String totalMoney, User user, Book books);


}
