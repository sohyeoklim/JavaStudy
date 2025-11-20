package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectdValue = 1; //상속관계
        //defaultValue = 1; //다른 패키지라 안됨
        //privateValue = 1; private 이니까 안됨

        publicMethod();
        protectedMethod(); //상속관계
        //defaultMethod(); 안됨

        printParent();
    }
}
