package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {

    //주문하는 서비스
    public void order(){
        User user = new User(); //회원만듬
        Product product = new Product();//상품만듬
        Order order = new Order(user, product);//주문(회원이 상품을 주문함)
    }
}
