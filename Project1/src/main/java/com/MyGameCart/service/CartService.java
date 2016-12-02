package com.MyGameCart.service;

import com.MyGameCart.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
