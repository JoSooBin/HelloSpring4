package JSB.basic;

import JSB.bean.Hellospring4Been04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring4App12 {

   public static void main(String[] args) {

       //스프링 컨테이너 관리를 받는 객체들이 정의된 설정파일 읽기
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "bean11.xml");

        //스프링 컨테이너를 통해 지정한 객체를 주입받음
        Hellospring4Been04 bean = (Hellospring4Been04) ctx.getBean("kor");
        bean.sayHello("스프링4");

        bean = (Hellospring4Been04) ctx.getBean("eng");
        bean.sayHello("Spring4");

        bean = (Hellospring4Been04) ctx.getBean("jpn");
        bean.sayHello("スプリング4");
    }
}
