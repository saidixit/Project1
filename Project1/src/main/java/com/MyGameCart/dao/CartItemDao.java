package com.MyGameCart.dao;


import com.MyGameCart.model.Cart;
import com.MyGameCart.model.CartItem;

public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
