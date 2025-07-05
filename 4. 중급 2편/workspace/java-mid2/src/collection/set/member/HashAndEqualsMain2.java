package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        //중복등록
        MyHashSetV2 set = new MyHashSetV2(10);
        //아이디가 같은회원
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        System.out.println();

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1));//hashCode() 값(= 참조값 기반) 을 반환
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));
        System.out.println();


        set.add(m1);
        set.add(m2);
        System.out.println(set);
        System.out.println();

        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains); //검색도 실패
    }
}
