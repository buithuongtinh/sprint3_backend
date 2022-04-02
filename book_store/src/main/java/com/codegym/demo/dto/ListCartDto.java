package com.codegym.demo.dto;

import java.util.List;

public class ListCartDto {
    List<CartDto> cartDtoList;

    public ListCartDto(List<CartDto> cartDtoList) {
        this.cartDtoList = cartDtoList;
    }

    public ListCartDto() {
    }

    public List<CartDto> getCartDtoList() {
        return cartDtoList;
    }

    public void setCartDtoList(List<CartDto> cartDtoList) {
        this.cartDtoList = cartDtoList;
    }
}
