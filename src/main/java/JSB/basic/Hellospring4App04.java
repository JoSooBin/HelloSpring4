package JSB.basic;
import JSB.bean.Hellospring4Been04;
import JSB.bean.Hellospring4Been04Eng;
import JSB.bean.Hellospring4Been04Jpn;
import JSB.bean.Hellospring4Been04Kor;

public class Hellospring4App04 {
    public static void main(String[] args) {
        //네번째 사례
        //인삿말을 한국어, 영어, 일본어로 출력하도록 기능 개선
        //인터페이스를 도입

        //확장성이 높고 유연한 코드를 작성할 수 있음
        //또한 객체간의 tightly coupled도 피할 수 있음
        //객체간의 의존성도 낮출수 있음

        //하지만, new 연산자로 객체를 생성하는 코드가 노출
        //다시말해, HelloSpring4Bean04는
        //Hellospring4Been04Kor, Hellospring4Been04Eng, Hellospring4Been04Jpn에 의존적이라는 의미임

        //해결 : factory패턴을 이용해서
        //객체생성을 전담하는 클래스를 만들어
        //객체 생성과정을 캡슐화 홤

        Hellospring4Been04 bean = new Hellospring4Been04Kor();
        bean.sayHello("스프링4!!");

        bean = new Hellospring4Been04Eng();
        bean.sayHello("Spring4!!");

        bean = new Hellospring4Been04Jpn();
        bean.sayHello("スプリング4!!");
    }
}
