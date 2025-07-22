package collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member); //key를 회원아이디, 값을 회원 자체를 넣어준다
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        // 코드 작성
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        // 코드 작성
        Collection<Member> values = memberMap.values(); //value인 Member 객체들만 출력
        System.out.println("values= " + values);        //[Member{id='id2', name='회원2'}, Member{id='id1', name='회원1'}, Member{id='id3', name='회원3'}]

        for (Member member : values) {                  //회원 하나 하나 꺼낸다
            System.out.println("member= " + member);    //Member{id='id2', name='회원2'}
            if (member.getName().equals(name)) {        //member.getName() :현재 Member 객체의 이름 가져오기 //.equals(name): 찾고 있는 이름과 같은지 비교
                return member;                          //같으면 Member 객체를 리턴한다
            }
        }
        return null;
    }
}
