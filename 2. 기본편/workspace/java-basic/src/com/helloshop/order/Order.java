package com.helloshop.order;

//핵심은 다른 패키지를 사용한다는것임
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    User user; //주문한 사용자
    Product product; //주문한 상품정보

    //생성자
    //public이 붙어야 다른 패키지에서 Order를 호출 할수 있음
    //주문하는 사용자 주문하는 대상
    public Order(User user, Product product){
        this.user = user; //주문대상
        this.product = product; //주문 상품정보
    }
}
