package JSB.basic;
import JSB.bean.*;

public class Hellospring4App05 {
    //다섯번째 사례
    //factory 패턴을 이용해서 객체생성을 캡슐화 함
    //한편, 매개변수를 이용해서 생성할 객체의 취사선택함

    //객체 생성을 팩토리 패턴으로 구현해야 함
    //따라서 개발자가 신경써야 할 부분이 은연중에 추가됨
    //즉, 비지니스 로직 코드를 작성하는것도 버거운데
    // 객체 생성관련 클래스로 따로 작성하는것은 더욱 힘듦

    //해결 : 객체생성부분은 외부의 힘을 빌림
    //IoC 컨테이너가 객체를 생성하고 그것을 주입inject받음

    public static void main(String[] args) {
        HelloSpring4Been05Factory.create("kor").sayHello("스프링4!!");
        HelloSpring4Been05Factory.create("eng").sayHello("Spring4!!");
        HelloSpring4Been05Factory.create("jpn").sayHello("スプリング4!!");
    }
}
