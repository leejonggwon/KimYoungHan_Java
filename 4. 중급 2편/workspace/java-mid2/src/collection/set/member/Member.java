package collection.set.member;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //객체끼리 비교할 때, ‘id 값이 같으면 같은 회원이다’ 라고 규칙을 정하기 위해
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    //hashCode: 자바는 Object에 있는 hashCode 메서드로 모든 객체가 자신만의 해시 코드를 표현할 수 있는 기능을 제공한다.
    @Override
    public int hashCode() {
        return Objects.hash(id); //해시코드를 만드는 유틸리티
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
