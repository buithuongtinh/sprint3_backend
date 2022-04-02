package com.codegym.demo.service;

import com.codegym.demo.model.OrderDetail;

public interface OderDetailService extends IGeneralService<OrderDetail> {
    OrderDetail saveOrderDetail(OrderDetail orderDetail);

}
