package JSB.bean.anno;

import JSB.bean.Hellospring4Been04;
import org.springframework.stereotype.Component;

@Component("kor")
public class Hellospring4Been04Kor implements Hellospring4Been04 {
    //한국어로 인삿말을 출력하는 메서드
    @Override
    public void sayHello(String msg) {
        System.out.println("안녕하세요 " + msg);
    }
}