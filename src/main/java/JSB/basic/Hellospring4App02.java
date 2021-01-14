package JSB.basic;
import JSB.bean.Hellospring4Been02;
public class Hellospring4App02 {
    //두번째 사례
    //외부 클래스를 통해 인삿말을 출력하는 기능 구현
    //인삿말을 출력하려면 외부 클래스를 객체화한 뒤
    //sayHello메서드 호출

    //한편 HelloSpring4App02를 하려면
    //HelloSpring4Bean02라는 클래스가 있어야 함
    //즉, 클래스간의 의존성이 생김.
    //의존성이 커짐으로서 발생하는 부수적인 단점은 코드변경시 그것과 연관되는 다른 클래스에도 영향 미침


    public static void main(String[] args) {
        Hellospring4Been02 bean = new Hellospring4Been02();
        bean.sayHello("World!!");
    }
}
