package JSB.basic;

import JSB.bean.Hellospring4Been04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring4App07 {
    //스프링 프레임워크를 사용하는 두번째 사례

    //라이브러리
    //spring-beans(repo.spring.io)
    //spring-core
    //spring-context
    //spring-expression
    //commons-logging (commons.apache.org)


    //스프링 프레임워크에서 제공하는 컨테이너는 2가지
    //BeanFactory
    //ApplicationContext


   public static void main(String[] args) {

       //스프링 컨테이너 관리를 받는 객체들이 정의된 설정파일 읽기
        ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "src/main/java/bean06.xml");

        //스프링 컨테이너를 통해 지정한 객체를 주입받음
        Hellospring4Been04 bean = (Hellospring4Been04) ctx.getBean("kor");
        bean.sayHello("스프링4");

        bean = (Hellospring4Been04) ctx.getBean("eng");
        bean.sayHello("Spring4");

        bean = (Hellospring4Been04) ctx.getBean("jpn");
        bean.sayHello("スプリング4");
    }
}
