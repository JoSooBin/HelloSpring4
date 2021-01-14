package JSB.basic;
import JSB.bean.Hellospring4Been02;
import JSB.bean.Hellospring4Been03;

public class Hellospring4App03 {
    public static void main(String[] args) {
        //세번째 사례
        //인삿말을 한국어, 영어, 일본어로 출력하도록 기능 개선
        //해당기능을 제각각의 이름으로 호출하는 경우 지나치게 복잡해지고 기능에 따라
        // 이름을 일일이 외워야한다는 불편함이 존재함

        //인터페이스를 도입해서 개선해 봄

        Hellospring4Been03 bean = new Hellospring4Been03();
        bean.sayHelloKor("스프링4!!");
        bean.sayHelloEng("Spring4!!");
        bean.sayHelloJap("スプリング4!!");
    }
}
