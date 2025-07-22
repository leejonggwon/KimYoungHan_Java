package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int addQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0); //기존에 아무것도 없는 경우 //없으면 누락이 안되고 덮어쓰기 된다
        cartMap.put(product, existingQuantity + addQuantity); //HashMap 의 Key는 Set 구조 이므로 equals() and hashCode()가 적용된다
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) { // 기존 갯 수 - 지울 갯 수 = 0 이거나 0 보다 작으면 모두 삭제
            cartMap.remove(product);
        }
        else {
            cartMap.put(product, newQuantity); // 기존 갯 수 지울 갯 수 가 크면 뺀 값을 입력
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
