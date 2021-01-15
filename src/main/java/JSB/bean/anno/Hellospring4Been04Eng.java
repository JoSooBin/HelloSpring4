package JSB.bean.anno;

import JSB.bean.Hellospring4Been04;
import org.springframework.stereotype.Component;

@Component("eng")
public class Hellospring4Been04Eng implements Hellospring4Been04 {
    //영어로 인삿말을 출력하는 메서드
    @Override
    public void sayHello(String msg) {
        System.out.println("Hello " + msg);
    }
}