package extend1.acess.child;

import extend1.acess.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속 관게 or 같은 패키지 경우 접근 가능
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateVaule = 1 ; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속 관게 or 같은 패키지 경우 접근 가능
        //defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent(); //public 이므로 모두 호출가능
    }
}
