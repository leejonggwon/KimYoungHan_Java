package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //중복등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A"); //hashCode(), equals() 모두 오버라이딩
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        System.out.println();


        set.add(m1);
        set.add(m2);
        System.out.println(set);
        System.out.println();

        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains); //검색도 실패
    }
}
