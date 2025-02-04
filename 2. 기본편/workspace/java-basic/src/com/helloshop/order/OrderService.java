package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

//주문하는 비즈니스 로직
public class OrderService {

    public void order(){
        User user = new User(); //회원만듬
        Product product = new Product();//상품만듬
        Order order = new Order(user, product);//주문(회원이 상품을 주문함)
    }
}
