package in.vatsaryan.foodiesapi.service;

import in.vatsaryan.foodiesapi.io.CartRequest;
import in.vatsaryan.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
