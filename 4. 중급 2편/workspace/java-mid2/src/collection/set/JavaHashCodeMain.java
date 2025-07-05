package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode()는 객체의 참조값을 기반으로 생성, 따라서 각각의 인스턴스마다 서로 다른 값을 반환한다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode()); //객체의 참조값을 가지고 hashCode로 써버린다
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj1 = " + obj1);
        System.out.println("16진수 문자열로 전환 = " + Integer.toHexString(obj1.hashCode())); //10진수 정수를 16진수 문자열로 반환
        System.out.println();

        //각 클래스마다 hashCode를 이미 오버라이딩(재정의) 해두었다
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());
        System.out.println();

        //HashCode는 마이너스 값이 들어올 수 있다
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());
        System.out.println();

        //둘은 같을까? 다를까?, 인스턴스는 다르지만 equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));          //false 참조값이 다르기 떄문에 다르다
        System.out.println("(member1 equals member2) = " + (member1.equals(member2))); //true id 값이 같기 떄문에 같다
        System.out.println("member1.hashCode() = " + member1.hashCode()); //member1, member2 같은 해시 코드를 반환
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
